package p1;
import java.util.Scanner;
public class NewClass {
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Input a String: ");
        String s = scan.nextLine();
        NewClass nc = new NewClass();
        int count = nc.numChars(s);
        System.out.println("The Number of Chars is: " + count);
        
    }
    
    private int numChars(String s){
        int numChars = s.length();
        return numChars;
    }
    
}
