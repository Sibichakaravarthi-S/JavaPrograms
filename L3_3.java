import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        float f=s.nextFloat();
        double c=(f-32)/1.8;
        System.out.println("-".repeat(32));
        System.out.println("   Fahrenheit   |    Celcius    ");
        System.out.println("-".repeat(32));
        System.out.printf("%16.2f|%15.2f\n",f,c);
        System.out.println("-".repeat(32));
    }
}