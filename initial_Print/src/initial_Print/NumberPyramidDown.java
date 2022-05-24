package initial_Print;

public class NumberPyramidDown {

	public static void main(String[] args) {
		
		int counter = 5,sum =1;
		while( counter > 0) {
		
			counter--;
			for (int i = 1 ; i <= counter; i++) {
				
				System.out.print(sum);
				System.out.print(" ");
				sum += 1;
			}
			System.out.println("");
		}
	}
}
