package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("output.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		EmpSerilizableExample emp=(EmpSerilizableExample)objin.readObject();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println("============");
		EmpSerilizableExample emp1=(EmpSerilizableExample)objin.readObject();
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddress());


	}

}
