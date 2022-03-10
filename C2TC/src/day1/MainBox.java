package day1;
class Box {
	private int length, breadth, height; //These three variables will be accessible only inside Box Class.
	public void  setDimension(int l, int b, int h) {
		length =l; breadth=b; height=h;
	}
	public void showDimensions() {
		System.out.println("L="+length);
		System.out.println("B="+breadth);
		System.out.println("H="+height);
	}	
}

public class MainBox {
	public static void main(String[] args) {
		Box obj1Box = new Box(); //new Box() on the right hand side creates the new object and obj1Box is the reference variable.
		obj1Box.setDimension(10, 12, 15);
		obj1Box.showDimensions();
		
		obj1Box=new Box();
		obj1Box.showDimensions();

	}
}
