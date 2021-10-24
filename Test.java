import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String [] args) throws IOException
	{
		Graph<String> graph = new Graph<String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Co-op major: ");
		String major = scan.nextLine();

		
		
		
		if(((major.substring(0,4)).toLowerCase().equals("elec")))
		{
			
			System.out.print("Enter your full name: ");
			String name = scan.nextLine();
			
			
			System.out.print("Enter your date of birth: ");
			String dob = scan.nextLine();
		
			
			ElecEng ElecCourse = new ElecEng();
			Student student = new Student(name, dob, "Electrical Engineering", ElecCourse.getSequence());
			
			try (BufferedReader br = new BufferedReader(new FileReader("ELEC.txt")))
			{
			   String line;
			   while ((line = br.readLine()) != null)
			   {
				   String[] var = line.split(" ");
				   
				   graph.addPrereq(var[0], var[1]);
			   }
			}
			
			System.out.println("---------------------------------------");
			student.getSequence();
			System.out.println("---------------------------------------");
			
			System.out.println("Course prerequisite finder");
			System.out.println();
			
			System.out.print("Enter a course number (-1 to exit):");
			String course = scan.nextLine();
			
			while(!course.equals("-1"))
			{
				System.out.print("Prerequisites of " + course + " are: ");
				graph.DFS(course);
				
				System.out.println();
				System.out.println();
				
				System.out.println("Enter a course number (-1 to exit)");
				course = scan.nextLine();
			}
			
		}
		
		
		
		
	
		
		
		    
		
		
		
		
		
	
	}
}