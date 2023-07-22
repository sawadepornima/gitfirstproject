package git_project;

import java.io.File;
import java.io.IOException;

public class Create_File {
	public static void main(String[] args) throws IOException {
		File file = new File("e:\\p.txt");
		if (file.createNewFile()) {
			System.out.println("File Create " +file.getName());
			
		}
		else {
			System.out.println("file already existed");
		}
	}

}
