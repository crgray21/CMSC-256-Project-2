
public class RamString implements WackyStringInterface
{
	String str;
	
	RamString(String str)
	{
		this.str = str;
	}

	RamString()
	{
		str = "";
	}
	
	public void setWackyString(String string)
	{
		str = string;
	}
	
	public String getWackyString()
	{
		return str;
	}
	
	public String getEvenCharacters()
	{
		String evenChars = "";
		
		for (int i = 1; i < getWackyString().length()-1; i = i+2)							//start at even index and increment by 2 gives all even chars
		{
			evenChars += getWackyString().charAt(i);	
		}
		
		System.out.println("Even characters in the string: " + evenChars + "\n");
		return evenChars;
	}
	
	public String getOddCharacters()
	{
		String oddChars = "";
		
		for (int i = 0; i < getWackyString().length()-1; i = i+2)
		{
			oddChars += getWackyString().charAt(i);												//start at odd index and increment by 2 gives all odd chars
		}
	
		System.out.println("Odd characters in the string: " + oddChars + "\n");
		return oddChars;
	}
	
	public int countNonDigits()
	{
		int nonDigitCount = 0;
		
		for (int i = 0; i < getWackyString().length()-1; i++)
		{

				if(Character.isLetter(getWackyString().charAt(i)))						//A validation of whether the current character is a letter or whitespace
					nonDigitCount ++;
				if(Character.isWhitespace(getWackyString().charAt(i)))
					nonDigitCount++;
		}
		
		System.out.println("The amount of non-digits in the string: " +nonDigitCount+ "\n");
		
		return nonDigitCount;
	}
	
	public void ramifyString()
	{
		String ramString = getWackyString();

		for (int i = 0; i < getWackyString().length()-1; i++)
		{
	
			ramString = ramString.replaceAll("00000", "BaMbI");
			ramString = ramString.replaceAll("0000", "OnYx");
			ramString = ramString.replaceAll("000", "YaK");
			ramString = ramString.replaceAll("00", "VCU");
			ramString = ramString.replaceAll("0", "Rams");
			ramString = ramString.replaceAll("YaK", "000");
			ramString = ramString.replaceAll("OnYx", "0000");
			ramString = ramString.replaceAll("BaMbI", "00000");
		}
		
		System.out.println("The ramified string: " + ramString + "\n");
	}
	
	
	public void convertDigitsToRomanNumeralsInSubstring(int startPosition, int endPosition)
			throws MyIndexOutOfBoundsException, IllegalArgumentException
			{
		
				StringBuilder romanString = new StringBuilder(getWackyString());
				
				try																			//try block to throw and catch the exceptions, in the case that
				{																			//the start and end positions are not functional.
					if (startPosition < 0 || endPosition > romanString.length())
						throw new MyIndexOutOfBoundsException("Starting or ending position(s) are outside the length of the string.");
					if (startPosition > endPosition)
						throw new IllegalArgumentException("Starting position is greater than ending position.");
				
					romanString.append(0);											//this is used so that the last character/digit of the String will still be converted.
					int i;															//The 0 is deleted at the end of the method so that the result is correct.
					for (i = startPosition; i < romanString.length(); i++)
					{

						switch(romanString.charAt(i))						//switch statement to convert the character based on value
						{
							case '1':
								romanString.replace(i, i+1, "I");
								break;
							case '2':
								romanString.replace(i, i+1, "II");
								break;
							case '3':
								romanString.replace(i, i+1, "III");
								break;
							case '4':
								romanString.replace(i, i+1, "IV");
								break;
							case '5':
								romanString.replace(i, i+1, "V");
								break;
							case '6':
								romanString.replace(i, i+1, "VI");
								break;
							case '7':
								romanString.replace(i, i+1, "VII");
								break;
							case '8':
								romanString.replace(i, i+1, "VIII");
								break;
							case '9':
								romanString.replace(i, i+1, "IX");
								break;
						}		
					
					}
					
					romanString.deleteCharAt(i-1);
					System.out.println("Converted numerals: " + romanString + "\n");
					} 
				
					catch(MyIndexOutOfBoundsException e1) 												//catch blocks for both types of expected exceptions
					{
						System.err.println("Caught MyIndexOutofBoundsException: " +e1.getMessage() + "\n");
					}
					
					catch (IllegalArgumentException e2)
					{
						System.err.println("Caught IllegalArgumentException: " +e2.getMessage() + "\n");
					}
			}
				
/* Leaving for later Reference***	
 * Some bad code to read that counts the amount of consecutive zeros. The idea was to use this to modify the string based on the count, 
 * and then loop the count again checking for another set of zeros, therefore changing the zeros on an as needed basis. When the loop reiterated,
 * since the first set of zero(s) changed, then the count could proceed to the next continuous set of zeros. If the count of continuous zeros were
 * greater than 2, than the idea was to find a way to skip past those zeros within the Ramify() method, but I had trouble finding a way past that.
 *  For one zero, Ramify() would change the char to a string on that index, but if the return values was equal to 2, then it would change the 
 *  two zeros to "VCU" ranging from the index "i" to "i+2". The idea was sound, but I ran into a lot of pitfalls. The current usage of Ramify()
 *  is very scrappy and unreliable. Keeping here for later reference... 
 
	public int countConsecutiveZeros()
	{
		int zeroCount = 0;
		char zero = '0';
		
		for (int i = 0; i < getWackyString().length()-1; i++)
		{
			
			if (getWackyString().charAt(i) == zero)
				zeroCount++;
			if (getWackyString().charAt(i) == zero && getWackyString().charAt(i+1) != zero)
			{
					break;
			}
			
		}
		System.out.println(zeroCount);
		return zeroCount;
	}
*/	
	
}