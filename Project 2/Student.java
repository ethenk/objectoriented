//**************************************************************************************************
// CLASS: Student
//
// DESCRIPTION
// Student is an abstract class and is the superclass for the OnCampusStudent and OnlineStudent
// classes. Remember that in a class hierarchy, the superclass declares data and methods that are
// common to all types of students.
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

   /**
     * Creates a Student object and initializes the mId, mFirstName, and mLastName instance
     * variables.
     */
public abstract class Student implements Comparable<Student> {
  
    String mFirstName;
    String mLastName;
    String mId;
    int mCredits;
    double mTuition;
    
    public Student (String pId, String pFirstName, String mLastName)
    {
        this.mId = mId;
        this.mFirstName=mFirstName;
        this.mLastName=mLastName;
        
    }

    /**
     * calcTuition() is to be implemented by subclasses of Student. Remember that abstract methods
     * are not implemented in a superclass but must either be implemented in a subclass, or if not,
     * then the subclass also becomes an abstract class. The reason calcTuition() is abstract
     * and intended to be implemented by the subclasses of Student is because how we calculate the
     * tuition for an OnCampusStudent is different than how we calculate the tuition for an Online-
     * Student.
     */
    public abstract void calcTuition();
    /**
     * The java.lang.Comparable<T> interface declares one method int compareTo(T obj) that must be
     * implemented by any class which implements the interface. This method is called from Sorter.
     * keepMoving() to compare the mId fields of two Students.
     *
     * Compares the mId fields of 'this' Student and pStudent. Returns -1 if this Student's mId
     * field is less than pStudent's mId field. Returns 0 if this Student's mId field is equal to
     * pStudent's mId field. Returns 1 if this Student's mId field is greater than pStudent's mId
     * field.
     *
     * Note that the mId field of a Student is a java.lang.String and String also implements the
     * Comparable<String> interface and consequently, also implements a compareTo() method to
     * compare two strings. Hence, all we have to do here is to call the String class compareTo()
     * method on the two mId strings of 'this' Student and pStudent and return whatever that method
     * returns.
     */
    @Override
    public int compareTo(Student pStudent) {
        return getId().compareTo(pStudent.getId());
    }

    /**
     * Accessor method for mCredits.
     */
    public int getCredits(){
        return mCredits;
    }

    /**
     * Accessor method for mFirstName.
     */
    public String getFirstName(){
        return mFirstName;
    }

    /**
     * Accessor method for mId.
     */
    public String getId(){
        return mId;
    }

    /**
     * Accessor method for mLastName.
     */
    public String getLastName(){
        return mLastName;
    }

    /**
     * Accessor method for mTuition.
     */
    public double getTuition(){
        return mTuition;
    }

    /**
     * Mutator method for mCredits.
     */
    public void setCredits(int pCredits){
        this.mCredits=mCredits;
    }

    /**
     * Mutator method for mFirstName.
     */
    public void setFirstName(String pFirstName){
        this.mFirstName=mFirstName;
    }

    /**
     * Mutator method for mId.
     */
    public void setId(String pId){
        this.mId=mId;
    }

    /**
     * Mutator method for mLastName.
     */
    public void setLastName(String pLastName){
        this.mLastName=mLastName;
    }

    /**
     * Mutator method for mTuition.
     */
    public void setTuition(double pTuition){
        this.mTuition=mTuition;
    }

}
