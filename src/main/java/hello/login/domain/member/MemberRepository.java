package hello.login.domain.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); //static 사용
    private static long sequence = 0L; //static 사용

    public Member save(Member member) {
        member.setId(++sequence);
        log.info("save member " + member);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public Optional<Member> findByLoginId(String loginId) {
        return findAll().stream()
                .filter(m->m.getLoginId().equals(loginId)) //로그인 아이디랑 같으면 findFirst로 넘어감
                .findFirst();

        /* 위의 3줄이 이렇게 돌아간다 ~
        List<Member> all = findAll();
        for (Member m : all) {
            if (m.getLoginId().equals(loginId)) {
                return Optional.of(m);
            }
        }
        return Optional.empty(); //null 반환 대신 Optional.empty()로 씀 */
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}
