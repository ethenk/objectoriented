//**************************************************************************************************
// CLASS: OnlineSTudent
//
// DESCRIPTION
// The onlinestudent class for Project 2.
//
// AUTHOR
//Emily Nesbitt (eanesbit@asu.edu)
//Alan Morales(aamora14@asu.edu)
//Ethen Kisner(ekisner@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
//**************************************************************************************************
public class OnlineStudent extends Student {
	private boolean mTechFee;
	
	public OnlineStudent(String pId, String pFirstName, String pLastName) {
		Student(pId, pFirstName, pLastName);
	}
	
	@Override
	public void calcTuition() {
		double t = getCredits()* TuitionConstants.ONLINE_RATE;
		if(getTechFee()) {
			t = t+ TuitionConstants.ONLINE_TECH_FEE;
		}
		setTuition(t);
	}
	public boolean getTechFee() {
		return mTechFee;
	}
	public void setTechFee(boolean pTechFee) {
		mTechFee = pTechFee;
	}

}
