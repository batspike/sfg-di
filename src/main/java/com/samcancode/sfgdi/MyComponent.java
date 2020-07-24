package com.samcancode.sfgdi;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	public String sayHello() {
		System.out.print("Saying....");
		return "...hello!";
	}
}
