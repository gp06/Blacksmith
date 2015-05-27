
public class Equipment 
{
	
	private int ID;
	private int Durable;
	private int Rank;
	private int efficient;
	
	
	protected Equipment(int ID,int Rank,int Durable,int efficient)
	{
		this.ID = ID;
		this.Rank = Rank;
		this.Durable = Durable;
		this.efficient = efficient;
	}


	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public int getDurable() {
		return Durable;
	}


	public void setDurable(int durable) {
		Durable = durable;
	}


	public int getRank() {
		return Rank;
	}


	public void setRank(int rank) {
		Rank = rank;
	}


	public int getEfficient() {
		return efficient;
	}


	public void setEfficient(int efficient) {
		this.efficient = efficient;
	}
	
	
}
