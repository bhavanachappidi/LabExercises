package inheritance;

public class JournalPaper extends WrittenItem{
	private String publishedYear;
	
	public JournalPaper()
	{
		super();
	}
	public JournalPaper(int uin,String title,int NoOfCopies,String author,String publishedYear)
	{
		super(uin,title,NoOfCopies,author);
		this.publishedYear=publishedYear;
	}
	public String getPublishedDate() {
		return publishedYear;
	}

	public void setPublishedDate(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	public void print()
	{
		System.out.println("Title: " +getTitle());
		System.out.println("ID: " +getUIN());
		System.out.println("Number of copies: " +getNoOfCopies());
		System.out.println("Author Name : "+ getAuthor());
		System.out.println("Published Year : "+publishedYear);
		
	}

}
