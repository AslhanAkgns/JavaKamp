package inheritance;

public class Main {

	public static void main(String[] args) {
		
		ýndividualCustomer engin = new ýndividualCustomer();
		engin.customerNumber ="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="78910";
	
		CustomerManager customerManager = new CustomerManager();
	
		Customer[] customers = {engin,hepsiBurada};
		
		 customerManager.addMultiple(customers);
		 
		 
	}

}
