import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Harmonik Sayi
        System.out.print("Please enter your number: ");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double result=0;
        for (double i=1;i<=n;i++) {
             result += (1/i);
        }
        System.out.println(result);
    }
}