
public class RegionalCandidate extends Candidates{

	final String runningFor="Region";
	
	RegionalCandidate(String fName,String lName){
		this.fName=fName;
		this.lName=lName;
		this.advertise= new RadioAd();
	}
	
	public void changeAd(Advertising ad) {
		this.advertise=ad;
	}
}
