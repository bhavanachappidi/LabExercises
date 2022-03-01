package inheritance;

public class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD()
	{
		
	}
	public CD(int idNo, String title, int noOfCopies,int runtime,String artist,String genre)
	{
		super(idNo,title,noOfCopies,runtime);
		this.artist=artist;
		this.genre=genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void print()
	{
		System.out.println("Title: " +getTitle());
		System.out.println("ID: " +getUIN());
		System.out.println("Number of copies: " +getNoOfCopies());
		System.out.println("RunTime : "+getRuntime());
		System.out.println("Artist: "+getArtist());
		System.out.println("Genre: "+getGenre());
	}
}
