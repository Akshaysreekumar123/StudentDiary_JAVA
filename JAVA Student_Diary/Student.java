import java.util.*;
import java.io.*;
public class Student implements Serializable{
String name;
String regno;
int stno=0;
Attendance ad=new Attendance();
Fp f=new Fp();
Sp s=new Sp();
EndSem e=new EndSem();
IntMark in=new IntMark();
Personal per=new Personal();
Scanner sc=new Scanner(System.in);
Student(){
stno=stno+1;
name=null;
regno=null;
}
Student(String s1,String s2){
name=s1;
regno=s2;
stno=stno+1;
}
public void setData(){
System.out.println("Enter Name of student number :"+stno);
name=sc.next();
System.out.println("Enter Register Number of Student NO:"+stno);
regno=sc.next();
stno=stno+1;
}
public void getData(){
System.out.println("Enter Name of student number :"+name);
System.out.println("Enter Register Number of Student NO:"+regno);
stno=stno+1;
}
public void Attend(int i){
if(i==2){
ad.getpercent();
}
else if(i==1){
ad.setAttendance();
}
else{
System.out.println("Invalid Input");
}
}

public void end(int i){
if(i==1){
e.inputMark();
}
else if(i==2){
e.Display();
}
else{
System.out.println("Invalid Input");
}
}
public void first(int i){
if(i==1){
f.inputMark();
}
else if(i==2){
f.Display();
}
else{
System.out.println("Invalid Input");
}
}
public void second(int i){
if(i==1){
s.inputMark();
}
else if(i==2){
s.Display();
}
else{
System.out.println("Invalid Input");
}
}

public void imark(int i){                 
if(i==1){
in.setInternals(f,s);
}
else if(i==2){
System.out.println("The internal mark is:"+in.inmark);

}
else{
System.out.println("Invalid Input");
}
}

public void perInfo(int i){
if(i==1){
per.getDetails();
}
else if(i==2){
per.displayData();
}
else{
System.out.println("Invalid Input");
}
}


}
