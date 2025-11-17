package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {

    //별도의 데이터베이스(DB)를 설정하거나 연결하는 복잡한 과정 없이, 애플리케이션의 메모리에 데이터를 저장하기 위해 사용됨
    //특징 : 서버를 재시작하면 해당 데이터는 다 사라짐
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

}
