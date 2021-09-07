
import java.util.*;
public class PrimeFinder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter beginning number: ");
		int begin=sc.nextInt();
		
		if(begin==1)
		{
			begin=2;
		}
		System.out.println("Enter the end number:  ");
		int end=sc.nextInt();
		System.out.println("Prime numbers between "+begin+" and "+end+" are:");
		System.out.println(findPrime(begin,end));	

	}
	public static String findPrime(int begin,int end) {
		String primeNumbers="";
		boolean isPrime=true;
		 for (int i = 2; i <= end; i++) {
	            isPrime = CheckPrime(i);
	            if (isPrime) {
	                primeNumbers= primeNumbers + i + " ";
	            }
	        }
		 return primeNumbers;
		
		
	}
	 public static boolean CheckPrime(int numberToCheck) {
	        int remainder;
	        for (int i = 2; i <= numberToCheck / 2; i++) {
	            remainder = numberToCheck % i;
	            //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
	            if (remainder == 0) {
	                return false;
	            }
	            
	        }
			return true;
	 }
}
