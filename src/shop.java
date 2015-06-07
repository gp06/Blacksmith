import java.util.Random;

import Database.Database;




public class shop {
    
    private int Ditem1 =0,Ditem2 = 0,Ditem3 = 0,Ditem4 = 0,Ditem5 = 0,Ditem6 = 0,Ditem7 = 0,Ditem8 = 0;
    
    
    


   
    
    public shop(){
        
        Ditem1 = 101;
        Ditem2 = 102;
        Ditem3 = 103;
        Ditem4 = 104;
        if(Day%2=0){
            Ditem5 = 105;
            Ditem6 = 109;
        }else if(Day==10){
            Ditem7 = 110;
        }else if(Day==20){
            Ditem7 = 111;
        
        
        
        }else if(Day==30){
            Ditem8 = 112;
        }else{
            Ditem5 = 106;
            Ditem6 = 110;
        }
        
        
        
        
    }
    
    public void buyitem(int ID,int number){
        
    }



   

}
