package com.example.demo.config;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@WebFilter(urlPatterns = "/")
@Slf4j
public class WebSecurityFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		CachingRequestWrapper req = new CachingRequestWrapper((HttpServletRequest) request);
		HttpServletResponse resp = (HttpServletResponse) response;
		crossDomain(resp);
		log.info("------filter-request-uri:" + req.getRequestURI());
		chain.doFilter(req, response);
	}
	

	private void crossDomain(HttpServletResponse resp){
		resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Headers",  "Content-Type");
        resp.setHeader("Access-Control-Allow-Methods","POST, GET, PUT, OPTIONS, DELETE, PATCH");
	}

}
