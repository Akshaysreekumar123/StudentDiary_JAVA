 import java.util.Scanner;
import java.io.*;
public class EndSem implements Mark, Serializable{
    int mark;

    EndSem()
    {
        mark = 0;
    }

    EndSem(int m)
    {
        mark = m;
    }

    public int getMark()
    {
        return mark;
    }

    public void setMark(int m)
    {
        mark = m;
    }

    public void inputMark()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter End semester exam marks");
        mark  = sc.nextInt();
    } 

    public void Display(){
    System.out.println("the first End Semester exam mark is :" +mark);
    }
    }
