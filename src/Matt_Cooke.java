import java.util.Scanner;
/**
 * 
 */

/**
 * @author d.fyvie

 *
 */
/**

*

* Name: Dylan Fyvie

* Teacher: Mr.Hardman

* Assignment #5, Program #c

* Date Last Modified: 11/30/2016

*

*/

public class Matt_Cooke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int [] userArry = new int [5];
		int indexOfSearch = - 1;
		double userValue;
		int minimum;
		
		
		System.out.println("Please enter five numbers?");
		
		for(int i = 0; i < userArry.length; i ++){
			
			System.out.println("Please enter a value: ");
			userArry[i] = userInput.nextInt();
			
		}
		minimum = userArry[0];
		
		for(int i = 0; i < userArry.length; i ++){
			
			if(userArry[i] > minimum){
				minimum = userArry[i];
				if(minimum == userArry[i]){
					indexOfSearch = i;
				}
			}
		}
		System.out.println("The Minimum value is: " + minimum);
		System.out.println("The index of the largest value is: "+ indexOfSearch);
		
		userInput.close();
	}

}
