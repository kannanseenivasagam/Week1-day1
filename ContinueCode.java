package WeekDay1;

public class ContinueCode {

	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			if (i == 4) {
				continue; // skip the loop for the current value
			}
			System.out.println(i);

		}
		System.out.println(" out of the for loop");

	}

}
