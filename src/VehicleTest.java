
public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		
		v.setColor("blizard pearl white");
		v.setModel("Highlander");
		v.setMake("Toyota");

		Truck t = new Truck();
		t.setColor("silver");
		t.setMake("GMC");
		t.setModel("Sierra 3500 HD");
		
		System.out.println("My vehicle color is " + v.getColor()+ " and it is a " + v.getMake() + " " + v.getModel()+ ".");
		System.out.println("and my favorite truck's color is " + t.getColor() + " and it is a " + t.getMake() + " " + t.getModel() + ".");
	}

}
