package hello.core.member;

public class Member {
    //회원의 3가지 속성
    private Long id;
    private String name;
    private Grade grade;

    //Alt+Ins : Generate -> Constructure 해서 모두 선택 (생성자 만들기)
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Alt+Ins : Generate -> Getter and Setter 해서 모두 선택 (게터세터 만들기)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
