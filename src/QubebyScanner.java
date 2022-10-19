import java.util.Scanner;

public class QubebyScanner {

	public static void main(String[] args) {
		
		int number = 0;
		// TODO Auto-generated method stub
		do {
		System.out.print("enter a number:"+ number);
		Scanner scanner=new Scanner(System.in);
		int number1=scanner.nextInt();
		
		System.out.println("the cube is:"+ (number1*number1*number1));
		}while(number>=0);
		System.out.print("thank you have a great day");
	}

}
