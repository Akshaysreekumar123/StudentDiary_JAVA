import java.io.Serializable;
import java.util.*;

public class IntMark implements Serializable {
    float inmark;
    Scanner sc=new Scanner(System.in);

    public IntMark()
    {
        inmark=0;
        
    }

    public void setInternals(Fp f1, Sp s1)
    {
    
    
        float p1,p2;
        int ca;
        p1=(f1.getMark()/50)*15;
        p2=(s1.getMark()/50)*15;
        System.out.println("enter continuous assessment mark for the subject");
        ca=sc.nextInt();

        inmark=p1+p2+ca;
    }
    

     public float getInternals(){
        return inmark;
       }


} 
