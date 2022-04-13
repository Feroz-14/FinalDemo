package pack;

@FunctionalInterface
interface Cab {
	// void bookCab();
	// void bookCab(String city, String distination);
	double bookCab(String city, String distination);
}

/*
 * class Uber implements Cab {
 * 
 * @Override public void bookCab() { // TODO Auto-generated method stub
 * System.out.println("Arriving Soon"); }
 * 
 * }
 */

public class LamdaExpressions {

	public static void main(String[] args) {

		/*
		 * Cab cab=new Cab() //Anonymus class {
		 * 
		 * @Override public void bookCab() { // TODO Auto-generated method stub
		 * System.out.println("Arrining Soon"); }
		 * 
		 * };
		 */
		// Cab cab = new Uber();

		// LamdaExpression
		// Cab cab=()->{
		// System.out.println("Arriving Soon");
		// };

		Cab cab = (city, distination) -> {
			System.out.println("from " + city + ":to" + distination + "Arrving soon");
			return 750;
		};

		double amount = cab.bookCab("Nellore", "Tirupati");
		System.out.println(amount);
	}
}