package com.app.api.posttest.controller;

import com.app.api.posttest.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostTestController {

	@GetMapping("/posts")
	public String get() {
		return "Hello World";
	}

	@PostMapping("/posts")
	public String post(@RequestBody PostCreate params) {
		log.info("params = {}", params);
		return "Hello World";
	}

}
