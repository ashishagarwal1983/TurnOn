package com.turnon.web.controller;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.turnon.core.services.DoctorService;
import com.turnon.core.services.UserService;

@Path("/users")
@Produces("application/json")
public class DoctorController {
    
	@Autowired
	private DoctorService doctorService;

	
	@Path("/test")
	@GET
	public String testMethod(){
		return "Hello World";
	}
	
	@Path("/profile/registerdoctor")
	@POST
	public void registerdoctor(com.turnon.web.model.UserProfile userProfile) throws IllegalAccessException, InvocationTargetException{
//		com.turnon.db.model.DoctorProfile doctorModel = new com.turnon.db.model.DoctorProfile();
//	    BeanUtils.copyProperties(doctorModel, doctorProfile);
	    doctorService.registerDoctor(userProfile);
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