package Database;

public class Database {
	private int ID;
	private int price;
	
	
	public Database(int ID,int price)
	{
		this.ID = ID;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}
}
