package inheritance;

public class MediaItem extends Item{
	private int runtime;
	
	public MediaItem()
	{
		
	}
	public MediaItem(int uin,String title,int NoOfCopies,int runtime)
	{
		super(uin,title,NoOfCopies);
		this.runtime=runtime;
	}
	
	
	
	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
}
