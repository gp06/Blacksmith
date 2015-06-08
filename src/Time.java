
public class Time {
    private int time=0;
    private int Day=0;
    public Time(){
        
    }
    
    public void daycheck(){
        if(time==24){
            Day++;
            time = time - 24;
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }
    
    
    
    

}
