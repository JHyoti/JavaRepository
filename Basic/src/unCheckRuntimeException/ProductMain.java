package unCheckRuntimeException;

public class ProductMain {


	public static void main(String[] args) throws InvalidProductWeightException {
		Product P = new Product(101, "Earphones", 10, 100);
		Product P1 = new Product(102, "Laptop", 60, 500);
		Product P2 = new Product(103, "Pens", 16, 100);
		System.out.println(P);
		System.out.println(P1);
		System.out.println(P2);		
	
	 double min = P.getProductweight();{
	if(min>P1.getProductweight()); {
		min = P1.getProductweight();
	} if(min>P2.getProductweight());{
		min = P2.getProductweight();
	  }
	 }
	 
	 System.out.println("The min weight is "+min);
	 if(min<200) {
		 throw new InvalidProductWeightException("product Weigth is low");
	 }else {
		 System.out.println("All Products in cart are with weight greater than 200 grams");
	   }
	
	
	
  }
}
	

			 
			/*
			 * Product pro = new Product(101, "Chocolates", 10, 100);
		Product pro1 = new Product(102, "Ice-Cream", 5, 250);
		Product pro2 = new Product(103, "Chair", 8, 200);
		
		System.out.println(pro);
		System.out.println(pro1);
		System.out.println(pro2);
		
		double min = pro.pWeight;
		if(min>pro1.pWeight)
		{
			min=pro1.pWeight;
		}
		 if(min>pro2.pWeight)
		{
			min=pro2.pWeight;
		}
		 System.out.println("The min weight is "+min);
		 if(min<200)
		 {
			 throw new InvalidProductWeightException("Product with low weight");
			
		 }
		else
		{
			 System.out.println("All Products in cart are with weight greater than 200 grams ");
		}
 
			 */
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 

