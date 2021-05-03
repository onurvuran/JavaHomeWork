import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concreate.NeroCustomerManager;
import concreate.StarbucksCustomermanager;
import entities.Customer;


public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomermanager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setFirstName("Onur");
		customer.setLastName("Vuran");
		customer.setId(19);
        customer.setDateOfBrith(1997);
		
		customerManager.save(customer);
		
		

	}

}
