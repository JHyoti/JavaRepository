package methodprogram;
/*
 * Task:
====
Student:
id 
name
m1
m2
m3,m4,m5
getpercentage();

StudentMain:
===========
s1,s2,s3:access class

 */
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S= new Student();
		S.Id=1;
		S.Name="Jyoti";
		S.M1=77;
		S.M2=88;
		S.M3=99;
		S.M4=88;
		S.M5=66;
		//S.getPercentage();
		/*
		 * 
		 * 
		 * 
		System.out.println("ID:"+S.Id);
		System.out.println("Name:"+S.Name);
		System.out.println("Percentage:" +S.getPercentage());
		 */
		System.out.println(S);
		System.out.println("==========================");
		
	}

}
