import java.util.Scanner;
import java.io.*;
public class Fp implements Mark, Serializable{
    int mark;

    Fp()
    {
        mark = 0;
    }

    Fp(int m)
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
        System.out.println("Enter First periodical marks");
        mark  = sc.nextInt();
    } 

    public void Display(){
    System.out.println("the first periodical mark is :" +mark);
    }
    }
