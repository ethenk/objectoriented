//******************************************************************************
// CLASS: Cricket (Cricket.java)
//
// DESCRIPTION
// Cricket is a subclass of Insect. Remember that if D is a subclass of C, then
// a D is a specific type of C, so Cricket is a specific type of Insect.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * Cricket is a specific type of Insect so Cricket inherits from Insect. Insect
 * and Cricket are related using a generalization (or inheritance) relationship.
 * Note that Insect implements the MakesSound interface, so since Cricket is a
 * subclass of Insect then Cricket must implement the MakesSound interface b
 * implementing the MakesSound.makeSound() method. (If Cricket does not do this,
 * then Cricket also becomes an abstract class).
 */
public class Cricket extends Insect {

    /**
     * Insect is an abstract class and does not implement the MakesSound.
     * makeSound() method. However, since Cricket is a concrete subclass of
     * Insect then Cricket must implement makeSound(). The sound Crickets make
     * is "Chirp" (Man oh man, I hate crickets).
     *
     * Note also that Cricket is implementing the abstract makeSound() method
     * of Insect. Therefore, to prevent accidental overloading, we use the
     * @Override annotation.
     */
	@Override
	public void makeSound() { 
		System.out.println("Chirp");
	}
}
