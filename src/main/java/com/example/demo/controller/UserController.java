package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	List<User> getAll() {
		User jane = new User(1L, "Jane");
		User john = new User(2L, "John");
		return Arrays.asList(jane, john);
	}

	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@RequestMapping(value = "/users/jane", method = RequestMethod.GET)
	void get() {
	}

	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	void put() {
	}

	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@RequestMapping(value = "/users/jane", method = RequestMethod.POST)
	void post() {
	}

	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@RequestMapping(value = "/users/jane", method = RequestMethod.DELETE)
	void delete() {
	}

}
