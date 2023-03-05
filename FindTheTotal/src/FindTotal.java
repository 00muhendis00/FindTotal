import java.util.Scanner;
public class FindTotal {
	public static void main(String[] args) {
		int num;
		int total=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a count");
		num = scan.nextInt();
		
		while(num%2==0) {
			int entry;
			System.out.print("Enter a number ");
			entry = scan.nextInt();
			if ((entry % 2 == 0) && (entry % 4 == 0)) {
				total = entry + total;
			}
			else {break;}
			
		}
		System.out.print("Total is " + total);
	}
}
