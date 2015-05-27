package Database;

public class Setdatabase 
{
	Setdatabase()
	{
		Database ID_Mine[] = new Database[13]; 
		
		
		ID_Mine[0] = new ID_Mineral(100,"GOD Mineral",(float) 1.0,5000,1000000000);		
		ID_Mine[1] = new ID_Mineral(101,"Iron",(float)7.87,608,500);
		ID_Mine[2] = new ID_Mineral(102,"Low-carbon steel",(float)7.85,700,1000);
		ID_Mine[3] = new ID_Mineral(103,"High-speed steel",(float)8.7,800,2500);
		ID_Mine[4] = new ID_Mineral(104,"Palladium",(float)12.023,461,3500);
		ID_Mine[5] = new ID_Mineral(105,"High-carbon steel",(float)7.82,900,4000);
		ID_Mine[6] = new ID_Mineral(106,"Iridium",(float)22.56,1760,4000);
		ID_Mine[7] = new ID_Mineral(107,"Silver",(float)10.5,251,4500);
		ID_Mine[8] = new ID_Mineral(108,"Gold",(float)19.3,216,5000);
		ID_Mine[9] = new ID_Mineral(109,"Platinum",(float)21.4,549,7000);
		ID_Mine[10] = new ID_Mineral(110,"Tamahagane",(float)7.8,1100,8000);
		ID_Mine[11] = new ID_Mineral(111,"Titanium",(float)4.51,970,10000);
		ID_Mine[12] = new ID_Mineral(112,"Carbon fiber",(float)1.75,1250,50000);
		
		Database ID_Equip[] = new Database[26];
		
		ID_Equip[0] = new ID_equipment(1000,6,1,1000,(float)0,500);
		ID_Equip[1] = new ID_equipment(1001,1,1,2000,(float)50,0);
		ID_Equip[2] = new ID_equipment(1002,1,2,2000,(float)40,10000);
		ID_Equip[3] = new ID_equipment(1003,1,3,2000,(float)25,50000);
		ID_Equip[4] = new ID_equipment(1004,1,4,2000,(float)10,100000);
		ID_Equip[5] = new ID_equipment(1005,1,5,2000,(float)5,250000);
		ID_Equip[6] = new ID_equipment(1006,2,1,2000,(float)0.8,0);
		ID_Equip[7] = new ID_equipment(1007,2,2,2000,(float)0.85,1000);
		ID_Equip[8] = new ID_equipment(1008,2,3,2000,(float)0.9,5000);
		ID_Equip[9] = new ID_equipment(1009,2,4,2000,(float)0.925,10000);
		ID_Equip[10] = new ID_equipment(1010,2,5,2000,(float)0.95,50000);
		ID_Equip[11] = new ID_equipment(1011,3,1,50,(float)0.5,0);
		ID_Equip[12] = new ID_equipment(1012,3,2,100,(float)0.6,500);
		ID_Equip[13] = new ID_equipment(1013,3,3,300,(float)0.8,2000);
		ID_Equip[14] = new ID_equipment(1001,3,4,200,(float)0.9,5000);
		ID_Equip[15] = new ID_equipment(1001,3,5,150,(float)0.95,20000);
		ID_Equip[16] = new ID_equipment(1001,4,1,10,(float)0.6,50);
		ID_Equip[17] = new ID_equipment(1001,4,2,50,(float)0.7,100);
		ID_Equip[18] = new ID_equipment(1001,4,3,100,(float)0.9,500);
		ID_Equip[19] = new ID_equipment(1001,4,4,80,(float)0.925,1000);
		ID_Equip[20] = new ID_equipment(1001,4,5,60,(float)9.5,4000);
		ID_Equip[21] = new ID_equipment(1001,5,1,2000,(float)0,0);
		ID_Equip[22] = new ID_equipment(1001,5,2,2000,(float)0,10000);
		ID_Equip[23] = new ID_equipment(1001,5,3,2000,(float)0,50000);
		ID_Equip[24] = new ID_equipment(1001,5,4,2000,(float)0,250000);
		ID_Equip[25] = new ID_equipment(1001,5,5,2000,(float)0,1000000);
		
	}
}
