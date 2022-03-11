package day4;

public class Song {
	private String title;
	private String artist;
	private int song_len;
	
	//Creating a Static attribute (variable).
	private static int songsCount = 0;
	
	//Constructor
	public Song(String title, String artist, int song_len) {
		this.setTitle(title);
		this.setArtist(artist);
		this.setSong_len(song_len);
		
		//Every time this constructor is called  a new song will be created and then we will update the songs Count.
		songsCount++;
		System.out.println("Songs Count : " + songsCount);
	}
	
//-----------------------------------------------------------------------------------------------------------------
	public String getTitle() {
		return title;
	}
	public void setTitle(String  title) {
		this.title=title;
	}
//-----------------------------------------------------------------------------------------------------------------
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String  artist) {
		this.artist=artist;
	}
//-----------------------------------------------------------------------------------------------------------------
	
	public int getSong_len() {
		return song_len;
	}
	public void setSong_len(int song_len) {
		this.song_len=song_len;
	}
//-----------------------------------------------------------------------------------------------------------------
	
	public int getSongsCount() {
		return songsCount;
	}
}
