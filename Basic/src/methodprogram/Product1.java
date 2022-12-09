package methodprogram;

public class Product1 {
	private int pId;
	private String pName;
	private int noofProducts;
	private static int idgen=1001;
	public Product1()
	{
		pId=idgen++;
	}
	public Product1(String pName,int noodProducts)
	{
		this();//default 
		this.pName=pName;
		this.noofProducts=noodProducts;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getNoofProducts() {
		return noofProducts;
	}
	public void setNoofProducts(int noofProducts) {
		this.noofProducts = noofProducts;
	}
	
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", noofProducts=" + noofProducts + "]";
	}

}
