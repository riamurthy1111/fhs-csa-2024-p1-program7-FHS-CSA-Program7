//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter schrute-bucks:");
        int schruteBucks = 0;
        schruteBucks = myScanner.nextInt();
        System.out.println("Enter klevins:");
        int klevins = 0;
        klevins = myScanner.nextInt();
        System.out.println("Enter stanley-nickels:");
        int stanleyNickels = 0;
        stanleyNickels = myScanner.nextInt();
        double answer;
        answer = ((klevins * 12 + stanleyNickels)/240.0)+ schruteBucks;
        answer = ((int)((answer + 0.005) * 100)) / 100.0;
        System.out.println("Decimal schrute-bucks = $" + answer);
    }
}
//Paste console output below:
/*
Enter schrute-bucks:
7
Enter klevins:
17
Enter stanley-nickels:
9
Decimal schrute-bucks = $7.89
*/
