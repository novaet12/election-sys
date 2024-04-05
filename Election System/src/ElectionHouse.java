import java.util.Date;
import java.util.Scanner;
public class ElectionHouse {

	static Date begining= new Date();
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		
		Committee electionBoard= new Committee();
		electionBoard.setMinute(begining.getMinutes());
		electionBoard.setDurationOfRegistration(1);
		
		while(true) {
			 Date time = new Date();
			if (electionBoard.getMinute()+electionBoard.getDurationOfRegistration()>time.getMinutes()) {
				System.out.println("Registration for Candidates is now open\n1. Regional \n2. National");
				int choice= input.nextInt();
				input.nextLine();
				if (choice==1)
					electionBoard.registerRegionalCandidate();
				else if(choice==2)
					electionBoard.registerNationalCandidate();
			}
			
			else if (electionBoard.getMinute()+electionBoard.getDurationOfRegistration()+1>time.getMinutes()) {
				System.out.println("Vote is now open. Remember you can only vote once\n1. Regional\n2. National");
				int choice = input.nextInt();
				input.nextLine();
				if (choice==1)
					electionBoard.voteForRegional();
				else if(choice==2)
					electionBoard.voteForNational();
			}
			else{
				electionBoard.displayRegionalWinner();
				electionBoard.displayNationalWinner();
				break;
			}
			
		}
	}

}
