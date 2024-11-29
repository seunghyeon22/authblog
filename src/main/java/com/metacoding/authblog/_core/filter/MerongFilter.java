package com.metacoding.authblog._core.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class MerongFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MerongFilter");
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
