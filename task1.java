//package home2;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args)
{
    boolean num=false;
    while(!num)
        num=Num();
}

public static boolean Num()
{
    try
    {
        System.out.println("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        String s = iScanner.nextLine();
        float num=Float.parseFloat(s);
        System.out.println(num);
        return true;
    }
    catch(NumberFormatException e){
        System.out.println("Неверный формат ");
        return false;
    }
}
   
}


