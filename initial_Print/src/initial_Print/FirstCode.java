package initial_Print;

public class FirstCode {

	public static void main(String[] args) {
		
		int rowLength = 10;
		for (int i = 0; i < rowLength; i++) {
			
			int columnLength = 20;
			for (int j = 0; j < columnLength; j++) {
				
				if ( (i > 0 && i < rowLength-1) && (j>0 && j < columnLength-1) ) 
				{
				
					System.out.print(" ");
				}
				//do nothing
				else {	
					
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}
