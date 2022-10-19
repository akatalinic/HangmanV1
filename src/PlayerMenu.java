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

        System.out.println("Please choose a word category: \n" +
                "1. Random Words (HARD) \n" +
                "2. Country \n" +
                "3. Animals");

        userChoice = scanner.nextLine();

        while(!userChoice.matches("[1-3]")){
            System.out.println("Wrong input, try again");
            System.out.println("Please choose a word category: \n" +
                    "1. Random Words (hard) \n" +
                    "2. Country \n" +
                    "3. Animals");
            userChoice = scanner.nextLine();
        }
        newWords.pickAWord(userChoice);

        setRandomGeneratedWord(newWords.getRandomGeneratedWord());

        return  getRandomGeneratedWord();
    }

}