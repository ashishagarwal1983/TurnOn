import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.turnon.core.common.enums.Gender;
import com.turnon.core.repo.UserRepository;
import com.turnon.web.model.UserProfile;



public class AppMain {

	public static void main(String[] s) {
		
		ClassPathXmlApplicationContext context = null;
		try {
			
			context = new ClassPathXmlApplicationContext(new ClassPathResource("spring-couchbase-integration.xml").getPath());

			UserRepository userRepository = context.getBean(UserRepository.class);
			UserProfile userProfile = new UserProfile();
			userProfile.setAge(10);
			userProfile.setGender(Gender.MALE);
			userProfile.setMobileNumber("9711163631");
			userProfile.setUserId(111);

			userRepository.save(userProfile);
				System.out.println(userRepository.findOne(111L).toString());
		} catch (Exception e) {
			System.out.println("eEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE:" + e);
			e.printStackTrace();
		}
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++" + name);
		}
		
		context.close();
	}
}
