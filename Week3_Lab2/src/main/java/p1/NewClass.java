package p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        NewClass nc = new NewClass();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int testNum = scan.nextInt();
        if(nc.isPrime(testNum) == false)
        {
            System.out.println(testNum + " is not prime");
        }
        else{
            System.out.println(testNum + " is prime");
        }
        
        int[] numVars = {3,4,8,7,9,10,12,5};
        System.out.println("The sum of prime numbers in the array is: " + nc.arrSum(numVars));
        
       int[] arrNums = nc.getArray("nums.txt.txt");
       
       int sum = nc.arrSum(arrNums);
        System.out.println("The sum of prime numbers in the array is: " + sum);
         }
    
    private int[] getArray(String fileName) throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(new File(fileName));
        int lineCount = 0;
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        while(read.readLine() != null)
            lineCount++;
        int[] arr = new int[lineCount];
        int i = 0;
        while(scan.hasNext())
        {
            arr[i] = scan.nextInt();
            i++;
        }
        
        return arr;
    }
    
    private int arrSum(int[] numVars)
    {
        int sum = 0;
        for(int i = 0; i < numVars.length; i++)
        {
            if(isPrime(numVars[i]) == true)
            {
                sum += numVars[i];
            }
        }
        
        return sum;
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
