package CustomerController;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import Customer.Customer;
import CustomerService.CustomerService;


	@RestController
	public class CustomerController {
		@Autowired
		private CustomerService customerService;
		@RequestMapping("/get/customersdetails")
		
		public List<Customer> getAllCustomer(){
			return customerService.getAllcustomers();
			
		}
		@RequestMapping(method = RequestMethod.POST, value="/get/customersdetails")
		public void addCustomer(@RequestBody Customer customer) 
		{
			customerService.addCustomer(customer);
			
		}
		@RequestMapping(method = RequestMethod.PUT, value="/get/customersdetails")
		public void updateCustomer(@PathVariable int id,@RequestBody Customer customer) 
		{
			customerService.updateCustomer(id, customer);
			
		}
		
		public void DeleteUniversity(@PathVariable String id) 
		{
			customerService.deleteCustomer(id);
			
		}
		
		

	}

