
public class personalitem {
	private int ID;
	private int itemnumbers;
	private static personalitem bag_Mine[] = new personalitem[13];
	private static personalitem bag_Equip[] = new personalitem[20];
	private static personalitem bag_Weapon[] = new personalitem[10];
	
	public void startpersonalitem()
	{
		
	}
	//public additem deleteitem 
	
	public personalitem(int ID,int itemnumbers){
		this.ID = ID;
		this.itemnumbers = itemnumbers;
	}
	
	
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getItemnumbers() {
		return itemnumbers;
	}

	public void setItemnumbers(int itemnumbers) {
		this.itemnumbers = itemnumbers;
	}
	
	

}