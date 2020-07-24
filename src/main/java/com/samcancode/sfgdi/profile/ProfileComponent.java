package com.samcancode.sfgdi.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"PRI","default"}) //note this is case sensitive
@Component
public class ProfileComponent implements ProfileInterface {

	@Override
	public String sayHello() {
		System.out.print("Constructor Primary Component ...");
		return "...Autowiring is Optional!";
	}

}
