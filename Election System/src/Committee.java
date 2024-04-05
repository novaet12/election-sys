
import java.util.ArrayList;
import java.util.Scanner;
public class Committee {
	
	
	private int minute,durationOfRegistration=0;
	ArrayList <Electors> electors= new ArrayList <Electors>();
	
	ArrayList <RegionalCandidate> regionalCandidates= new ArrayList <RegionalCandidate>();
	ArrayList <NationalCandidate> nationalCandidates= new ArrayList <NationalCandidate>();
	Scanner input= new Scanner(System.in);
	Electors voter= new Electors();
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getDurationOfRegistration() {
		return durationOfRegistration;
	}
	public void setDurationOfRegistration(int durationOfRegistration) {
		this.durationOfRegistration = durationOfRegistration;
	}
	
	public void registerRegionalCandidate() {
		System.out.println("Enter first name");
		String fName= input.nextLine();
		System.out.println("Enter last name");
		String lName=input.nextLine();
		regionalCandidates.add(new RegionalCandidate(fName,lName));
	}
	public void registerNationalCandidate() {
		System.out.println("Enter first name");
		String fName= input.nextLine();
		System.out.println("Enter last name");
		String lName=input.nextLine();
		nationalCandidates.add(new NationalCandidate(fName,lName));
	}
	public void registerElector() {
		
		electors.add(voter);
		
	}
	public void voteForRegional() {
		
	if (check()) {
		displayRegional();
		System.out.println("Enter a number of whom you want to vote for");
		int index= input.nextInt();
		input.nextLine();
		if(index>0 && index<regionalCandidates.size())
			regionalCandidates.get(index-1).votedBy.add(voter);
		
	}
				
	}
	
	public void voteForNational() {
		
		if (check()) {
			displayNational();
			System.out.println("Enter a number of whom you want to vote for");
			int index= input.nextInt();
			input.nextLine();
			if(index>0 && index<nationalCandidates.size())
				nationalCandidates.get(index-1).votedBy.add(voter);
			
		}
	}
	public boolean check() {
		
		System.out.println("Enter first name");
		String fName= input.nextLine();
		System.out.println("Enter last name");
		String lName=input.nextLine();
		for(Electors i: electors) {
			if(i.getfName().equals(fName) && i.getlName().equals(lName)) {
				System.out.println("You can't choose again");
				return false;
		}
		}
		voter.setfName(fName);
		voter.setlName(lName);
		registerElector();
		return true;
		
	}
	public void displayRegional() {
		System.out.println("Here are Your Regional Candidates");
		for(int i=0;i<regionalCandidates.size();i++ )
			System.out.println(i+1+". "+regionalCandidates.get(i).fName+" "+regionalCandidates.get(i).lName);
	}
	public void displayNational() {
		System.out.println("Here are Your National Candidates");
		for(int i=0;i<nationalCandidates.size();i++ )
			System.out.println(i+1+". "+nationalCandidates.get(i).fName+" "+nationalCandidates.get(i).lName);
	}
	public void displayRegionalWinner() {
		int max=regionalCandidates.get(0).votedBy.size();
		ArrayList <RegionalCandidate> winners= new ArrayList <RegionalCandidate>(); 
		for(int i=0;i< regionalCandidates.size();i++) {
			if(max<regionalCandidates.get(i).votedBy.size()) {
				max=regionalCandidates.get(i).votedBy.size();
				winners.clear();
				winners.add(regionalCandidates.get(i));
			}
			else if(max==regionalCandidates.get(i).votedBy.size()&& max!=0)
				winners.add(regionalCandidates.get(i));
		}
		System.out.println("The regional winner(s):");
		for(int i=0;i< winners.size();i++)
			System.out.println("                      "+ (i+1)+". "+winners.get(i).fName+" "+winners.get(i).lName);
	}
	public void displayNationalWinner() {
		int max=nationalCandidates.get(0).votedBy.size();
		ArrayList <NationalCandidate> winners= new ArrayList <NationalCandidate>(); 
		for(int i=0;i< nationalCandidates.size();i++) {
			if(max<nationalCandidates.get(i).votedBy.size()) {
				max=nationalCandidates.get(i).votedBy.size();
				winners.clear();
				winners.add(nationalCandidates.get(i));
			}
			else if(max==nationalCandidates.get(i).votedBy.size() && max!=0)
				winners.add(nationalCandidates.get(i));
		}
		System.out.println("The National winner(s) :");
		for(int i=0;i< winners.size();i++)
			System.out.println("                      "+(i+1)+". "+winners.get(i).fName+" "+winners.get(i).lName);
	}
}

