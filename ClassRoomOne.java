package WeekDay1;

public class ClassRoomOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i = 45;
         if (i%3==0 & i%5==0) {
 			System.out.println("Number is TRIZZ & FIZZ");
					} 
         else if (i%5==0) {
			System.out.println("Number is FIZZ");
		} 
         else if (i%3==0) {
			System.out.println("Number is TRIZZ");
		}
         else{
        	 System.out.println("Number is not divisible by 3 or 5");
		}
         
           
	}

}
