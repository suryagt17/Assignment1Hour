package initial_Print;

public class NumberPyramidUp {

	public static void main(String[] args) {
		
		int counter = 10,sum = 0;
		for (int i = 1; i <= counter; i++) {
			
			for (int j = 0; j < i; j++) {
				
				sum += 1;
				System.out.print(sum);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
