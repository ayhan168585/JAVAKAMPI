package kahveDukkani.Abstract;

import kahveDukkani.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	public void add(Customer customer) {
		System.out.println("Müşteri veritabanına kaydedildi " + customer.getFirstName());
	}
	
}
