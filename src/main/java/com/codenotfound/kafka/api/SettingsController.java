package com.codenotfound.kafka.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingsController {
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/settings")
	public void create(@RequestBody Setting setting) {
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/setting")
	public void show() {
	}

}
