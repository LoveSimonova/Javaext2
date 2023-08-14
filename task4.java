import java.util.Scanner;

public class task4 {

    public static void main(String[] args)
{
    str();
}

public static void str()
{
    
        System.out.println("Введите строку: ");
        Scanner iScanner = new Scanner(System.in);
        String s = iScanner.nextLine();
        System.out.println(s);
        if(s.isEmpty())
            System.out.println("Пустая строка");
    
}
   
}
