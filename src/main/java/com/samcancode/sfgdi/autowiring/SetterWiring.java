package com.samcancode.sfgdi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samcancode.sfgdi.MyInterface;

@Component
public class SetterWiring {

	private MyInterface myInterface;
	
	@Autowired
	@Qualifier("setterComponent")
	public void setMyInterface(MyInterface myInterface) {
		this.myInterface = myInterface;
	}

	public void wireUp() {
		System.out.println(myInterface.sayHello());
	}

}
