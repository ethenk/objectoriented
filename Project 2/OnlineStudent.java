
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
