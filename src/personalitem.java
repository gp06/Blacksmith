import javax.swing.JOptionPane;

import Database.Setdatabase;


public class personalitem {
	private int ID;
	private int itemnumbers;
	private int start;
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
	            return i;
	        }
	        
	    }
	    return 14;
	}
	
	public int searchequipbag(){
        for(int i = 0;i<=20;i++){
            if(bag_Equip[i]==null){
                return i;
            }
            
        }
        return 21;
    }
	
	public int searchweaponbag(){
        for(int i = 0;i<=10;i++){
            if(bag_Weapon[i]==null){
                return i;
            }
            
        }
        return 11;
    }
	
	public void itemcontrol(int ID,int itemnumber){
	    if(ID<=999){
	        start =  searchminebag();
	        if(start==14){
	            JOptionPane.showMessageDialog(null, "Warning", "Mineral bag is full", JOptionPane.PLAIN_MESSAGE );
	        }else{
	            bag_Mine[start] = new personalitem(ID,itemnumber);
	        }
	       
	    }else if(ID<=9999){
	        start = searchequipbag();
	        if(start==21){
	            JOptionPane.showMessageDialog(null, "Warning", "Equipment bag is full", JOptionPane.PLAIN_MESSAGE );
	        }else{
	            bag_Equip[start] = new personalitem(ID,itemnumber);
	        }
	    }else{
	        start = searchweaponbag();
            if(start==21){
                JOptionPane.showMessageDialog(null, "Warning", "Equipment bag is full", JOptionPane.PLAIN_MESSAGE );
            }else{
                bag_Weapon[start] = new personalitem(ID,itemnumber);
            }
	    }
	}
	
	
	public void delentitem(int ID){
	    if(ID<=999){
	        for(int i = 0;i<personalitem.bag_Mine.length;i++){
	            if(personalitem.bag_Mine[i].getID() == ID){
	                bag_Mine[i] = null;
	            }
	        }
	    }else if(ID<=9999){
	        for(int i = 0;i<personalitem.bag_Equip.length;i++){
                if(personalitem.bag_Equip[i].getID() == ID){
                    bag_Equip[i] = null;
                }
            }
        }else{
            for(int i = 0;i<personalitem.bag_Weapon.length;i++){
                if(personalitem.bag_Weapon[i].getID() == ID){
                    bag_Weapon[i] = null;
                }
            }
        }
	    
	}
	
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
