package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("c:/one.txt");
		fw.write("HEllo World");
		fw.close();
	}

}
