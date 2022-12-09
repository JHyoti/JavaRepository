package methodprogram;

public class Student {
	
	int Id;
	String Name;
	int M1,M2, M3, M4 , M5;
	
	/*double getPercentage() {
		int total=M1+M2+M3+M4+M5;
		double percentage =total*100/500.0;
		return percentage;
	}*/
	double percentage()
	{
		int total=M1+M2+M3+M4+M5;
		double percentage=(total*100)/500.0;
		return percentage;
	}
	
	public String toString() {
		return "id=:"+Id+"Name=:"+Name+"percentage=:"+percentage();

		
	}
}
