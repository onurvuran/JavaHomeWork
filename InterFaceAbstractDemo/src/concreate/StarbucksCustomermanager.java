package concreate;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomermanager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomermanager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: " + customer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}
		
	

	}

}
