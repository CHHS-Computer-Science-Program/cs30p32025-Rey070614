package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Students {
	String stuAvg;
	
	File stuGrades;
	FileWriter out;
	BufferedWriter writeFile;
	FileReader in;
	BufferedReader readFile;
	
	
	public String average(String name, String grade, String semester, double grd1, double grd2, double grd3, double grd4)
	{		
		double avgGrd = (grd1 + grd2 + grd3 + grd4)/4;
		stuAvg = Double.toString(avgGrd);
		System.out.println(avgGrd);
		
		try
		{
			stuGrades = new File("C:\\Users\\27172002\\git\\cs30p32025-troyb19\\Chapter11\\src\\Mastery\\stuGrades");
			out = new FileWriter(stuGrades, true);
			writeFile = new BufferedWriter(out);
			
			writeFile.write("Student name: " + name + " Grade: " + grade + " Semester: " + semester + " Grades: " + grd1 + ", " + grd2 + ", " + grd3 + ", " + grd4 + " Average: " + stuAvg);
			writeFile.newLine();
	
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
		}
		catch (IOException e)
		{
			System.out.println("Problem writing to file");
		}
		
		return stuAvg;
	}
	
	public String viewFile()
	{
		String fileContents = "";
	
		
		try
		{
			stuGrades = new File("C:\\Users\\27172002\\git\\cs30p32025-troyb19\\Chapter11\\src\\Mastery\\stuGrades");
			in = new FileReader(stuGrades);
			readFile = new BufferedReader(in);
		
			String line;
			
			while ((line = readFile.readLine()) != null) {
				System.out.println(line);
				fileContents = fileContents + line + "\n";
			}
			
			readFile.close();
			in.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		catch(IOException e)
		{
			System.out.println("Problem writing to file");
		}
		
		
		
		
		return fileContents;
	}
}


