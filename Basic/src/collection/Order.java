package collection;

public class Order {
	private int orderid;
	private String ordername;
	private int nooforders;
	public Order()
	{
		
	}
	public Order(int orderid, String ordername, int nooforders) {
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
		return "Orders [orderid=" + orderid + ", ordername=" + ordername + ", nooforders=" + nooforders + "]";
	}

}
