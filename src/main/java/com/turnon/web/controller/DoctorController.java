package com.turnon.web.controller;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.turnon.core.common.enums.Gender;
import com.turnon.core.services.DoctorService;
import com.turnon.web.model.DoctorProfile;


@RestController
@Path("/doctor")
@Produces("application/json")
public class DoctorController {
    
	@Autowired
	private DoctorService doctorService;

	
	@Path("/test")
	@GET
	public String testMethod(){
		DoctorProfile doctorProfile = new DoctorProfile();
		doctorProfile.setAge(10);
		doctorProfile.setGender(Gender.MALE);
		doctorProfile.setMobileNumber("8447157683");
		doctorProfile.setUserId(111);

		doctorService.registerDoctor(doctorProfile);
		return "Hello Doctor";
		
	}
	
	@Path("/register")
	@POST
	public void registerdoctor(com.turnon.web.model.DoctorProfile doctorProfile) throws IllegalAccessException, InvocationTargetException{
//		com.turnon.db.model.DoctorProfile doctorModel = new com.turnon.db.model.DoctorProfile();
//	    BeanUtils.copyProperties(doctorModel, doctorProfile);
	    doctorService.registerDoctor(doctorProfile);
	}
	
//	@Path("/info/{mobile}/{category}")
//    @GET
//	public User getUserInfoByPhone(@PathParam("mobile") String mobile, @PathParam("category") String category ) {
//	    User user = new User();
//	    userService.getUserInfoByPhone(mobile, category);
//	    return user;
//	}
//	
//	@Path("/account/registration")
//    @POST
//	public User createAccount(com.turnon.web.model.User user) {
//        return user;
//	}
//	
//	@Path("/doctors/{mobile}")
//    @GET
//	public List<String> getMyDoctors(@PathParam("mobile") String mobile ) {
//	    return null;
//	}
//	
//	@Path("/user/{mobile}")
//    @GET
//    public List<String> getMyUsers(@PathParam("mobile") String mobile ) {
//        return null;
//    }
//	
//	@Path("/user/appointment/details/{mobile}")
//    @GET
//    public List<String> getMyAppointmentDetails(@PathParam("mobile") String mobile ) {
//        return null;
//    }
	
	
}