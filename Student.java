import java.util.Random;

public class Student {

	String Name;
	String DOB;
	String ID;
	String Program;
	String [] CourseSequence;
	
	public Student(String name, String dob, String program, String [] sequence)
	{
		Name = name;
		DOB = dob;
		ID = getSaltString();
		Program = program;
		CourseSequence = sequence;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getID() {
		return ID;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public void getSequence()
	{
		System.out.println("Courser Sequence for Bachelor's in Elec. Eng.");
		System.out.println();
		
		for(int i = 0; i < 11;)
		{
			for(int j = 1; j < 5; j++)
			{
				System.out.println("Fall Year " + j);
				System.out.println(CourseSequence[i++]);
				
				System.out.println();
				
				System.out.println("Winter Year " + j);
				System.out.println(CourseSequence[i++]);
				
				System.out.println();
				
				if(i < 11)
				{
					System.out.println("Summer Year " + j);
					System.out.println(CourseSequence[i++]);
					
					System.out.println();
				}
			}
		}
		
	}


	//Generates a string of random number
	String getSaltString()
	{
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        
        while (salt.length() < 9) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
