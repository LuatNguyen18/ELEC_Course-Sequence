
public class ElecEng {

	String [] sequence;

	public ElecEng()
	{
		sequence = new String [] {"COEN243 COEN212 ELEC273 ENGR213 ENGR201-202", "COEN244 COEN231 COEN311 ENGR233 ENCS282", "ELEC242 ELEC251 ELEC311 COEN352", "WORK TERM",
							  "ELEC342 ELEC331 ENGR290 ENGR371 ENGR301", "ELEC366 COEN313 ENGR391 ELEC372", "ELEC366 ELEC321 ELEC367 ELEC241 ELEC390", "WORK TERM", "WORK TERM", 
							  "ELEC490 GEN-ED ELECTIVE ELECTIVE ELECTIVE", "ELEC490 ENGR392 ELECTIVE ELECTIVE ELECTIVE"};
	}
	
	public String[] getSequence()
	{
		return sequence;
	}
}

