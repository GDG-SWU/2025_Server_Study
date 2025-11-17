package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//Impl : 관례같은것, 구현체가 하나만 있을 때는 Impl이라고 붙여줌
public class MemberServiceImpl implements MemberService {
    //memberRepository까지만 쓰면 인터페이스라서 안됨. 구현체인 MemoryMemberRepository를 받아야함
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        //join에서 save를 호출하면 다형성에 의해서 MemoryMemberRepository에 있는 save가 호출됨
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
