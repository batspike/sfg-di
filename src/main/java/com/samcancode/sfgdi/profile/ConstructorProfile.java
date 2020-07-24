package com.samcancode.sfgdi.profile;

import org.springframework.stereotype.Component;

@Component
public class ConstructorProfile {

	private ProfileInterface anotherInterface;
	
	public ConstructorProfile( ProfileInterface anotherInterface) {
		this.anotherInterface = anotherInterface;
	}

	public void wireUp() {
		System.out.println(anotherInterface.sayHello());
	}

}
