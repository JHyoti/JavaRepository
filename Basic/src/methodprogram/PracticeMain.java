package methodprogram;
/*
 * 1)WAP to :
Rectangle:
==========
int length,width
area,perimeter:
1)with parameter(data type variable) without return type.(void)
2)without parameter (empty )with return type(datatype)
Rectangle main:
2 objects

 * */
public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p = new Practice();
		System.out.println("============with return type============");
		System.out.println("Area with perameter is:" +p.area());
		System.out.println(p.area1(1,2));
		System.out.println("============without return type============");
		p.Perimeter();
		p.Perimeter1(3,5);
		
	}

}
