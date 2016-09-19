

public class RamStringTester {

	public static void main(String[] args) {
		
		printHeading();

		RamString string1 = new RamString();
		RamString string2 = new RamString();
		RamString string3 = new RamString();
		
		string1.setWackyString("000dt00akh0");
		string2.setWackyString("12340945007");
		string3.setWackyString("000d t00a0");
		
		
		string1.getEvenCharacters();		//tested to check if the method returned all even chars
		string1.getOddCharacters();			//tested to check if the method returned all odd chars
		string3.countNonDigits();			//tested to validate that the method counted all the non-digits correctly, including white space.
											//this method should return "4"
		
		string1.ramifyString();				//checks to see if zeros in the string are changed accordingly. My method is
											//isn't great, as there are multiple counter examples to it. For example,
											//if there are eight zeros consecutively, then it will subdivide the consecutive zeros
											//into 7 and 1 which gives an incorrect result.
		
		
		string2.convertDigitsToRomanNumeralsInSubstring(0, 12);			//this should throw a MyIndexOutOfBounds Exception because the
																		//end position extends farther than the length of the string
		
		string2.convertDigitsToRomanNumeralsInSubstring(9, 0);			//this throws an IllegalArgument Exception because the starting
																		//position is greater than the end position, which is illogical
		
		string2.convertDigitsToRomanNumeralsInSubstring(0, 9);			//this outputs a modified string in which the numbers are converted
																		//to Roman numerals accordingly
		
		
	}

	public static void printHeading()
	{
		System.out.println("Cory Gray\nFall 2016 CMSC 256 Programming Project 2: WackyStringInterface\nThe purpose of this project is "
				+ "to create a program that implements\nthe WackyStringInterface. Most of the methods require string\nmanipulation "
				+ "by utlizing methods from the Java API such as\nStringBuilder, substring, charAt, and more. \n\n\n");
	}
}
