import java.util.Arrays;
import java.util.Scanner;
public class Hangman {
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel",
                                        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
                                         "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog",
                                         "goat", "goose", "hawk", "lion", "lizard", "llama", "mole",
                                         "monkey", "moose", "mouse", "mule", "newt", "otter", "owl",
                                         "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat",
                                         "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk",
                                         "sloth", "snake", "spider", "stork", "swan", "tiger", "toad",
                                         "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat",
                                         "zebra"};
   public static String[] gallows = {
                                            "+---+\n" +
                                            "|   |\n" +
                                            "    |\n" +
                                            "    |\n" +   //if the user didn't miss any guesses.
                                            "    |\n" +
                                            "    |\n" +
                                            "=========\n",
                                        
                                            "+---+\n" +
                                            "|   |\n" +
                                            "O   |\n" +   //if the user missed one guess.
                                            "    |\n" +
                                            "    |\n" +
                                            "    |\n" +
                                            "=========\n",
                                        
                                            "+---+\n" +
                                            "|   |\n" +
                                            "O   |\n" +    //if the user missed two guesses.
                                            "|   |\n" +
                                            "    |\n" +
                                            "    |\n" +
                                            "=========\n",
                                        
                                            " +---+\n" +
                                            " |   |\n" +
                                            " O   |\n" +   //if the user missed three guesses.
                                            "/|   |\n" +
                                            "     |\n" +
                                            "     |\n" +
                                            " =========\n",
                                        
                                            " +---+\n" +
                                            " |   |\n" +
                                            " O   |\n" +
                                            "/|\\  |\n"+   //if the user missed four guesses.
                                            "     |\n" +
                                            "     |\n" +
                                            " =========\n",
                                        
                                            " +---+\n" +
                                            " |   |\n" +
                                            " O   |\n" +
                                            "/|\\  |\n" +  //if the user missed five guesses.
                                            "/    |\n" +
                                            "     |\n" +
                                            " =========\n",
                                        
                                            " +---+\n" +
                                            " |   |\n" +
                                            " O   |\n" +
                                            "/|\\  |\n" +   //if the user missed six guesses.
                                            "/ \\  |\n" +
                                            "     |\n" +
                                            " =========\n"};
                                        
    public static void main(String[] args) {
      
      Scanner scan =new Scanner(System.in);
      
      String word= randomWord();
      
      char[]placeholders=new char[word.length()];  // generate the array for print char in placeholder '_'.....
        // make a loop.. to print the char in placeholders.
      for(int i=0;i<placeholders.length;i++){
          placeholders[i]='_';
          System.out.print(placeholders[i]);

        }
        int  misses=0;
        char [] missedguesses= new char[6];
        while(misses<6){
          System.out.print(gallows[misses]);
          
          System.out.print("Word: ");
          printPlaceholders(placeholders);
          System.out.print("\n");

          System.out.print("Misses: ");
          printMissedGuesses(missedguesses);
          System.out.print("\n\n");

          System.out.print("Guess:");
          char guess=scan.nextLine().charAt(0);// for taking character from user...
          System.out.print("\n");
        
        if(checkGuess(word, guess)){
          updatePlaceholders(guess, word, placeholders);
        }
        else{
          missedguesses[misses]=guess;
          misses++;
        }
        // toCharArray() method converts the given string into a sequence of characters. The returned array length is equal to the length of the string.
        //The Arrays.equals() method checks the equality of the two arrays in terms of size, data, and order of elements. This method will accept the two arrays which need to be compared, and it returns the boolean result true 
        //if both the arrays are equal and false if the arrays are not equal.
        if(Arrays.equals(placeholders,word.toCharArray())){
            System.out.print(gallows[misses]);
            System.out.print("\nWord: ");
            printPlaceholders(placeholders);
            System.out.println("Good WorK!");
            break;
        } 

      }
      if(misses==6){
        System.out.print(gallows[6]);
        System.out.println("RIP!");
        System.out.print("\n The word was: '"+ word +"'");
        

      } 
        scan.close();
    } 
   public static String randomWord(){// returns a random word from the list of random words.
    // use random number from (0-1) and multiply with index of words.length();
    int num= words.length; // give the word length in array words[]--
    double randomnum=Math.random();
    int indexnum=(int)(randomnum*num);
    return words[indexnum];
  }
   public static boolean checkGuess(String word , char guess){// returns true if the user guessed a letter from the word correctly.
     for(int i=0;i<word.length();i++){
        if(word.charAt(i)==guess){ //  charAt(i) method returns a char value at the given index number(i).
          return true;
        }
     }
     return false;
  }
  public static void updatePlaceholders(char guess, String word, char[] placeholders){// updates the placeholders when the user makes a correct guess.
   
    for(int j=0;j<word.length();j++){
      if(word.charAt(j)==guess){
         placeholders[j]=guess;
      }
    }
  
  }
   public static void printPlaceholders(char[] placeholders) 
   {  //prints the placeholders.
       for(int i=0;i<placeholders.length;i++){
        System.out.print(" "+placeholders[i]);
       }
     System.out.print("\n");
  }
   public static void printMissedGuesses(char[] misses)
   {  //prints guesses that the user missed. 
      for(int i=0;i<misses.length;i++){
        System.out.print(misses[i]);
      }
  
  }

}
