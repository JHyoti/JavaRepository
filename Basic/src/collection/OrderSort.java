package collection;

public class OrderSort {
	private int orderid;
	private String ordername;
	private int nooforders;
	
	
	public OrderSort() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderSort(int orderid, String ordername, int nooforders) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.nooforders = nooforders;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public String getOrdername() {
		return ordername;
	}


	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}


	public int getNooforders() {
		return nooforders;
	}


	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}


	@Override
	public String toString() {
		return "OrderSort [orderid=" + orderid + ", ordername=" + ordername + ", nooforders=" + nooforders + "]";
	}
	
	
	
}
