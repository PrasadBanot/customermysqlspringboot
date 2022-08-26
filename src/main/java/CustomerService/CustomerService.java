package CustomerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Customer.Customer;
import CustomerRepository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	public CustomerRepository customerRepo;
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepo.findAll().forEach(customers::add);
		return customers;
		
	}
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}
	public void updateCustomer(int id, Customer customer) {
		customerRepo.save(customer);
	}
	public void deleteCustomer(String id) {
		customerRepo.deleteById(id);;
		
	}
	public List<Customer> getAllcustomers() {
		
		return getAllcustomers();
	}
	

}

