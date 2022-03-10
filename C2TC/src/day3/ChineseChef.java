package day3;

public class ChineseChef extends Chef {
	//Overriding the Special Dish Method of Chef
		public void makeSpecialDish() {
			System.out.println("The Chef makes Special Chinese Soup");
		}
		
		//Adding a new method in inherited Class
		public void makeLolipop() {
			System.out.println("The Chef makes Lolipop");
		}

}
