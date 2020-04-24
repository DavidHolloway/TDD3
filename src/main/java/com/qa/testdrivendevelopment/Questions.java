package com.qa.testdrivendevelopment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and
	 * generates a 2-dimensional array. The element value in the i-th row and j-th
	 * column of the array should be i*j. <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1. <br>
	 * <br>
	 * For Example: <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]] <br>
	 * multiply(2,1) → [[0,0]] <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays) {
//		for (int i = 0; i < arrayLength; i ++){
//			  for (int j = 0; j < width; j ++){
//			    if (counter < userInput){
//			    counter++;
//			    arr[i][j] = value;
//			      } else {
//			        break;        
//			      }
//			  }
//			  }
		for (int a = 0; a < numOfArrays; a++) {
			int[] numbers = new int[arrayLength];
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers.length; j++) {
					int value1 = Array.getInt(numbers, i);
					int value2 = Array.getInt(numbers, j);
					numbers[i] = value1 * value2;
					// System.out.println(numbers.toString());
				}

			}
			a++;
		}
//		int a = 0;
//		while (a <numOfArrays) {
//			for (int i = 0; i<numbers.length;i++){
//				for(int j =0;j<numbers.length;j++) {
//					numbers[i] = (i*j);
//					System.out.println(numbers.toString());
//				}
//				
//			}	
//			a++;			
//		}

		return null;
	}

	/**
	 * Write a function that accepts a comma separated sequence of words as input
	 * and prints the words in a comma-separated sequence after sorting them
	 * alphabetically.
	 * 
	 * For Example: sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		String[] sorted = wordSequence.clone();
		Arrays.sort(sorted);

		return sorted;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is
	 * 2468.
	 * 
	 * For Example: aPlus(5) → 6170 aPlus(9) → 11106
	 */
	public int aPlus(int num) {
		int result = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				int times = j;
				int numVal = (num * num) * times;

				// int numVal = (num * num);
				// System.out.println(numVal);
				result += numVal;
			}
		}

		return result;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and
	 * returns all the odd numbers as a string, separated by commas. If there are no
	 * odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should
	 * also be given in ascending order.
	 * 
	 * For Example: oddNum("1,2,3,4,5") → "1,3,5" oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		String[] str1 = allNums.split(",");
		int[] intArray = { str1.length };

		String result = "";
		String even = "";
		String odd = "";
		int sum = 0;

		for (String str : str1) {
			// System.out.println(str);//+= here
			int z = Integer.parseInt(str);
			if (z % 2 != 0) {
				// System.out.println(ints[i]);
				String num = Integer.toString(z);
				System.out.println(num);
				//intArray.add(num);
				result = num;
				sum++;
				System.out.println("Hello");
			} else if (Integer.parseInt(str) % 2 == 0) {
				// result = ints[i] + ",";
				System.out.println("HI");
			}
		}

		if (sum == 0) {
			return null;
		}
		return result;
	}

	/**
	 * Define a function that can accept two strings as input and returns the string
	 * of largest length
	 * 
	 * If two strings have the same length, then the function should return both
	 * strings separated by a single space. In this case, the strings should be
	 * returned in the same order in which they were given.
	 * 
	 * For Example: longString("hi","hello") → "hello" longString("three", "two") →
	 * "three" longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		String str1 = input1;
		String str2 = input2;
		String[] myStrings = { str1, str2 };
		String x = myStrings[0];

		if (str1.length() == str2.length()) {
			x = (str1 + " " + str2);
		}
		int i = 0, j = 0;
		for (i = 0; i < myStrings.length; i = j) {
			for (j = i + 1; j < myStrings.length; j++) {
				if (x.length() < myStrings[j].length()) {
					x = myStrings[j];
					break;
				}
			}
		}
		return x;
	}

	/**
	 * Given an email address person@company.com, and a parameter "person" or
	 * "company", write a function which returns the corresponding piece of
	 * information. Your function should ignore case.
	 * 
	 * For Example: email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft" email("Dave@amazon.com",
	 * "person") → "dave"
	 */
	public String email(String email, String parameter) {
//		String[] myArray = {email};
//		System.out.println(myArray);
		int ind1 = email.indexOf("@");
		int ind2 = email.indexOf(".");
		String subString = "";

		if (parameter == "person") {
			subString = email.substring(0, ind1).toLowerCase(); // this will give abc

		} else if (parameter == "company") {
			subString = email.substring(ind1 + 1, ind2).toLowerCase(); // this will give abc

		}
		return subString;
	}

	/**
	 * The fibonacci sequence is the sum of the last two numbers, with index 0 and 1
	 * having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example: fibbonaci(0) → 0 fibbonaci(1) → 1 fibbonaci(2) → 1 fibbonaci(3)
	 * → 2 fibbonaci(4) → 3 fibbonaci(5) → 5 fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		return -1;
	}

	/**
	 * Write a function which, given a string input, returns a string which contains
	 * only the characters with odd indexes.
	 * 
	 * For Example: oddLetters("Sponge") → "pne" oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		String even = "";
		String odd = "";
		for (int i = 0; i < input.length(); i++) {

			if (i % 2 == 0) {
				even += input.charAt(i);
			} else {
				odd += input.charAt(i);
			}
		}

		return odd;
	}

	/**
	 * Write a function which solves the following puzzle. A farm has chickens and
	 * rabbits, and scanners are able to detect the number of heads and legs. How
	 * many chickens do we have, if we know the number of heads and legs? The values
	 * for 'heads' and 'legs' will be inputs. If there are no solutions to the
	 * puzzle, return null
	 * 
	 * For Example: chickenAndRabbits(35, 94) → 23 chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		return null;
	}

	/**
	 * Write a function which checks the validity of a credit card number. The
	 * function should return a boolean, True if the card is valid, or False if it
	 * is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria. - it
	 * must start with a 4, 5 or 6. it must contain exactly 16 digits each digit
	 * must be 0-9 inclusive. it may contain hyphens ("-"), to separate groups of 4
	 * digits only, but it cannot contain any other characters. it must not have 4
	 * or more consecutive repeated digits.
	 * 
	 * For Example: validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False validCard("4444-0123-4567-8901") →
	 * False validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		boolean bool = false;

		if (cardNumber.length() == 16) {
			for (int i = 0; i < cardNumber.length(); i++) {
				if (cardNumber.charAt(i) == 4 || cardNumber.charAt(i) == 5 || cardNumber.charAt(i) == 6) {

				}
			}
		}

		return bool;
	}
}
