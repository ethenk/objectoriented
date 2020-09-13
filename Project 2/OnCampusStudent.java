public class OnCampusStudent extends Student {
    public static final int RESIDENT = 1;
    public static final int NON_RESIDENT = 2;
    private int mResident;
    private double mProgramFee;

    public OnCampusStudent(String pId, String pFirstName, String pLastName) {
        super.Student(pId, pFirstName, pLastName);
    }

    @Override
    public void calcTuition() {
        double t;

        if (getResidency() == "RESIDENT") {
            t = TuitionConstants.ONCAMP_RES_BASE;
        } else {
            t = TuitionConstants.ONCAMP_NONRES_BASE;
        }

        t = t + getProgramFee();

        if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
            t = t + (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }

        setTuition(t);
    }

}
