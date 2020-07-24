package com.samcancode.sfgdi.primarybean;

import org.springframework.stereotype.Component;

@Component
public class ConstructorPrimary {

	private AnotherInterface anotherInterface;
	
	public ConstructorPrimary( AnotherInterface anotherInterface) {
		this.anotherInterface = anotherInterface;
	}

	public void wireUp() {
		System.out.println(anotherInterface.sayHello());
	}

}
