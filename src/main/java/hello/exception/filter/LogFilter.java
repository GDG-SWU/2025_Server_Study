package hello.exception.filter;

import lombok.extern.slf4j.Slf4j;
import jakarta.servlet.Filter; // <--- jakarta로 변경
import jakarta.servlet.FilterChain; // <--- jakarta로 변경
import jakarta.servlet.FilterConfig; // <--- jakarta로 변경
import jakarta.servlet.ServletException; // <--- jakarta로 변경
import jakarta.servlet.ServletRequest; // <--- jakarta로 변경
import jakarta.servlet.ServletResponse; // <--- jakarta로 변경
import jakarta.servlet.http.HttpServletRequest; // <--- jakarta로 변경
import jakarta.servlet.http.HttpServletResponse; // <--- jakarta로 변경
import java.io.IOException;
import java.util.UUID;

@Slf4j
public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("log filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();
        String uuid = UUID.randomUUID().toString();

        try {
            log.info("REQUEST [{}][{}][{}]", uuid, httpRequest.getDispatcherType(), requestURI);
            chain.doFilter(request, response);
        } catch (Exception e) {
            throw e;
        } finally {
            log.info("RESPONSE [{}][{}][{}]", uuid, httpRequest.getDispatcherType(), requestURI);
        }
    }

    @Override
    public void destroy() {
        log.info("log filter destroy");
    }
}