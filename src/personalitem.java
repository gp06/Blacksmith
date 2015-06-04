
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
	
	public int searchminebag(){
	    for(int i = 0;i<=13;i++){
	        if(bag_Mine[i]==null){
	            return bag_Mine[i];
	        }
	        
	    }
	    return null;
	}
	
	public static int searchequipbag(){
        for(int i = 0;i<=20;i++){
            if(bag_Equip[i]==null){
                return bag_Equip[i];
            }
            
        }
        return null;
    }
	
	public int searchweaponbag(){
        for(int i = 0;i<=10;i++){
            if(bag_Weapon[i]==null){
                return bag_Weapon[i];
            }
            
        }
        return null;
    }
	
	public void additem(int ID){
	    if(ID<=999){
	        
	        bag_Mine[searchminebag()] = ID;
	    }else if(ID<=9999){
	        
	    }
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
