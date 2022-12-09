package unCheckRuntimeException;
/*
 * WAP Task:
===========
product:
id
name
noofpeoduct
productweight

ProductMain:
===========
3 objects

productweight<200:InvalidProductException

 */
public class Product {
	private int id;
	private String name;
	private int noofpeoduct;
	private double productweight;
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int noofpeoduct, double productweight) {
		super();
		this.id = id;
		this.name = name;
		this.noofpeoduct = noofpeoduct;
		this.productweight = productweight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofpeoduct() {
		return noofpeoduct;
	}
	public void setNoofpeoduct(int noofpeoduct) {
		this.noofpeoduct = noofpeoduct;
	}
	public double getProductweight() {
		return productweight;
	}
	public void setProductweight(double productweight) {
		this.productweight = productweight;
	}
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", noofpeoduct=" + noofpeoduct + ", productweight="
				+ productweight + "]";
	}
	
	
	
	
}
