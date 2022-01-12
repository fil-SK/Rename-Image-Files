import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

	
	public static void main(String[] args) {
		
		String leadingZero = "";
		
		 File folder = new File("C:\\Users\\SK\\Desktop\\ChangeName");
	        File[] listOfFiles = folder.listFiles();

	        for (int i = 0; i < listOfFiles.length; i++) {

	            if (listOfFiles[i].isFile()) {

	                File f = new File("C:\\Users\\SK\\Desktop\\ChangeName\\"+listOfFiles[i].getName()); 
	                
	                i++;							// Increment i so that it starts from 1 in the output
	                
	                if(i <= 9) {
	                	leadingZero = "0";
	                }
	                else {
	                	leadingZero = "";
	                }
	                
	                f.renameTo(new File("C:\\Users\\SK\\Desktop\\ChangeName\\" + leadingZero + i + ".jpg"));
	                
	                i--;							// Decrement to return to consistent state
	            }
	        }

	        System.out.println("Conversion is done");
		
	}
}
