package com.samcancode.sfgdi.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samcancode.sfgdi.MyInterface;

@Component
public class ConstructorWiring {

	private MyInterface myInterface;
	
	public ConstructorWiring(@Qualifier("constructorComponent") MyInterface myInterface) {
		this.myInterface = myInterface;
	}

	public void wireUp() {
		System.out.println(myInterface.sayHello());
	}

}
