import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Game {

    private int counterCorrect;
    private int counterWrong;

    private String randomWord;

    private  char [] randomWordToChar;

    public char[] getRandomWordToChar() {
        return randomWordToChar;
    }

    public void setRandomWordToChar(char[] randomWordToChar) {
        this.randomWordToChar = randomWordToChar;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public int getCounterCorrect() {
        return counterCorrect;
    }

    public void setCounterCorrect(int counterCorrect) {
        this.counterCorrect = counterCorrect;
    }

    public int getCounterWrong() {
        return counterWrong;

    }

    public void setCounterWrong(int counterWrong) {
        this.counterWrong = counterWrong;
    }


    public void initializeGame(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();
    }


    public void gameOn(String word) {
        Scanner scanner = new Scanner(System.in);
        setRandomWord(word);

        String userLetter;
        ArrayList<Character> guessedLetters = new ArrayList<>();


        // For making the dashes in our secret word so the values are not null/empty
        char[] guessWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            guessWord[i] = '_';
            setRandomWordToChar(guessWord);
        }

        // For inputting the letters into ArrayList of chars and comparing later
        // on if user input !contain those letters and getting wrong count

        ArrayList<Character> secretWord = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            secretWord.add(word.charAt(i));
        }

        int counterCorrect = 0;
        int counterWrong = 0;
        int maxGuess = 6;


        // Main part of the game is below

        do {
            System.out.println("You have: " + (maxGuess - counterWrong) + " lives left");
            System.out.print("Please enter a letter: ");
            userLetter = scanner.nextLine();
            while (!userLetter.matches("[a-zA-Z]")) {
                System.out.println("Input letters only, and one letter at the time, don't break my game Pedro ლ(ಠ益ಠლ) !");
                System.out.print("Enter a letter: ");
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
                        setRandomWordToChar(guessWord);
                        counterCorrect++;
                        setCounterCorrect(counterCorrect);
                    }
                }

                if (!secretWord.contains(userLetter.charAt(0))) {
                    counterWrong++;
                    setCounterWrong(counterWrong);
                }
            }
            Collections.sort(guessedLetters);   // sorts all the guessed letters in order
            hangMan(); // prints hangman method depending on the wrongcounter

            if ( getCounterCorrect() < word.length() && getCounterWrong() < maxGuess){
                System.out.print("You inputted following letters: ");
                System.out.println(guessedLetters.toString().replace("[", "").replace("]", ""));
            }
        } while (getCounterCorrect() < word.length() && getCounterWrong() < maxGuess);
    }


    public void hangMan () {

        switch (getCounterWrong()) {

            case 1:

                if (getCounterCorrect() == randomWord.length()) {
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
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                } else {

                    System.out.print("------------| \n" +
                            " |       <(ಠ_ಠ)> \n" +
                            " |            \n" +
                            " |            \n" +
                            " |            \n" +
                            "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));
                }
                break;

            case 2:

                if (getCounterCorrect() == randomWord.length()) {
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
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                } else {

                    System.out.print("------------| \n" +
                            " |       <(ಠ_ಠ)> \n" +
                            " |          | \n" +
                            " |          |  \n" +
                            " |            \n" +
                            "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));
                }
                break;

            case 3:

                if (getCounterCorrect() == randomWord.length()) {
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                    System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                    System.out.print(" Thanks for saving me! \n" +
                            "        ヽ(´▽`)ノ \n" +
                            "           | | \n" +
                            "           |_| \n" +
                            "         _/   \\_ \n" +
                            "           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                } else {

                    System.out.print("------------| \n" +
                            " |       <(ಠ_ಠ)> \n" +
                            " |         /|  \n" +
                            " |          |  \n" +
                            " |            \n" +
                            "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));
                }
                break;

            case 4:

                if (getCounterCorrect() == randomWord.length()) {
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                    System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                    System.out.print(" Thanks for saving me! \n" +
                            "        ヽ(´▽`)ノ \n" +
                            "           | | \n" +
                            "           |_| \n" +
                            "         _/   \\_ \n" +
                            "           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));


                } else {

                    System.out.print("------------| \n" +
                            " |       <(•︵•)> \n" +
                            " |         /|\\  \n" +
                            " |          |  \n" +
                            " |            \n" +
                            "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));


                }
                break;

            case 5:

                if (getCounterCorrect() == randomWord.length()) {

                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                    System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                    System.out.print(" Thanks for saving me! \n" +
                            "        ヽ(´▽`)ノ \n" +
                            "           | | \n" +
                            "           |_| \n" +
                            "         _/   \\_ \n" +
                            "           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                } else {

                    System.out.print("------------| \n" +
                            " |      °՞(-ᗣ-)՞° \n" +
                            " |         /|\\  \n" +
                            " |          |  \n" +
                            " |         /  \n" +
                            "_|_           \n");

                    System.out.println("• Guess the word •");
                    System.out.println("The end draws near !");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));
                }
                break;

            case 6:

                if (getCounterCorrect() == randomWord.length()) {
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                    System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                    System.out.print(" Thanks for saving me! \n" +
                            "        ヽ(´▽`)ノ \n" +
                            "           | | \n" +
                            "           |_| \n" +
                            "         _/   \\_ \n" +
                            "           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                } else {

                    System.out.print("------------| \n" +
                            " |       <(x_x)> \n" +
                            " |         /|\\  \n" +
                            " |          |  \n" +
                            " |         / \\ \n" +
                            "_|_           \n");

                    System.out.println("You have been hanged !");
                    System.out.print("The word was: " + randomWord);
                }
                break;

            default:

                if (getCounterCorrect() == randomWord.length()) {
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
                    System.out.println("🎊 YOU HAVE WON THE GAME!🎊");
                    System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");

                    System.out.print(" Thanks for saving me! \n" +
                            "        ヽ(´▽`)ノ \n" +
                            "           | | \n" +
                            "           |_| \n" +
                            "         _/   \\_ \n" +
                            "           \n");

                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                } else {

                    System.out.print("------------|\n" +
                            " | \n" +
                            " | \n" +
                            " | \n" +
                            " | \n" +
                            "_|_ \n");
                    System.out.println("• Guess the word •");
                    System.out.println(Arrays.toString(getRandomWordToChar()).replace(",", "").replace("[", "")
                            .replace("]", ""));

                }
                break;
        }
    }
}



