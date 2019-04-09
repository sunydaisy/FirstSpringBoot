package com.example.demo.config;

import java.io.ByteArrayOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CachingRequestWrapper extends HttpServletRequestWrapper{
	
	private final ByteArrayOutputStream cachedContent;

	public CachingRequestWrapper(HttpServletRequest request) {
		super(request);
		int contentLength = request.getContentLength();
		this.cachedContent = new ByteArrayOutputStream(contentLength >= 0 ? contentLength : 1024);
	}

	public ByteArrayOutputStream getCachedContent() {
		return cachedContent;
	}

}
