package inheritance;

public abstract class WrittenItem extends Item{
	private String author;
	public WrittenItem()
	{
		
	}
	public WrittenItem(int uin,String title,int NoOfCopies,String author)
	{
		super(uin,title,NoOfCopies);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

}
