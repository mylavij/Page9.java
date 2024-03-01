import java.util.*;

public class DigitsRevision
{
    public static void main (String[] args)
    {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ones = num % 10;
        int tensdigit = (num % 100)/100; 
        int hundredsdigit = num % 100;
        System.out.println("The hundreds-place digit is: " + hundredsdigit);
        System.out.println("The tens-place digit is: " + tensdigit);
        System.out.println("The one's digit is: " + ones);

    }
}
