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

	@Autowired
	Sender sender;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/settings")
	public void create(@RequestBody Setting setting) {
		sender.send("boot.t", setting.toString());
		//todo params: Boolean autocommit
	}

}
