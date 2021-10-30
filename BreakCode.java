package WeekDay1;

public class BreakCode {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			System.out.println(i);
			if (i == 6) {
				break; // skip the loop for the current value
			}
		}
		System.out.println(" out of for loop");

	}

}
