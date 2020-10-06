import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Personal implements Serializable {
	String phone;
	String address;
	String email;
	String father;
	String mother;
	
	
	
	Personal()
	{
		father = "";
		mother = "";
		email="";
		phone="";
		address="";
	}
	
	Personal(String fname,String mname, String mail, String pno,String add)
	{
		father=fname;
		mother=mname;
		email=mail;
		phone=pno;
		address=add;
	}
	
	
	
	public void getDetails()
	{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of father");
		father=sc.next();
		System.out.println("Enter Name of mother");
		mother=sc.next();
		System.out.println("Enter phone number");
		phone=sc.next();
		int l=phone.length();
		if(l!=10) throw new InvalidNoException();
		System.out.println("Enter the email");
		email=sc.next();
		String s = "@";
		if(!email.contains(s)) throw new InvalidMailException();
		System.out.println("Enter address");
		address=sc.next();
		
		}
		
		catch(InvalidNoException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		catch(InvalidMailException i) {
			System.out.println(i);
			System.exit(0);
		}
	}
	
	public void readFile() {
		try {
			FileInputStream fin = new FileInputStream("ParentDetail.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			Personal ps = (Personal) ois.readObject();
			this.father = ps.father;
			this.mother = ps.mother;
			this.email = ps.email;
			this.phone = ps.phone;
			this.address = ps.address;
			fin.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf);
		
		}
	}
	public void writeFile() {
		try {
			FileOutputStream fout = new FileOutputStream("ParentDetail.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			Personal ps = new Personal(this.father, this.mother, this.email, this.phone, this.address);
			oos.writeObject(ps);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		
		}
	}
	
	public void displayData() {
		System.out.println("Dad's Name:"+father);
		System.out.println("Mom's Name:"+mother);
		System.out.println("Phone:"+phone);
		System.out.println("Email:"+email);
		System.out.println("Occupation:"+address);
	}

	
	

} 
