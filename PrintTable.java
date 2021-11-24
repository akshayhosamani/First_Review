import java.util.Scanner;
public class PrintTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		if (n%2==0)
			System.out.println(n+" is an even number");
		else System.out.println(n+" is a odd number");
		for(int i=1;i<=10;i++) {
			int p=n*i;
			System.out.println(n+" * " +i+" = "+p);
		}
		
	}

}
//Java Program to Swap Two Numbers and combine that two numbers then find the sum of digits;(Example 67 and 89 => after swap 89 and 67 , after combine 8967 => sum of digit => 30);
//Java Program to Check Whether a Number is Even or Odd and print table of that number till 10;
//Java Program to take the 3 digit number from user and Find the Largest Among Three Numbers and using largest number find sum of digit;