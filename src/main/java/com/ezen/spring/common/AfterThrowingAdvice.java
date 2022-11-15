package com.ezen.spring.common;

public class AfterThrowingAdvice {
	public void afterThrowingMethod() {
		System.out.println("[예외 처리] 비즈니스 로직 에러 발생 시 동작");
	}
}
