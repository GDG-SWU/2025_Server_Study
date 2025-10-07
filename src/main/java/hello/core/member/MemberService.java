package hello.core.member;

public interface MemberService {
    //회원 서비스 기능 : 1. 회원가입 2. 회원조회
    void join(Member memeber);

    Member findMember(Long memberId);
}
