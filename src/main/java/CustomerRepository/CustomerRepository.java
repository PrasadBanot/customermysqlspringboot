package CustomerRepository;

import org.springframework.data.repository.CrudRepository;

import Customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer,String> {

}

