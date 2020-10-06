import java.util.*;
import java.io.*;
public class Test implements Serializable{
public static void main(String[] args) throws Exception{
int i,n,j,k,l,ch;
try{

	Scanner sc=new Scanner(System.in);
	File f=new File("Stud.txt");
		if(!f.exists()){
			f.createNewFile();
			}
			File f2=new File("Faculty.txt");
			
		if(!f2.exists()){
			f2.createNewFile();
			}
			System.out.println("enter the number of Students");
k=sc.nextInt();
System.out.println("enter the number of Faculties");
j=sc.nextInt();
Faculty[] fac=new Faculty[j];
Student[] s=new Student[k];
for(i=0;i<j;i++){
        fac[i]=new Faculty();
        }
        for(i=0;i<k;i++){
         s[i] = new Student();
         }
int cker=1;
while(cker!=0){
System.out.println("Enter \n 1 to login as faculty \n 2 to login as student \n0 for exit ");
n=sc.nextInt();


if(n==1){
 
int ex;
System.out.println("enter 0 to exit and 1 to cotinue");
ex=sc.nextInt();
while(ex!=0){
System.out.println("Choose an option");
System.out.println("1.Write or view data of Faculty\n2.Write or view data of Student\n3.View or Edit Student Attendances\n 4.View or edit end Semester mark\n5.View or edit first Semester mark\n6.View or edit Second Semester mark\7.View or edit Internal mark\n11.View or edit Personal Info\n0.To logout");

ch=sc.nextInt();
switch(ch){
case 1:System.out.println("enter 1 to Write data and any other  to read");
        l=sc.nextInt();
        if(l==1){
        for(i=0;i<j;i++){
        fac[i].setfac();
        FileOutputStream fos=new FileOutputStream(f2);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(fac[i]);
        }
        }
        else{
        for(i=0;i<j;i++){
        fac[i].dispfac();
        FileInputStream fis=new FileInputStream(f2);
				ObjectInputStream ois =new ObjectInputStream(fis);
				fac[i]=(Faculty)ois.readObject();}
        }
        break;
case 2:System.out.println("enter 1 to Write data and any other  to read");
        l=sc.nextInt();
        if(l==1){
        for(i=0;i<k;i++){
         s[i].setData();
        FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream oo=new ObjectOutputStream(fo);
				oo.writeObject(fac[i]);
        }
        }
        else{
        for(i=0;i<k;i++){
        s[i].getData();
        FileInputStream fi=new FileInputStream(f);
				ObjectInputStream oi =new ObjectInputStream(fi);
				s[i]=(Student)oi.readObject();}
        }
        break;
case 3:System.out.println("enter 1 to edit and 2 to view");
        l=sc.nextInt();
        for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        
        s[i].Attend(l);
        }
        break;
case 4:System.out.println("enter 1 to edit and 2 to view");
        l=sc.nextInt();
        for(i=0;i<k;i++){
        
        System.out.println("required data of student number "+(i+1));
        s[i].end(l);}
        break;
case 5:System.out.println("enter 1 to edit and 2 to view");
        l=sc.nextInt();
        for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        s[i].first(l);
        }
        break;
case 6:System.out.println("enter 1 to edit and 2 to view");
        l=sc.nextInt();
        for(i=0;i<k;i++){
       
        System.out.println("required data of student number "+(i+1));
        s[i].second(l);  }
        break;
case 7:System.out.println("enter 1 to edit and 2 to view");
        l=sc.nextInt();
        for(i=0;i<k;i++){
        
        System.out.println("required data of student number "+(i+1));
        s[i].imark(l);}
        break;
case 8:System.out.println("enter 1 to edit and 2 to view");
        l=sc.nextInt();
        for(i=0;i<k;i++){
         
        System.out.println("required data of student number "+(i+1));
        s[i].perInfo(l);}
        break;
case 0:ex=0;        
}
}
}
else if(n==2){
int ex;
System.out.println("enter 0 to exit and 1 to cotinue");
ex=sc.nextInt();
while(ex!=0){
System.out.println("Choose an option");
System.out.println("1. view data of Faculty\n2. view data of Student\n3.View Student Attendances\n 4.View end Semester mark\n5.View  first Semester mark\n6.View  Second Semester mark\n7.View  Internal mark\n8.View  Personal Info\n0.logout");
ch=sc.nextInt();
switch(ch){
case 1: for(i=0;i<j;i++){
        fac[i].dispfac();
        FileInputStream fis=new FileInputStream(f2);
				ObjectInputStream ois =new ObjectInputStream(fis);
				fac[i]=(Faculty)ois.readObject();}
				break;
        
case 2: for(i=0;i<j;i++){
        s[i].getData();
        FileInputStream fi=new FileInputStream(f);
				ObjectInputStream oi =new ObjectInputStream(fi);
				s[i]=(Student)oi.readObject();}
				break;
        
case 3: for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        
        s[i].Attend(2);
        }
        break;
case 4:for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        s[i].end(2);}
        break;
case 5:for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        s[i].first(2);
        }
        break;
case 6:for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        s[i].second(2);  }
        break;
case 7:for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        s[i].imark(2);}
        break;
case 8:for(i=0;i<k;i++){
        System.out.println("required data of student number "+(i+1));
        s[i].perInfo(2);
        }
        break;
case 0:ex=0;        
}
}
}

else if(n==0){
cker=0;
}
else{
System.out.println("Invalid Input");
}
}}catch(Exception e){}
}

}



