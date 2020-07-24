package com.samcancode.sfgdi.autowiring;

import org.springframework.stereotype.Component;

import com.samcancode.sfgdi.MyInterface;

@Component
public class FieldComponent implements MyInterface {

	@Override
	public String sayHello() {
		System.out.print("Field Component for ...");
		return "...Field AutoWiring!";
	}

}
