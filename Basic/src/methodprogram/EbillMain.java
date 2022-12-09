package methodprogram;

public class EbillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ebill bill1 = new Ebill(77, 12277);
		System.out.println(bill1);
		Ebill bill2 = new Ebill(77, 12277);
		System.out.println(bill2);
		Ebill bill3 = new Ebill();
		bill3.setBillno(2);
		bill3.setCosperunits(22);
		bill3.setNoofunits(55);
		
		System.out.println(bill3.getBillno());
		System.out.println(bill3.getCosperunits());
		System.out.println(bill3.getNoofunits());
		

	}

}
