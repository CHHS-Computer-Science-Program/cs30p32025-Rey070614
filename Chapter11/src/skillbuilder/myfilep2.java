/**
 * 
 */
package skillbuilder;

import java.io.*;
import java.util.Scanner;

/**
 * 
 */
public class myfilep2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File textFile;
		String fileName;
		
		Scanner input = new Scanner(System.in);
		String response;
		
		
		textFile = new File("../Chapter11/src/skillbuilder/zzz.txt");
		
		System.out.println("Enter the file name: ");
		fileName = input.next();
		
		textFile = new File(fileName);
		if(textFile.exists())
		{
			System.out.println(" zzz.txt File Exist.");
		}
		else {
			
			try
			{
				textFile.createNewFile();
				System.out.println(" zzz.txt File has been created.");
			}
			catch(IOException e)
			{
				System.out.println(" File could not be created");
				System.err.println("IOExpection:" + e.getMessage());
			}
		}
		
		//delete if user chooses
		System.out.println("would you like to (K)eep or (Delete file)");
		response = input.next();
		
		if (response.equalsIgnoreCase("D"))
		{
			if(textFile.delete()) 
			{
				System.out.println("file has been deleted");
			}
		}
		else 
		{
			System.out.println("file is kept");
		}
	}

}
