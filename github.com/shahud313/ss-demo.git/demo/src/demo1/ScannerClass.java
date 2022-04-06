package demo1;
import java.util.Scanner;

public class ScannerClass {

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter operation {add,sub,mult & div}=");
			
			String s=sc.next();
			System.out.println("Enter two integer for "+s+"=" );
			double a=sc.nextDouble(),b=sc.nextDouble();
			switch(s)
			{
			case "add": System.out.println("addition is="+ (a+b));
				break;
			case "sub":System.out.println("substraction is="+ (a-b));
			break;
			case "mult":System.out.println("multiplication is="+ (a*b));
			break;
			case "div":System.out.println("Division is="+(a/b));
			break;
			default:System.out.println("invalid method");
			}
		}

	}

