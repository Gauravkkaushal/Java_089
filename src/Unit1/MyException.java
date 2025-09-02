package Unit1;

import java.io.DataInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {


    int x,y,z=0;
    Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
    try
    {
        x= dis.readInt();
        y=dis.readInt();
        z=x/y;
        System.out.println("Exception not Occurs");
    }
    catch (ArithmeticException e)
    {
        System.out.println(e.getMessage());
    }
    catch (InputMismatchException e)
    {
        System.out.println(e);
    }
    catch (Exception e){
        System.out.println(e);
    }
    finally
    {
        System.out.println("Result is "+z);
    }
}}
