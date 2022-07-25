import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		if(n>=90&& n<=100) {
			System.out.println("A");
		}
		else if(n>=80 && n<90) {
			System.out.println("B");
		}
		else if(n>=70 && n<80) {
			System.out.println("C");
		}
		else if(n>=0 && n<70) {
			System.out.println("F");
		}
		else {
			System.out.println("Number not in Range");
		}
		
			
		

	}

}
