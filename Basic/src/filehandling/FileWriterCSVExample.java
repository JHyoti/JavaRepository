package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCSVExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("c:/studentdetails.csv");
		fw.write("id,Name,Address");
		fw.write("\n12,gayathri,CBE");
		fw.write("\n13,Ravi,Banglore");
		fw.write("\n14,Hari,MDU");
		fw.close();
		System.out.println("created");

	}


}
