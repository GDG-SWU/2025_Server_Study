package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //member 패키지부터 그 하위패키지까지 찾는 것
        basePackages = "hello.core.member",
        //AutoAppConfig 클래스의 패키지부터 찾는 것
        basePackageClasses = AutoAppConfig.class,
        //컴포넌트 스캔을 사용하면 @Configuration이 붙은 설정 정보도 자동 등록되기 때문에 기존 예제코드는 제외를 시킴
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes=Configuration.class)
)
//기존 예제와 달리 @Bean으로 등록한 클래스가 없음
public class AutoAppConfig {
}
