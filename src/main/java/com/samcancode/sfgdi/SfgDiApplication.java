package com.samcancode.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.samcancode.sfgdi.autowiring.ConstructorWiring;
import com.samcancode.sfgdi.autowiring.FieldWiring;
import com.samcancode.sfgdi.autowiring.SetterWiring;
import com.samcancode.sfgdi.beenlife.LifeCycleDemoBean;
import com.samcancode.sfgdi.pet.PetController;
import com.samcancode.sfgdi.primarybean.AnotherInterface;
import com.samcancode.sfgdi.profile.ProfileInterface;

@SpringBootApplication
public class SfgDiApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("\n\n===============================================\n");

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
		
		System.out.println("\n Profile Bean demo....");
		ProfileInterface profile = ctx.getBean(ProfileInterface.class);
		System.out.println(profile.sayHello());
		
		System.out.println("\n Pet Service Profile Bean demo....");
		PetController petCtrl = ctx.getBean(PetController.class);
		System.out.println(petCtrl.whichPetIsTheBest());
		
		System.out.println("\n===============================================\n");
		
		LifeCycleDemoBean bean = ctx.getBean(LifeCycleDemoBean.class);
		bean.doSomething();
	}

}
