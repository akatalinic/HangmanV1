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
            System.out.print("- ");
        }
        System.out.println();
    }

    public static void gameOn(String word) {
        Scanner scanner = new Scanner(System.in);
        String userLetter = "";
        ArrayList<Character> guessedLetters = new ArrayList<>();


       // For making the dashes in our secret word so the values are not null/empty
        char[] guessWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            guessWord[i] = '-';
        }

       // For inputting the letters into ArrayList of chars and comparing later
       // on if user input !contain those letters and getting wrong count

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
            while (!userLetter.matches("[a-zA-Z]")){
                System.out.println("Input letters only, and one letter at the time, don't break my game Pedro ლ(ಠ益ಠლ) !");
                System.out.println("Enter a letter");
                userLetter = scanner.nextLine();
            }

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

                    if(counterCorrect == word.length()) {
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");
                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    } else {

                        System.out.print("------------| \n" +
                                " |       <(ಠ_ಠ)> \n" +
                                " |            \n" +
                                " |            \n" +
                                " |            \n" +
                                "_|_           \n");

                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',', ' ').replace("[", "")
                                .replace("]", ""));
                    }
                    break;

                case 2:

                    if(counterCorrect == word.length()) {
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");
                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    } else {

                    System.out.print("------------| \n" +
                                    " |       <(ಠ_ಠ)> \n" +
                                    " |          | \n" +
                                    " |          |  \n" +
                                    " |            \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                            .replace("]",""));
                    }
                    break;

                case 3:

                    if(counterCorrect == word.length()) {
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");

                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    }else {

                    System.out.print("------------| \n" +
                                    " |       <(ಠ_ಠ)> \n" +
                                    " |         /|  \n" +
                                    " |          |  \n" +
                                    " |            \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                            .replace("]",""));
                    }
                    break;

                case 4:

                    if(counterCorrect == word.length()) {
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");
                    }else {

                    System.out.print("------------| \n" +
                                    " |        (•︵•) \n" +
                                    " |         /|\\  \n" +
                                    " |          |  \n" +
                                    " |            \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                            .replace("]",""));

                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    }
                    break;

                case 5:

                    if(counterCorrect == word.length()) {

                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");

                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    }else {

                    System.out.print("------------| \n" +
                                    " |      °՞(-ᗣ-)՞° \n" +
                                    " |         /|\\  \n" +
                                    " |          |  \n" +
                                    " |         /  \n" +
                                    "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println("The end draws near !");
                    System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                            .replace("]",""));
                    }
                    break;

                case 6:

                    if(counterCorrect == word.length()) {
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");

                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    }else {

                        System.out.print("------------| \n" +
                                    " |       <(x_x)> \n" +
                                    " |         /|\\  \n" +
                                    " |          |  \n" +
                                    " |         / \\ \n" +
                                    "_|_           \n");

                    System.out.println("You have been hanged !");
                    System.out.print("The word was: " + word);
                    }

                    break;

                default:

                    if(counterCorrect == word.length()){
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                        System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                        System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                        System.out.print(" Thanks for saving me \n" +
                                "        ヽ(´▽`)ノ \n" +
                                "           | | \n" +
                                "           |_| \n" +
                                "         _/   \\_ \n" +
                                "           \n");

                        System.out.println("• Guess the word •");
                        System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                                .replace("]",""));

                    }else {

                    System.out.print("------------|\n" +
                                     " | \n" +
                                     " | \n" +
                                     " | \n" +
                                     " | \n" +
                                     "_|_ \n");
                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(guessWord).replace(',',' ').replace("[","")
                            .replace("]",""));

                    }
                    break;
            }
        }while (counterCorrect < word.length() && counterWrong < maxGuess) ;
    }

}