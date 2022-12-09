package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("first.txt");
		String s="hello";
		byte b[]=s.getBytes();
		fout.write(b);
		System.out.println("writing data successfully");

	}

}
