
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.service.CustomerService;

public class Application {

	public static void main(String[] args) {
//	CustomerService customer=new CustomerServiceImpl() ;
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	CustomerService customer=(CustomerService) app.getBean("customerService","CustomerService.class");	
	System.out.println(customer.findAll().get(0).getFirstname());
		

	}

}
