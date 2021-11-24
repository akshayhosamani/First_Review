import java.util.*;  
class SwapAndAdd {  
    public static void main(String[] args) {  
       int a, b, c;
	   int digit, sum = 0; 
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
       a = sc.nextInt();  
       b = sc.nextInt();
	   //swapping numbers
       c = a;  
       a = b;  
       b = c;  
       System.out.println("After swapping: "+a+" "+b);
	   //combining numbers
	   String str1 = Integer.toString(a);
	   String str2 = Integer.toString(b);
	   String str3=str1+str2;
		System.out.println("Combined intigers = "+str3);
		int d=Integer.parseInt(str3);
		//adding digits of number
		while(d > 0){   
		digit = d % 10;  
		sum = sum + digit;  
		d = d / 10;  
		}
		System.out.println("Sum of Digits: "+sum);  
		}  
    }      