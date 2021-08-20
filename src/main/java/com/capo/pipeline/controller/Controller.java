package com.capo.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/")
	public String getMessage() {
		return "MESSAGE FROM THE PIPELINE CONTROLLER";
	}
}
