package com.samcancode.sfgdi.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("SEC")
@Component
public class MoreProfileComponent implements ProfileInterface {

	@Override
	public String sayHello() {
		System.out.print("Constructor Secondary Component ...");
		return "...Autowiring is Optional!";
	}

}
