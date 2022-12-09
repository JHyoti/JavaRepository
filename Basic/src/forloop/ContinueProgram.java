package forloop;

public class ContinueProgram {

	public static void main(String[] args) {
		   for(int i=0;i<=10;i++)//0,1,2,3
		   {
			   if(i==4)//0==4 1==4 2==4 3==4 4==4
			   {
				   continue;
			   }
			   System.out.println(i);//0 1 2,3
	

		   }

	}

}
