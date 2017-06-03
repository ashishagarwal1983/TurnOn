package com.turnon.web.controller;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.turnon.core.common.enums.Gender;
import com.turnon.core.services.UserService;
import com.turnon.web.model.UserProfile;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;


@Path("/user")
@Api(value = "/user", description = "User REST for Integration Testing")
@Produces("application/json")
public class UserController {

	@Autowired
	UserService userService;

	@Path("/test")
	@GET
	@ApiOperation(value = "Get test details")
	public String testMethod() {
		UserProfile userProfile = new UserProfile();
		userProfile.setAge(10);
		userProfile.setGender(Gender.MALE);
		userProfile.setMobileNumber("9711163631");
		userProfile.setUserId(2222);

		userService.registerUser(userProfile);
		return "Hello User";

	}

	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get user details")
	public void registerUser(com.turnon.web.model.UserProfile userProfile)
			throws IllegalAccessException, InvocationTargetException {
		userService.registerUser(userProfile);
	}
}
