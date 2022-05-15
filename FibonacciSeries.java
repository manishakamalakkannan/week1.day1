package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
	
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		
		
				// Print first number
		System.out.println("The first number is "+ firstNum);
		System.out.println("The second number is "+ secNum);
		
		
		// Iterate from 1 to the range
		for(int i =1;i<=range;++i) {

				
				
				// add first and second number assign to sum
			 int sum = firstNum+secNum;
				// Assign second number to the first number
firstNum=secNum;
				// Assign sum to the second number
				secNum=sum;
				// print sum
				
				System.out.println(" The sum is"+ sum);
				

	  
}
	}
}


