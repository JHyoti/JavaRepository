package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[] = {2,23,55,77};
		Student S= new Student();
		S.setsId(1);
		S.setsName("jo");
		S.setMark(m1);
		
	System.out.println(S.getsId());
	System.out.println(S.getsName());
	System.out.println(S.getMark());
	
	}

}
