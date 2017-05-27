package com.turnon.web.controller;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.turnon.core.services.UserService;

@Path("/users")
@Produces("application/json")
public class UsersController {
    
	@Autowired
	private UserService userService;

//	@Path("/profile/register")
//	@POST
//	public User registerUser(com.turnon.web.model.User user) throws IllegalAccessException, InvocationTargetException{
//	    com.turnon.core.model.User profile = new com.turnon.core.model.User();
//	   UserDetails userDetails =  user.getUserDetails();
//	   com.turnon.core.model.UserDetails model = new com.turnon.core.model.UserDetails();
//	    BeanUtils.copyProperties(model, userDetails);
//	    profile.setUserDetails(model);
//	    profile.setUserId(user.getUserId());
//	    UserProfile userProfile = new UserProfile();
//	    userProfile.setFirstName("test");
//	    userService.registerUser(userProfile);
//		return user;
//	}
	
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