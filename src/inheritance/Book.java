package inheritance;




public class Book extends WrittenItem{
	
	public Book()
	{
		
	}
	public Book(int idNo, String title, int noOfCopies, String authorName)
	{
		super(idNo,title,noOfCopies,authorName);
	}
	public void print()
	{
		System.out.println("Title: " +getTitle());
		System.out.println("ID: " +getUIN());
		System.out.println("Number of copies: " +getNoOfCopies());
		System.out.println("Author Name : "+ getAuthor());
		
	}
	
	
}
