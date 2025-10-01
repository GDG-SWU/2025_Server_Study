package hello2.hello_spring2;

import hello2.hello_spring2.aop.TimeTraceAop;
import hello2.hello_spring2.controller.MemberController;
import hello2.hello_spring2.repository.*;
import hello2.hello_spring2.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
//import hello2.hello_spring2.repository.JdbcMemberRepository;
import hello2.hello_spring2.repository.MemberRepository;
import hello2.hello_spring2.repository.MemoryMemberRepository;
import hello2.hello_spring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }

//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
