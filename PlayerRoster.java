public import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner userInput = new Scanner(System.in);
      final int NUM_PLAYERS = 5;
      int[] jerseys = new int[NUM_PLAYERS];
      int[] ratings = new int[NUM_PLAYERS];
      
      for (int i = 0; i < NUM_PLAYERS; i++) {
         System.out.println("Enter player " + (i+1) + "'s jersey number:");
         int num = userInput.nextInt();
         if (num != jerseys[i] && num >= 0 && num <= 99) {
            jerseys[i] = num;
         }
		   System.out.println("Enter player " + (i+1) + "'s rating:");
		   System.out.println("");
         num = userInput.nextInt();
      
         if (num != ratings[i] && num >= 1 && num <= 9) {
            ratings[i] = num;  
            }
         }
         
	  System.out.println("ROSTER");
	  System.out.println("Player 1 -- Jersey number: " + jerseys[0] +", Rating: " + ratings[0]);
	  System.out.println("Player 2 -- Jersey number: " + jerseys[1] +", Rating: " + ratings[1]);
	  System.out.println("Player 3 -- Jersey number: " + jerseys[2] +", Rating: " + ratings[2]);
	  System.out.println("Player 4 -- Jersey number: " + jerseys[3] +", Rating: " + ratings[3]);
	  System.out.println("Player 5 -- Jersey number: " + jerseys[4] +", Rating: " + ratings[4]);
	  System.out.println("");
	  
	  System.out.println("MENU");
	  System.out.println("u - Update player rating");
	  System.out.println("a - Output players above a rating");
	  System.out.println("r - Replace player");
	  System.out.println("o - Output roster");
	  System.out.println("q - Quit");
	  System.out.println("");
	  System.out.println("Choose an option:");
	  
	  char userCharacter = userInput.next().charAt(0);
	  
	  while (userCharacter != 'q'){
	   if (userCharacter == 'o') {
	      System.out.println("ROSTER");
	      System.out.println("Player 1 -- Jersey number: " + jerseys[0] +", Rating: " + ratings[0]);
	      System.out.println("Player 2 -- Jersey number: " + jerseys[1] +", Rating: " + ratings[1]);
	      System.out.println("Player 3 -- Jersey number: " + jerseys[2] +", Rating: " + ratings[2]);
	      System.out.println("Player 4 -- Jersey number: " + jerseys[3] +", Rating: " + ratings[3]);
	      System.out.println("Player 5 -- Jersey number: " + jerseys[4] +", Rating: " + ratings[4]);
	      System.out.println("");
	   }
	   else if (userCharacter == 'u') {
		   System.out.println("Enter a jersey number:");
		   int num = userInput.nextInt();
		   if (num == jerseys[0]) {
		      System.out.println("Enter a new rating for player:");
		      System.out.println("");
		      num = userInput.nextInt();
		      ratings[0] = num;
		   }  
		   if (num == jerseys[1]) {
		      System.out.println("Enter a new rating for player:");
		      System.out.println("");
		      num = userInput.nextInt();
		      ratings[1] = num;	
		   }
		   if (num == jerseys[2]) {
		      System.out.println("Enter a new rating for player:");
		      System.out.println("");
		      num = userInput.nextInt();
		      ratings[2] = num;
		   }
		   if (num == jerseys[3]) {
		      System.out.println("Enter a new rating for player:");
		      System.out.println("");
		      num = userInput.nextInt();
		      ratings[3] = num;
			}
		   if (num == jerseys[4]) {
		      System.out.println("Enter a new rating for player:");
		      System.out.println("");
		      num = userInput.nextInt();
		      ratings[4] = num;
		   }
	  }
	  else if (userCharacter == 'a') {
	   System.out.println("Enter a rating:");
		System.out.println("");
		int num = userInput.nextInt();
		System.out.println("ABOVE " + num);
		if (num < ratings[0]) {
		   System.out.println("Player 1 -- Jersey number: " + jerseys[0] +", Rating: " + ratings[0]);
		}
		if (num < ratings[1]) {
		   System.out.println("Player 2 -- Jersey number: " + jerseys[1] +", Rating: " + ratings[1]);
		}
		if (num < ratings[2]) {
		   System.out.println("Player 3 -- Jersey number: " + jerseys[2] +", Rating: " + ratings[2]);
		}
		if (num < ratings[3]) {
		   System.out.println("Player 4 -- Jersey number: " + jerseys[3] +", Rating: " + ratings[3]);
		}
		if (num < ratings[4]) {
		   System.out.println("Player 5 -- Jersey number: " + jerseys[4] +", Rating: " + ratings[4]);
		   System.out.println("");
		}
	  }
	  else if (userCharacter == 'r') {
	   System.out.println("Enter a jersey number:");
	   int num = userInput.nextInt();
		if (num == jerseys[0]) {
		   System.out.println("Enter a new jersey number:");
			num = userInput.nextInt();
			jerseys[0] = num;
			System.out.println("Enter a rating for the new player:");
			num = userInput.nextInt();
			ratings[0] = num;
		}
		else if (num == jerseys[1]) {
			System.out.println("Enter a new jersey number:");
			num = userInput.nextInt();
			jerseys[1] = num;
			System.out.println("Enter a rating for the new player:");
			num = userInput.nextInt();
			ratings[1] = num;
		}
		else if (num == jerseys[2]) {
			System.out.println("Enter a new jersey number:");
			num = userInput.nextInt();
			jerseys[2] = num;
			System.out.println("Enter a rating for the new player:");
			num = userInput.nextInt();
			ratings[2] = num;
		}
		else if (num == jerseys[3]) {
			System.out.println("Enter a new jersey number:");
			num = userInput.nextInt();
			jerseys[3] = num;
			System.out.println("Enter a rating for the new player:");
			num = userInput.nextInt();
			ratings[3] = num;
		}
		else if (num == jerseys[4]) {
			System.out.println("Enter a new jersey number:");
			num = userInput.nextInt();
			jerseys[4] = num;
			System.out.println("Enter a rating for the new player:");
			System.out.println("");
			num = userInput.nextInt();
			ratings[4] = num;
		}
		else {
		}

	}  
	System.out.println("MENU");
   System.out.println("u - Update player rating");
	System.out.println("a - Output players above a rating");
	System.out.println("r - Replace player");
	System.out.println("o - Output roster");
	System.out.println("q - Quit");
	System.out.println("");
	System.out.println("Choose an option:");
	userCharacter = userInput.next().charAt(0);
	}
  }
}