package gapsu.gapsu_spring.service;

import gapsu.gapsu_spring.aop.TimeTraceAop;
import gapsu.gapsu_spring.repository.JdbcTemplateMemberRepository;
import gapsu.gapsu_spring.repository.JpaMemberRepository;
import gapsu.gapsu_spring.repository.MemberRepository;
import gapsu.gapsu_spring.repository.MemoryMemberRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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
    // @Bean
    // public MemberRepository memberRepository() {
    // return new JpaMemberRepository(em);
    //}
}
