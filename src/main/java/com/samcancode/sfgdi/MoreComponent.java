package com.samcancode.sfgdi;

import org.springframework.stereotype.Component;

@Component
public class MoreComponent implements MyInterface {

	@Override
	public String sayHello() {
		System.out.print("More Component says...");
		return "I have more components!";
	}

}
