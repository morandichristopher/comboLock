import java.util.Scanner;
public class ComboLockDemo {

	public static void main(String[] args) {
		

		comboLock c = new comboLock(30, 20, 10);
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int first;
			first = in.nextInt();
			if(first > 39 || first < 0) break;
				
			System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int second;
			second = in.nextInt();
			if(second > 39 || second < 0) break;
				
			System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int third;
			third = in.nextInt();
			if(third > 39 || third < 0) break;
			
			c.turnLeft(first);
			c.turnRight(second);
			c.turnLeft(third);
			
			boolean isTrue=c.open();
			if(isTrue) {
				System.out.println("You opened the lock!");
			}
			else {
				System.out.println("You did not open the lock!");
			}
		}
		
		
	}

}
