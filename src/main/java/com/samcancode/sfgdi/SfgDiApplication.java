package com.samcancode.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.samcancode.sfgdi.autowiring.ConstructorWiring;
import com.samcancode.sfgdi.autowiring.FieldWiring;
import com.samcancode.sfgdi.autowiring.SetterWiring;
import com.samcancode.sfgdi.primarybean.AnotherInterface;

@SpringBootApplication
public class SfgDiApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyInterface myIntf = (MyInterface) ctx.getBean("moreComponent");
		System.out.println(myIntf.sayHello());
		
		SuperController superController = ctx.getBean(SuperController.class);
		System.out.println(superController.alsoHello());
		
		// Autowiring demo with Qualifier
		System.out.println("\nThe following demo Autowiring with Qualifier...");
		FieldWiring field = (FieldWiring) ctx.getBean("fieldWiring");
		field.wireUp();
		
		SetterWiring setter = (SetterWiring) ctx.getBean("setterWiring");
		setter.wireUp();
		
		ConstructorWiring construct = (ConstructorWiring) ctx.getBean("constructorWiring");
		construct.wireUp();
		
		System.out.println("\n Primary Bean demo....");
		AnotherInterface another = ctx.getBean(AnotherInterface.class);
		System.out.println(another.sayHello());
		
		
		
	}

}
