package com.samcancode.sfgdi.primarybean;

import org.springframework.stereotype.Component;


@Component
public class SecondaryComponent implements AnotherInterface {

	@Override
	public String sayHello() {
		System.out.print("Constructor Secondary Component ...");
		return "...Autowiring is Optional!";
	}

}
