package methodprogram;

public class ProductMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 p1=new Product1("chair",10);
		System.out.println(p1);
		Product1 p2=new Product1("kidschair",20);
		System.out.println(p2);
		Product1 p3=new Product1("swingchair",30);
		System.out.println(p3);
		Product1 p4=new Product1();
		p4.setpId(1004);
		p4.setNoofProducts(40);
		System.out.println("Noofproducts"+p4.getNoofProducts());
		System.out.println("productid"+p4.getpId());

	}

}
