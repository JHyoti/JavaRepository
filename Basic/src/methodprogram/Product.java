package methodprogram;
/*
 * product:
id
name
noofproducts
default:
parameter
toString
Main:
3 object:2 objects:Parameter
1 object:default
 */
public class Product {
	int id;
	String Name;
	int NoOfProduct;
	Product(){
		
	}
	Product(int i, String name, int p){
		id= i;
		Name =name;
		NoOfProduct = p;
	}
	
	
	public String toString() {
		return "id:" +id + "/nName:" +Name + "NoOfProduct:"+NoOfProduct;
	}
	
}
