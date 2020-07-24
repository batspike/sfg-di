package com.samcancode.sfgdi.primarybean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PrimaryComponent implements AnotherInterface {

	@Override
	public String sayHello() {
		System.out.print("Constructor Primary Component ...");
		return "...Autowiring is Optional!";
	}

}
