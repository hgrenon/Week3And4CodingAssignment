package weekThreeAndFourAssignment;

public class week3and4CodingAssignment {

	public static void main(String[] args) {
	
// Question 1
		
	// a.
		int[] agesA = {3, 9, 23, 64, 2, 8, 28, 93};
		int fA =0;
		
		
		for (int i = 0; i <= agesA.length; i++) {
			if (i == 0) {
			fA = agesA[i];	
			} else if (i == agesA.length) {
			int lA = agesA[agesA.length - 1];
			System.out.println(lA - fA);
		}

	}
		
	// b. 
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 103};
		int f =0;
		
		
		for (int i = 0; i <= ages.length; i++) {
			if (i == 0) {
			f = ages[i];	
			} else if (i == ages.length) {
			int l = ages[ages.length - 1];
			System.out.println(l - f);
		}

	}
		
	
	// c. 
		int sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum = ages[i] + sum;
			
		} 
		int averageAge = sum / ages.length;
		System.out.println(averageAge);
		
		
// Question 2
		
		// a.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double letters = 0;
		
		for (int i = 0; i < names.length; i++) {
			letters = names[i].length() + letters;
			
		} 	double averageLetters = letters / names.length;
			System.out.println(averageLetters);
		
		
		
		// b. 
			
		String stringOfNames = "";
		
		for (int i = 0; i < names.length; i++) {
			stringOfNames = stringOfNames + names[i] + " ";
		}
			System.out.println(stringOfNames);		
			
// Question 3			
			
			
		// DataType VariableName = nameOfArray[nameOfArray.length - 1];
		// ex.
			
			String bob = names[names.length - 1];
			System.out.println(bob);		
			
// Question 4
			
		// DataType VariableName = nameOfArray[0];
		// ex.
			
			String sam = names[0];
			System.out.println(sam);
			
// Question 5
			
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.print(nameLengths[i] + " ");
			
		} System.out.println();
			
// Question 6
		
		int NSum = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			NSum = nameLengths[i] + NSum;
			
		} 
			System.out.println(NSum);
			
//Question 7
			
			System.out.println(newMain("Hello", 3)); // Question 7 tester
			System.out.println(name("Heather", "Grenon")); // Question 8 tester
			
			int[] numbers = {100, 4, 16, 25}; // Question 9 tester
			System.out.println(sumz(numbers));
			
			double[] num = {1.2, 2.4, 3.6, 4.55, 5.67}; // Question 10 & 11 tester
			System.out.println(averageNum(num));
			
			double[] num2 = {2.68, 3.45, 65.2, 12};
			System.out.println(doubleArray(num, num2));
			
			System.out.println(willBuyDrink(true, 11)); // Question 12 tester
			
			int[] mins = {90, 94, 93, 90, 91}; // Question 13 tester
			System.out.println(soccerMins(mins));
}
		
		public static String newMain(String word, int n) {
			String newWord = "";
			
			for (int i = 0; i < n; i++) {
				newWord = newWord + word;
			} 
			return newWord;	
			
// Question 8 
			
			
}			
		public static String name(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		}
		
		
// Question 9 
		
		public static boolean sumz(int[]numbers) {
			int sum = 0;
			
			for (int i = 0; i < numbers.length; i++) {
				sum = sum += numbers[i];
				if (sum > 100) return true;
			} { return false;
			
			}	
		}
		
// Question 10 
		
		public static double averageNum(double[]num) {
			double sum = 0;
			
			for (int i = 0; i < num.length; i++) {
				sum = sum += num[i];
			}
			double average = sum / num.length;
			return average;
		}
		
		
// Question 11
		
		public static boolean doubleArray(double[]num, double[]num2) {
			double sum1 = 0;
			double sum2 = 0;
			for (int i = 0; i < num.length; i++) {
				sum1 = sum1 += num[i];
			}
			for (int i = 0; i < num2.length; i++) {
				sum2 = sum2 += num2[i];
			}
			double averageNum = sum1 / num.length;
			double averageNum2 = sum2 / num2.length;
			if (averageNum > averageNum2) {
				return true;
			} else { return false;
			
			}
		}
		
// Question 12
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} else { return false;
				
			}
		}
// Question 13
		
		// create a method that finds the average of the array soccer game play time. 
		
		public static int soccerMins(int mins[]) {
			int sum = 0;
			
			for (int i = 0; i < mins.length; i++) {
				sum = sum += mins[i];
				
				
			} int aveMins = sum / mins.length;
			return aveMins;
		}
		
		
}