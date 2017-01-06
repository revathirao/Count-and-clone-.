/**
* This application allows to count and clone the objects.
* @author  RR
* @version 1.0
* @since   2016-12-22 
*/
public class CountTestApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Counting alligators...\n");
		Alligator myAlligator = new Alligator();
		CountUtil.count(myAlligator, 3);
		System.out.println();

		System.out.println("Counting sheep...\n");
		Sheep mySheep = new Sheep();
		mySheep.setSheepName("Dolly");
		CountUtil.count(mySheep, 2);
		System.out.println();

		Sheep mySheep1 = (Sheep) mySheep.clone();
		mySheep1.resetCount();
		mySheep1.setSheepName("Blackie");
		CountUtil.count(mySheep1, 3);
		System.out.println();

		CountUtil.count(mySheep, 1);

	}

}
