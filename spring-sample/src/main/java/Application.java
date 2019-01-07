import java.security.Provider.Service;
import java.util.List;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;
import com.springsample.model.Customers;

public class Application {

	public static void main(String[] args) {
	CustomerService customer=new CustomerServiceImpl() ;
	System.out.println(Service.findAll().get(0).getFirstname());
		
		

	}

}
