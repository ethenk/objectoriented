//**************************************************************************************************
// CLASS: Point (Point.java)
//
// DESCRIPTION
// This is the Point class from "Objects and Classes: Section 1".
// with a compareTo method
//
// GROUP INFORMATION
// * AUTHOR 1: Emily Nesbitt, eanesbit, eanesbit@asu.edu
// * AUTHOR 2: Alan Morales, aamora14, aamora14@asu.edu
// * AUTHOR 3: Ethen Kisner, ekisner, ekisner@asu.edu
//**************************************************************************************************

public class Point implements Comparable {
    // A point in the Cartesian plane is located at (x, y) where x and y form the
    // coordinates of the point.
    private double x;
    private double y;

    // Constructor.
    public Point(double initX, double initY) {
        setX(initX);
        setY(initY);
    }
    
    public int compareTo(Point x) {
    	Point p = x;
    	double distA = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    	double distB = Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
    	if (distA > distB) {
    		return 1;
    	} else if(distA < distB) {
    		return -1;
    	} else {
    		return 0;
    	}
    }

    // Accessor method for x.
    public double getX() {
        return x;
    }

    // Accessor method for y.
    public double getY() {
        return y;
    }

    // Mutator method for x.
    public void setX(double newX) {
        x = newX;
    }

    // Mutator method for y.
    public void setY(double newY) {
        y = newY;
    }
}
