package com.samcancode.sfgdi.autowiring;

import org.springframework.stereotype.Component;

import com.samcancode.sfgdi.MyInterface;

@Component
public class ConstructorComponent implements MyInterface {

	@Override
	public String sayHello() {
		System.out.print("Constructor Component ...");
		return "...Autowiring is Optional!";
	}

}
