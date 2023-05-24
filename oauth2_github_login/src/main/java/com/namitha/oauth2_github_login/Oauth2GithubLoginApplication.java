package com.namitha.oauth2_github_login;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Oauth2GithubLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2GithubLoginApplication.class, args);
	}
	
	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" Welcome to Oauth using GitHub login!!!";
	}

}
