
import java.util.ArrayList;
public class Candidates {

	
	Advertising advertise;
	String fName, lName;
	ArrayList <Electors> votedBy= new ArrayList <Electors>();
	
	public void addVoter(Electors elector) {
		votedBy.add(elector);
	}
	
}
