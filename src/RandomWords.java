import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RandomWords {

    private String[] randomWords = {"match", "harass", "longing", "respect", "wealthy", "allow", "square", "march", "aware", "lopsided",
            "shocking", "naughty", "language", "show", "preach", "famous", "load", "cause", "delight", "careful", "parsimonious",
            "rock", "moon", "racial", "temper", "magenta", "health", "glistening", "oranges", "giddy", "obsolete", "young", "zip",
            "tenuous", "haunt", "horse", "blood", "murder", "history", "peck", "medical", "embarrassed", "ritzy", "sock", "argument",
            "snake", "inconclusive", "month", "vivacious", "engine", "zephyr", "inexpensive", "pour", "enchanted", "wood", "grin",
            "ticket", "rose", "voiceless", "daughter", "promise", "cap", "beam", "actor", "sigh", "regret", "mice", "start",
            "evanescent", "smash", "travel", "mundane", "thick", "toothbrush", "relieved", "sun", "seat", "bustling", "guarantee",
            "cultured", "yummy", "heat", "cent", "female", "apparatus", "second", "tawdry", "heavy", "person", "field", "story",
            "zoom", "experience", "car", "realize", "overjoyed", "amused", "noiseless", "squalid", "happen"};


    public String generateWord() {

        String randomWord = randomWords[(int) (Math.random() * (randomWords.length))];


        return randomWord;
    }


    public static void playingField(String word) {

        for (int i = 0; i < word.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void gameOn(String word) {
        Scanner scanner = new Scanner(System.in);
        String userLetter = "";
        ArrayList<Character> guessedLetters = new ArrayList<>();

        char[] guessWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            guessWord[i] = '-';
        }


        ArrayList<Character> secretWord = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){
            secretWord.add(word.charAt(i));
        }



        int counterCorrect = 0;
        int counterWrong = 0;
        int maxGuess = 6;

        do {
            System.out.println("You have: " + (maxGuess - counterWrong) + " lives left");
            System.out.print("Please enter a letter: ");

            userLetter = scanner.nextLine();
            userLetter = userLetter.toLowerCase();

            if (guessedLetters.contains(userLetter.charAt(0))) {
                System.out.println("You already inputted that letter!");
            } else {
                guessedLetters.add(userLetter.charAt(0));
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == userLetter.charAt(0)) {
                        guessWord[i] = userLetter.charAt(0);
                        counterCorrect++;
                    }
                }

                if(!secretWord.contains(userLetter.charAt(0))){
                    counterWrong++;
                }
            }

            switch(counterWrong) {

                case 1:
                    System.out.print("------------| \n" +
                                     " |        (ಠ_ಠ) \n" +
                                     " |            \n" +
                                     " |            \n" +
                                     " |            \n" +
                                     "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(guessWord);

                    break;

                case 2:

                    System.out.print("------------| \n" +
                                    " |        (ಠ_ಠ) \n" +
                                    " |          | \n" +
                                    " |          |  \n" +
                                    " |            \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(guessWord);

                    break;
                case 3:

                    System.out.print("------------| \n" +
                                    " |        (ಠ_ಠ) \n" +
                                    " |         /|  \n" +
                                    " |          |  \n" +
                                    " |            \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(guessWord);

                    break;

                case 4:
                    System.out.print("------------| \n" +
                                    " |        (ಠ_ಠ) \n" +
                                    " |         /|\\  \n" +
                                    " |          |  \n" +
                                    " |            \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(guessWord);

                    break;

                case 5:
                    System.out.print("------------| \n" +
                                    " |        (ಠ_ಠ) \n" +
                                    " |         /|\\  \n" +
                                    " |          |  \n" +
                                    " |         /  \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(guessWord);

                    break;


                case 6:

                    System.out.print("------------| \n" +
                                    " |        (x_x) \n" +
                                    " |         /|\\  \n" +
                                    " |          |  \n" +
                                    " |         / \\ \n" +
                                    "_|_           \n");

                    System.out.println("You have been hanged !");
                    System.out.print("The word was: " + word);

                    break;

                default:
                    System.out.print("------------|\n" +
                                     " | \n" +
                                     " | \n" +
                                     " | \n" +
                                     " | \n" +
                                     "_|_ \n");
                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(guessWord));

                    break;
            }
        }while (counterCorrect < word.length() && counterWrong < maxGuess) ;

    }

}