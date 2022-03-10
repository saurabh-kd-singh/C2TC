package day3;

public class ItalianChef extends Chef {

	//Overriding the Special Dish Method of Chef
	public void makeSpecialDish() {
		System.out.println("The Chef makes Special Cheese Cake");
	}
	
	//Adding a new method in inherited Class
	public void makePasta() {
		System.out.println("The Chef makes Pasta");
	}
	
}
