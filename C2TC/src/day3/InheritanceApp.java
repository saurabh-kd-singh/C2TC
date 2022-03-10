package day3;

public class InheritanceApp {

	public static void main(String[] args) {
		
		//makeSpecialdish method is Overrided in both the Italian and the chinese class
		
		ItalianChef ic = new ItalianChef();
		ic.makeSpecialDish();
		
		ChineseChef cc = new ChineseChef();
		cc.makeSpecialDish();
		
		
		//Using the inherited method 
		
		ic.makeSalad();
		cc.makeSalad();
		

	}

}
