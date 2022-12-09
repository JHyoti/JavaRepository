package filehandling;
import java.io.File;
import java.io.IOException;

public class CreateNewFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("ABC.txt");
		if(f.createNewFile()) {
			
			System.out.println("File Has Been Created Successfully");
			
		}else {
			System.out.println("GET out I am not creating file Already Exists");
		}
	}

}


