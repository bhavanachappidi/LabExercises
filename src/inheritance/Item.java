package inheritance;

public abstract class Item {
	private int uin;
	private String title;
	private int NoOfCopies;
	
	public Item()
	{
		
	}
	public Item(int uin,String title,int NoOfCopies)
	{
		this.uin=uin;
		this.title=title;
		this.NoOfCopies=NoOfCopies;
	}
	public void checkIn()
	{
		NoOfCopies=NoOfCopies+1;
	}
	public void checkOut()
	{
		NoOfCopies=NoOfCopies-1;
	}
	public void print()
	{
		System.out.println("Title: " +title);
		System.out.println("ID: " +uin);
		System.out.println("Number of copies: " +NoOfCopies);
	}
	public boolean equals(Object obj)
	{
		Item b = (Item)obj;
		if(this.uin!=b.uin)
		{
			return false;
		}
		else if(!this.title.equals(b.title))
		{
			return false;
		}
		else if(this.NoOfCopies!=b.NoOfCopies)
		{
			return false;
		}
		return true;
	}
	public void addItem(int UIN,String title,int NoOfCopies)
	{
		setUIN(UIN);
		setTitle(title);
		setNoOfCopies(NoOfCopies);	
	}
	public String toString()
	{
		return "ID : "+uin+"Title : "+title+"Number of copies : "+NoOfCopies;
	}
	public int getUIN() {
		return uin;
	}
	public void setUIN(int uIN) {
		uin = uIN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return NoOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		NoOfCopies = noOfCopies;
	}
	

}
