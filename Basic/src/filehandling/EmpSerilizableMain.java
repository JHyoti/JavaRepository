package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerilizableMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EmpSerilizableExample e1=new EmpSerilizableExample(12,"gayathri","kknagar");
		EmpSerilizableExample e2=new EmpSerilizableExample(13,"Ravi","Banglore");
		EmpSerilizableExample e3=new EmpSerilizableExample(14,"Hari","Thane");
		FileOutputStream fout=new FileOutputStream("output.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fout);
		obj.writeObject(e1);
		obj.writeObject(e2);
		obj.writeObject(e3);
		obj.close();
		System.out.println("write successfully");

	}

	}


