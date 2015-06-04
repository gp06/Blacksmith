
public class personalitem {
	private int ID;
	private int itemnumbers;
	private static personalitem bag_Mine[] = new personalitem[13];
	private static personalitem bag_Equip[] = new personalitem[20];
	private static personalitem bag_Weapon[] = new personalitem[10];
	
	public void startpersonalitem()
	{
		bag_Equip[0] = new personalitem(1001,1);
		bag_Equip[1] = new personalitem(1006,1);
		bag_Equip[2] = new personalitem(1011,1);
		bag_Equip[3] = new personalitem(1016,1);
		bag_Equip[4] = new personalitem(1021,5);
		bag_Equip[5] = new personalitem(1000,10);
	}
	
	public additem()
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
