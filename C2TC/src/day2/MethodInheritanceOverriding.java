package day2;
 
public class MethodInheritanceOverriding {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		
		v1.DistanceTravelled();
		v1.FuelConsumption();
		
		Car c1 = new Car();
		
		c1.DistanceTravelled();
		c1.FuelConsumption();
		
	}
	
}

