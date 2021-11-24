import java.util.Scanner;  
public class LargestNumber 
{  
public static void main(String[] args)   
{  
int a, b, c, largest, temp;
int digit, sum = 0;
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();
if (a>99 && a<1000 && b>99 && b<1000 && c>99 && c<1000 )
{

temp=a>b?a:b;  
largest=c>temp?c:temp;  
System.out.println("The largest number is: "+largest);

while(largest > 0){   
		digit = largest % 10;  
		sum = sum + digit;  
		largest = largest / 10;  
		}
		System.out.println("Sum of Digits: "+sum);  
}
		else System.out.println("Please enter three digit numbers only");
}  
}  