package inheritance;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;
	public Video()
	{
		
	}
	public Video(int idNo, String title, int noOfCopies,int runtime,String director,String genre,int year)
	{
		super(idNo,title,noOfCopies,runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
		
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void print()
	{
		System.out.println("Title: " +getTitle());
		System.out.println("ID: " +getUIN());
		System.out.println("Number of copies: " +getNoOfCopies());
		System.out.println("RunTime : "+getRuntime());
		System.out.println("Director: "+getDirector());
		System.out.println("Genre: "+getGenre());
	}
}
