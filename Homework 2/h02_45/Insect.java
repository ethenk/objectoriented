//******************************************************************************
// ABSTRACT CLASS: Insect (Insect.java)
//
// DESCRIPTION
// Insect is the abstract superclass for all Insect subclasses, e.g., we could
// have a LadyBug class, a Cockroach class, and a Cricket class, all of which
// inherit from Insect. The Insect class implements the MakesSound interface
// because each Insect makes a sound of some sort (we assume so, I don't know if
// all Insects make sounds).
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * The abstract superclass for all types of Insects. Note that Insect does not
 * implement MakesSound.makeSound() because it does not have to since Insect
 * is abstract. Abstract classes do not have to implement any of the methods of
 * the class.
 */
public abstract class Insect implements MakesSound { 
} 
