package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("c:/one.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("JavaWorld");
		bw.close();

	}

}
