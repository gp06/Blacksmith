package Database;

public class ID_equipment extends Database 
{
	private int type;
	private int Durable;
	private int Rank;
	private float efficient;
	
	public ID_equipment(int ID,int type,int Rank,int Durable,float efficient,int price)
	{
		super(ID,price);
		this.type = type;
		this.Durable = Durable;
		this.Rank = Rank;
		this.efficient = efficient;
	}

	public void setEfficient(float efficient) {
		this.efficient = efficient;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public float getEfficient() {
		return efficient;
	}

	public void setEfficient(int efficient) {
		this.efficient = efficient;
	}
}
