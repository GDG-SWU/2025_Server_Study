package hello.hello_spring.controller;

public class MemberForm {
    private String name;

    // getName으로 꺼냄
    public String getName() {
        return name;
    }

    // setter를 통해서 사용자가 입력한 name이 들어옴
    public void setName(String name) {
        this.name = name;
    }
}
