package Database;

public class Getinfo 
{
	public Database getIDinfo(int x)
	{
		Database tmp = null;
		if(x>=1000)
		{
			for(int i = 0; i < Setdatabase.ID_Equip.length; i++)
			{
				if(Setdatabase.ID_Equip[i].getID() == x)
					tmp = new Database(Setdatabase.ID_Equip[i].getID(), Setdatabase.ID_Equip[i].getPrice());
			}
			
		}
		else
		{
			
		}
		return tmp;
	}
}
