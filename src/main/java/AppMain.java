import org.apache.tomcat.jni.File;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@EnableAutoConfiguration
@EnableCouchbaseRepositories("com.turnon.core.couchbaserepo.*")
public class AppMain {

	public static void main(String[] s){
		FileSystemXmlApplicationContext context = null;
		try{
		 context = new FileSystemXmlApplicationContext("D:\\github\\TurnOn\\src\\main\\java\\applicationContext.xml");
		}catch(Exception e){
			System.out.println("eEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE:" + e);
			e.printStackTrace();
		}
		for (String name : context.getBeanDefinitionNames()){
			System.out.println("+++++++++++++++++++++++++++++++++++++++++" +name);
		}
	}
}
