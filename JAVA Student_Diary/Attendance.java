import java.io.Serializable;
import java.util.Scanner;

public class Attendance implements Serializable {
    String date;
    boolean att;
    int total;
    int attend;
    double percent;
    public Attendance(){
        date = "";
        att = false;
        total=0;
        attend=0;
    }
    public void setAttendance(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the date");
        this.date = s.next();
        total=total+1;
         System.out.println("Enter true if student was present or enter false");
        this.att = s.nextBoolean();
        if(this.att==true){
        attend=attend+1;
        }
        percent=(double)(attend/total)*100;
           }
    public String toString(){
        return " " + date + "\n" + att + "\n";
    }
    public void print(){
        System.out.println(this.toString());
    }
    

 public void getpercent(){
 System.out.println("total class:"+total+"attended class:"+attend+"percenteage:"+percent);
 }
 }
