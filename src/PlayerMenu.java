import java.util.Scanner;

public class PlayerMenu {

    Words newWords = new Words();
    private String randomGeneratedWord;

    public String getRandomGeneratedWord() {
        return randomGeneratedWord;
    }

    public void setRandomGeneratedWord(String randomGeneratedWord) {
        this.randomGeneratedWord = randomGeneratedWord;
    }

    public String playerMenu() {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        userChoice = printMenu(scanner);
        userChoice = validateScanner(scanner, userChoice);

        newWords.pickAWord(userChoice);
        setRandomGeneratedWord(newWords.getRandomGeneratedWord());

        return  getRandomGeneratedWord();
    }

    private static String validateScanner(Scanner scanner, String userChoice) {
        while(!userChoice.matches("[1-3]")){
            System.out.println("Wrong input, try again");
            userChoice = printMenu(scanner);
        }
        return userChoice;
    }

    private static String printMenu(Scanner scanner) {
        String userChoice;
        System.out.println("Please choose a word category: \n" +
                "1. Random Words (HARD) \n" +
                "2. Country \n" +
                "3. Animals");

        userChoice = scanner.nextLine();
        return userChoice;
    }

}