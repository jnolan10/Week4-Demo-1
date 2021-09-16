package p1;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int testNum = scan.nextInt();
        NewClass nc = new NewClass();
        if(nc.isPrime(testNum) == false)
        {
            System.out.println(testNum + " is not prime");
        }
        else{
            System.out.println(testNum + " is prime");
        }
   }
    private boolean isPrime(int n){
        for(int i = 2; i < n-1; i++)
        {
            if(n % i == 0)
            {
               return false;
            }
        
        }
        return true;   
        
    }
}
