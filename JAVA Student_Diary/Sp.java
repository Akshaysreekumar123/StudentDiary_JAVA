import java.util.Scanner;
import java.io.*;
public class Sp implements Mark, Serializable{
    int mark;

    Sp()
    {
        mark = 0;
    }

    Sp(int m)
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
        System.out.println("Enter Second periodical marks");
        mark  = sc.nextInt();
    } 

    public void Display(){
    System.out.println("The Second periodical mark is :" +mark);
    }
    } 
