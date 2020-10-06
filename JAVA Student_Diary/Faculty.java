import java.util.*;
import java.io.*;

public class Faculty implements Serializable{
	
	String faculty;
	String fid;
	Faculty(){
		faculty=null;
		fid=null;
	}
	public void setfac()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter faculty details \n name and id :");
		this.faculty=sc.next();
		this.fid=sc.next();
	}

	public void dispfac()
	{
		System.out.println("Name of Faculty :"+faculty+" Faculty id :"+fid);
	}
}
