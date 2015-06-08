import java.util.Random;


import Database.Database;
import Database.Getinfo;





public class shop {
    
    private int Ditem1 = 0;
    private int Ditem2 = 0;
    private int Ditem3 = 0;
    private int Ditem4 = 0;
    private int Ditem5 = 0;
    private int Ditem6 = 0;
    private int Ditem7 = 0;
    private int Ditem8 = 0;
    
    
    


   
    
    public shop(){
        
        Ditem1 = 101;
        Ditem2 = 102;
        Ditem3 = 103;
        Ditem4 = 104;
        if(Time.getDay()%2==0){
            Ditem5 = 105;
            Ditem6 = 109;
        }else if(Time.getDay()==10){
            Ditem7 = 110;
        }else if(Time.getDay()==20){
            Ditem7 = 111;
        
        
        
        }else if(Time.getDay()==30){
            Ditem8 = 112;
        }else{
            Ditem5 = 106;
            Ditem6 = 110;
        }
        
        
        
        
    }
    
//    public void buyitem(int Ditem,int number){
//        int money;
//        money = Getinfo.getIDinfo(Ditem).getPrice();
//        personalitem.itemcontrol(Ditem,number+personalitem.getItemnumbers());
//        
//        
//    }





   

}
