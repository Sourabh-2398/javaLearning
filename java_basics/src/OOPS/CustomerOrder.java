package OOPS;

public class CustomerOrder {
	
	// Variables
	static int orderNumber=1000;
	double price=10.0;
	double seniorDiscount=2.0;
	int quantity=1;
	boolean seniorCitizen=false;
	double orderAmount;
	
	CustomerOrder(){
	    orderNumber++;
	}
	public void generateOrderBill() {
		
		// Step 1: Generate New Order Number
		System.out.println("Order Number: " +orderNumber);
		// Step 2: Compute Order Amount (orderAmount) using price & quantity
		orderAmount=this.price*this.quantity;
		System.out.println("Quantity: " + quantity);
		// Step 3: Apply discount if customer is a senior citizen
		if(seniorCitizen){
		    orderAmount-=2;
		}
		System.out.println("Total Amount: " + orderAmount);
		
	}

}