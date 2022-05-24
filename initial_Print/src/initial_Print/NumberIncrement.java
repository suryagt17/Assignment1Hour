package initial_Print;


public class NumberIncrement {

	public static void main(String[] args) {
		
		int rowLength = 6;
		for (int i = 1; i <= rowLength; i++) {
			
			//System.out.println(i);
			int columnLength = i;
			for (int j = 1; j <= columnLength; j++) {
				
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
