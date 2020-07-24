package com.samcancode.sfgdi.autowiring;

import org.springframework.stereotype.Component;

import com.samcancode.sfgdi.MyInterface;

@Component
public class SetterComponent implements MyInterface {

	@Override
	public String sayHello() {
		System.out.print("Setter Component for ...");
		return "...Setter AutoWiring!";
	}

}
