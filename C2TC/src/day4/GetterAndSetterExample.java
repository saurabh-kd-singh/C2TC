package day4;

public class GetterAndSetterExample {

	public static void main(String[] args) {
		Movie m1 =new Movie("Avengers", "Joss", "PG-13");
		Movie m2 =new Movie("Brothers", "Adam", "R");
		
		//Setting a correct rating to movie m1
		m1.setRating("G");
		System.out.println("G is a correct Rating to the movie 1 Rating is updated to : " + m1.getRating());

		//Setting a incorrect rating to movie m2 so setter function will set it to the default value NR = not Rated
		m2.setRating("White");
		System.out.println("White word is incorrect Rating to the movie 2 so  Rating is updated to default : " + m2.getRating());
		
	}

}
