package com.samcancode.sfgdi.pet;

import org.springframework.stereotype.Component;

@Component
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
		this.petService = petService;
	}

	public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
