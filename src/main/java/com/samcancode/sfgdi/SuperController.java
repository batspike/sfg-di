package com.samcancode.sfgdi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SuperController {
	private final MyInterface myInterface;
	
	public SuperController(@Qualifier("myComponent") MyInterface myInterface) {
		this.myInterface = myInterface;
	}
	
	public String alsoHello() {
		return myInterface.sayHello();
	}
}
