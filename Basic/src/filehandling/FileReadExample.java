package filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("ABC.txt");
		
		int i;
		while((i=file.read())!=-1) {
			System.out.println((char)i); // its converting the data in character byte to char
		}
	}

}
