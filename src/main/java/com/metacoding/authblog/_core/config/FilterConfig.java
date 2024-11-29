package com.metacoding.authblog._core.config;

import com.metacoding.authblog._core.filter.AuthenticationFilter;
import com.metacoding.authblog._core.filter.MerongFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {

        @Bean // 빈으로 등록하면 리턴값이 IoC 등록
        public FilterRegistrationBean addAuthFilter() {
            FilterRegistrationBean rg = new FilterRegistrationBean();
            rg.setFilter(new AuthenticationFilter()); // 필터를 등록
            rg.addUrlPatterns("/board/*");  // 필터를 실행할 uri 패턴
            rg.addUrlPatterns("/user/*");
            rg.setOrder(1); // filter의 실행 순서
            return rg;
        }
        @Bean
        public FilterRegistrationBean addAuthFilter2() {
            FilterRegistrationBean rg = new FilterRegistrationBean();
            rg.setFilter(new MerongFilter());
            rg.addUrlPatterns("/*");
            rg.setOrder(2);
            return rg;
        }
}
