package constuctor;

	public class Student {
		int id;
		String name;
		int m1,m2,m3,m4,m5;
		
		Student(int i,String j,int mark1,int mark2,int mark3,int mark4,int mark5)
		{
			id=i;//12
			name=j;//gayathri
			m1=mark1;//89
			m2=mark2;//90
			m3=mark3;//67
			m4=mark4;//89
			m5=mark5;//89
		}
		double percentage()
		{
			int total=m1+m2+m3+m4+m5;
			double percentage=(total*100)/500.0;
			return percentage;
		}
	    public String toString()
	    {
	    	return "id=:"+id+"Name=:"+name+"percentage=:"+percentage();
	    }
	}

