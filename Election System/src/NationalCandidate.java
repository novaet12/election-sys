
public class NationalCandidate extends Candidates{
	
final String runningFor="Nation";
	
	NationalCandidate(String fName,String lName){
		this.fName=fName;
		this.lName=lName;
		this.advertise= new TvAd();
	}
	
	public void changeAd(Advertising ad) {
		this.advertise=ad;
	}

}
