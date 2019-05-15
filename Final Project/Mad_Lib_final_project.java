/*
Authors: Skyler Wisdom & David Cerna
Date: May 8, 2019
*/

import java.util.Scanner;

class Mad_Lib_final_project {
	public static void main(String[] args) {
		//Scanners
		Scanner menuEntry = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Mad-Lib Generator by Wacko International. ");
		System.out.println();
		
		//user menu input
		System.out.println("Enter one of the following commands:");
		System.out.println("1 - Graduating Mad-Lib");
		System.out.println("2 - Another Mad-Lib");
		System.out.println("3 - exit");
		
		//2D array madLib
		String[][] madLib = {{ "Dear", " ", "Congrats", "to", "the", " ", "grad", "ever!"},
						  { "We're", "so", " ,", "life", "is", "a", " ", "so", "make", "sure", "you", " ."},
						  { "Find", "ways", "to", " ", "other", "people,", "explore", " ", "and", "try", " ", "things!"},
						  { "Just", "remember,", "whether", "you", " ", "or", " ", "never", "lose", "heart", "because", "you", "are,"},
						  { "and", "always", "will", "be,", "our", " ", " ", " ", " "}};

		//stores menu choice				
		System.out.println();
		System.out.println("Enter \"1\", \"2\" or \"3\"");
		int menuChoice = menuEntry.nextInt();
		
		//Sentinal value
		while (menuChoice != 3) {

			if (menuChoice < 1 || menuChoice > 3) {

				System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
				menuChoice = menuEntry.nextInt();

			}
			
			//menu choice 1 //user input stored in array
			else if(menuChoice == 1) {
				System.out.println("\nI will ask you to provide vaious words.");
				System.out.println("Input a graduate name: ");
				madLib[0][1] = input.nextLine();
				System.out.println("Input a adjective: ");
				madLib[0][5] = input.nextLine();
				System.out.println("Input a feeling: ");
				madLib[1][2] = input.nextLine();
				System.out.println("Input a food: ");
				madLib[1][6] = input.nextLine();
				System.out.println("Input a verb: ");
				madLib[1][11] = input.nextLine();
				System.out.println("Input a noun: ");
				madLib[2][3] = input.nextLine();
				System.out.println("Input a adjective: ");
				madLib[2][7] = input.nextLine();
				System.out.println("Input a verb: ");
				madLib[2][10] = input.nextLine();
				System.out.println("Input another verb: ");
				madLib[3][4] = input.nextLine();
				System.out.println("Input an adjective: ");
				madLib[3][6] = input.nextLine();
				System.out.println("Input a type of relationship: ");
				madLib[4][5] = input.nextLine();
				System.out.println("Input a form of warm fuzzies: ");
				madLib[4][7] = input.nextLine();
				System.out.println("Input a wisher: ");
				madLib[4][8] = input.nextLine();

			}
			//menu choice
			else if(menuChoice == 2) {
				//..something else
			}
			//menu choice
			else if(menuChoice == 3) {
				//...exit program
			}
			//print string array madLib
			for (String[] row : madLib){
				for (String element : row) {
					System.out.print(element + " ");
					
				}
			}
			//Re-ask for user input //display menu
			System.out.println();		
			System.out.println("\nWelcome to Mad-Lib Generator by Wacko International. ");
			System.out.println();

			System.out.println("Enter one of the following commands:");
			System.out.println("1 - Graduating Mad-Lib");
			System.out.println("2 - Another Mad-Lib");
			System.out.println("3 - exit");
		
		}   
	}
}