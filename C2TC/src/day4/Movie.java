package day4;


/* Getters and setters are used when some attributes of a class can only have some fixed values. 
 * Like in our example  there are only 5-6 fixed values for rating attribute*/


public class Movie {
	private String title;
	private String director;
	private String rating;  //The reason why this variable is set to private because  we don't want it to get updated directly by any other class.
	
	//Constructor
	public Movie(String title, String director, String rating) {
		this.setTitle(title);
		this.setRating(rating);
		this.setDirector(director);
		
	}

	//Setter
	public void setRating(String rating) {
		//setting the condition for the possible values of rating
		if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR")) {
			this.rating = rating;
		}else {
			this.rating ="NR";
		}
	}
	
	public String getRating() {
		return rating;
	}
	
	
	public void setTitle(String title) {
		this.title =  title;
	}
	public String getTitle() {
		return this.title;
	}
	
	
	public void setDirector(String director) {
		this.director =  director;
	}
	public String getDirector() {
		return this.director;
	}
	
	
}
