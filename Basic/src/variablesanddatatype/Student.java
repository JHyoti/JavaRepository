package variablesanddatatype;
//WAP to get student id,name,5 subject marks,calculate total and percentage?

public class Student {

	public static void main(String[] args) {
	int id=7675;
	String name="JO";
	int Java=66, python=44, C=55, Sql=22, Maths=88;
	int Total= Java+python+C+Sql+Maths;
	double Average= Total*100/500;
	System.out.println("ID:"+id);
	System.out.println("NAME:"+name);
	System.out.println("JAVA:"+Java+" "+ "PYTHON:"+python+" "+ "C:"+C+" "+ "SQL:"+Sql+" "+ "MATHS:" +Maths);
	System.out.println("TOTAL:"+Total);
	System.out.println("AVERAGE:" +Average);
	}

}
