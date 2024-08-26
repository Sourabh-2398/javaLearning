package OOPS;

public class mainClass {

	public static void main(String[] args) {
	       
		CustomerOrder c1= new CustomerOrder();
	       c1.quantity=2;
	       c1.seniorCitizen=false;
	       c1.generateOrderBill();
	    
	    CustomerOrder c2 = new CustomerOrder();
	    c2.quantity=5;
	    c2.seniorCitizen=true;
	    c2.generateOrderBill();
	       
	   }

}
