package com.samcancode.sfgdi;

import org.springframework.stereotype.Component;

@Component
public class MyComponent implements MyInterface {
	public String sayHello() {
		System.out.print("Saying....");
		return "...hello!";
	}
}
