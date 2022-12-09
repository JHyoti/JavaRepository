package stringprogram;

public class StringBuuffredProgram {

	public static void main(String[] args) {

				StringBuffer s1=new StringBuffer("Hello");
				System.out.println(s1);
				s1.append("World");
				System.out.println(s1);
				s1.insert(2, "Java");
				System.out.println(s1);
				s1.replace(1, 3, "one");
				System.out.println(s1);
				s1.delete(1, 3);
				System.out.println(s1);
				s1.reverse();
				System.out.println(s1);




	}

}
