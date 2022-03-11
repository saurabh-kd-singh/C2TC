package day4;

public class StaticlassesSong {

	public static void main(String[] args) {
		Song holiday = new Song("Holiday", "Green", 200);
		Song blue = new Song("Blue", "Alex", 180);
		
		//Accessing a static variable called song count which is same for both the Objects holiday and blue.
		System.out.println(holiday.getSongsCount());
		System.out.println(blue.getSongsCount());
		
		Song box = new Song("Box", "Rex", 160);
		
		System.out.println(holiday.getSongsCount());
		System.out.println(blue.getSongsCount());
		System.out.println(box.getSongsCount());

	}

}
