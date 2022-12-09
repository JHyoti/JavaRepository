package methodprogram;

public class MobileMain {

	public static void main(String[] args) {
		Mobile samsung = new Mobile();
		samsung.os="Window";
		samsung.ram=4;
		samsung.processor="intel";
		//samsung.os="android";
		System.out.println(samsung.ram);
		System.out.println(samsung.processor);
		System.out.println(samsung.os);
		samsung.communcation();
		samsung.gaming();
		System.out.println("=================");
		Mobile Honor=new Mobile();
		Honor.ram=6;
		Honor.processor="i3";
		Honor.os="android";
		System.out.println(Honor.ram);
		System.out.println(Honor.processor);
		System.out.println(Honor.os);
		Honor.communcation();
		Honor.gaming();


	}

}
