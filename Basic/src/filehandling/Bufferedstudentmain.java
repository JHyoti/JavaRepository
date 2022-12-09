package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import inheritence.Class11;

public class Bufferedstudentmain {

	public static void main(String[] args) throws IOException {
		FileReader fw=new FileReader("studentdata.txt");
		BufferedReader br=new BufferedReader(fw);
		try {
		String col = br .readLine();
		System.out.print(col);
		String row=br.readLine();
		while(row!=null)
	{
			String []data=row.split(",");
			String dno=data[0];
			String dname=data[1];
			String sname=data[2];
			String s1 = data[3];
			String s2 = data[4];
			String s3 = data[5];
			String s4 = data[6];
			String s5 = data[7];

			int total=0;
			int i=3, j=5;
			float per=0;
				while(j!=0)
				{
					int S1= Integer.parseInt(data[i]);
					int S2= Integer.parseInt(data[i+1]);
					int S3= Integer.parseInt(data[i+2]);
					int S4= Integer.parseInt(data[i+3]);
					int S5= Integer.parseInt(data[i+4]);
					
					total=S1+S2+S3+S4+S5;
					per = (total*100)/250.0f;
					j--;
				}
			
			//double per = (double) total;
			row = br.readLine();
			System.out.println(dno+" "+sname+" "+dname+" "+s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+"total: "+total+" Per:"+per);
		}
			
			
	
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
