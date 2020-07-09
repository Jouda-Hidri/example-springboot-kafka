package com.codenotfound.kafka.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codenotfound.kafka.producer.Sender;

@RestController
public class SettingsController {
	
	// curl -XPOST -H "Content-type: application/json" -d '{"name": "first setup"}' 'http://localhost:8080/settings'

	@Autowired
	Sender sender;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/settings")
	public void create(@RequestBody Setting setting) {
		sender.send("boot.t", setting.toString());
		// todo params: Boolean autocommit
	}

}
