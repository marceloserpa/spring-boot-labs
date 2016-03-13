package br.com.authenticationpoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	@RequestMapping(value="/auth/sign")
	public String itsIsPublic(){
		return "Yep, it is public my friend!";
	}
	
	@RequestMapping(value="/outher/logged-people")
	public String onlyLoggedPeople(){
		return "Sorry guy, only logged people!";
	}	
	
}
