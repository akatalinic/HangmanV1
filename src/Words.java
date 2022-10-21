import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    private String[] randomWords = {"match", "harass", "longing", "respect", "wealthy", "allow", "square", "march", "aware", "lopsided",
            "shocking", "naughty", "language", "show", "preach", "famous", "load", "cause", "delight", "careful", "parsimonious",
            "rock", "moon", "racial", "temper", "magenta", "health", "glistening", "oranges", "giddy", "obsolete", "young", "zip",
            "tenuous", "haunt", "horse", "blood", "murder", "history", "peck", "medical", "embarrassed", "ritzy", "sock", "argument",
            "snake", "inconclusive", "month", "vivacious", "engine", "zephyr", "inexpensive", "pour", "enchanted", "wood", "grin",
            "ticket", "rose", "voiceless", "daughter", "promise", "cap", "beam", "actor", "sigh", "regret", "mice", "start",
            "evanescent", "smash", "travel", "mundane", "thick", "toothbrush", "relieved", "sun", "seat", "bustling", "guarantee",
            "cultured", "yummy", "heat", "cent", "female", "apparatus", "second", "tawdry", "heavy", "person", "field", "story",
            "zoom", "experience", "car", "realize", "overjoyed", "amused", "noiseless", "squalid", "happen"};

    private String [] randomCountry = {"croatia", "portugal","slovakia","czechia","france","spain","italy","china","ukraine",
            "england","scotland","norway","finland","sweden","turkey"};

    private String [] animals = {"dog","cat","cow","dolphin","platypus","tiger","monkey","shark","kangaroo",
            "mouse","pigeon","moose","dingo","narwhal"};

    private int maxLength;
    private int minLength;



    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public String[] getRandomWords() {
        return randomWords;
    }

    public void setRandomWords(String[] randomWords) {
        this.randomWords = randomWords;
    }

    public String[] getRandomCountry() {
        return randomCountry;
    }

    public void setRandomCountry(String[] randomCountry) {
        this.randomCountry = randomCountry;
    }

    public String[] getAnimals() {
        return animals;
    }

    public void setAnimals(String[] animals) {
        this.animals = animals;
    }

    private String randomGeneratedWord;

    public String getRandomGeneratedWord() {
        return randomGeneratedWord;
    }

    public void setRandomGeneratedWord(String randomGeneratedWord) {
        this.randomGeneratedWord = randomGeneratedWord;
    }

    public String pickAWord (String userChoice){
        Scanner scanner = new Scanner(System.in);
        PlayerMenu menu = new PlayerMenu();
        boolean checkLogic = true;
        String wordsLength;
        boolean isWordFound = false;

        do {
            switch (userChoice){

                case "1":

                    randomWordsLength();
                    System.out.println("The words in this category have minimum of " + getMinLength() + " letters," +
                            "and maximum of " + getMaxLength() + " letters");

                    System.out.print("Please choose a number of letters you wish for your word to have: ");

                    wordsLength = scanner.nextLine();

                    while (!wordsLength.matches("[0-9]*")){
                        System.out.println("Please enter a valid number: ");
                        wordsLength = scanner.nextLine();
                    }
                    while (Integer.parseInt(wordsLength) < getMinLength() || Integer.parseInt(wordsLength) > getMaxLength()){
                        System.out.println("You entered wrong number, please enter number in range of: " + minLength +"-"
                                + maxLength);
                        wordsLength = scanner.nextLine();
                    }

                    for (String word : getRandomWords()) {
                        if (Integer.parseInt(wordsLength) == word.length()) {

                            String generateWord = randomWords[(int) (Math.random() * (randomWords.length))];

                            while (generateWord.length() != Integer.parseInt(wordsLength)) {
                                generateWord = randomWords[(int) (Math.random() * (randomWords.length))];
                            }

                            setRandomGeneratedWord(generateWord);
                            checkLogic = false;
                            isWordFound = true;
                            break;
                        }
                    }
                    if (!isWordFound) {
                        System.out.println("There is no word with that amount of letters!");
                    }
                    break;

                case "2":

                    countryWordsLength();

                    System.out.println("The words in this category have minimum of " + getMinLength() + " letters," +
                            "and maximum of " + getMaxLength() + " letters");

                    System.out.print("Please choose a number of letters you wish for your word to have: ");

                    wordsLength = scanner.nextLine();

                    while (!wordsLength.matches("[0-9]*")){
                        System.out.println("Please enter a valid number: ");
                        wordsLength = scanner.nextLine();
                    }

                    while (Integer.parseInt(wordsLength) < getMinLength() || Integer.parseInt(wordsLength) > getMaxLength()){
                        System.out.println("You entered wrong number, please enter number in range of: " + minLength +"-"
                                + maxLength);
                        wordsLength = scanner.nextLine();
                    }

                    for (String word : getRandomCountry()) {
                        if (Integer.parseInt(wordsLength) == word.length()) {

                            String generateWordCountry = randomCountry[(int) (Math.random() * (randomCountry.length))];

                            while (generateWordCountry.length() != Integer.parseInt(wordsLength)) {
                                generateWordCountry = randomCountry[(int) (Math.random() * (randomCountry.length))];
                            }
                            setRandomGeneratedWord(generateWordCountry);
                            checkLogic = false;
                            isWordFound = true;
                            break;
                        }
                    }
                    if(!isWordFound){
                        System.out.println("There is no word with that amount of letters");
                    }
                    break;

                case "3":

                    animalWordsLength();

                    System.out.println("The words in this category have minimum of " + getMinLength() + " letters," +
                            "and maximum of " + getMaxLength() + " letters");

                    System.out.print("Please choose a number of letters you wish for your word to have: ");

                    wordsLength = scanner.nextLine();

                    while (!wordsLength.matches("[0-9]*")){
                        System.out.println("Please enter a valid number: ");
                        wordsLength = scanner.nextLine();
                    }

                    while (Integer.parseInt(wordsLength) < getMinLength() || Integer.parseInt(wordsLength) > getMaxLength()){
                        System.out.println("You entered wrong number, please enter number in range of: " + minLength +"-"
                                + maxLength);
                        wordsLength = scanner.nextLine();

                    }

                    for (String word : getAnimals()){
                        if(Integer.parseInt(wordsLength) == word.length()){
                            String generateWordAnimal = animals[(int) (Math.random() * (animals.length))];

                            while (generateWordAnimal.length() != Integer.parseInt(wordsLength)) {
                                generateWordAnimal = animals[(int) (Math.random() * (animals.length))];
                            }
                            setRandomGeneratedWord(generateWordAnimal);
                            checkLogic = false;
                            isWordFound = true;
                            break;
                        }
                    }
                    if(!isWordFound){
                        System.out.println("There is no word with that amount of letters");
                        break;
                    }
                    break;
            }

        } while (checkLogic);
        return getRandomGeneratedWord();
    }

    public void randomWordsLength (){

        String[] lengthOfWords = getRandomWords();

        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (String word : lengthOfWords){
            if (word.length() > maxLength){
                maxLength = word.length();
            }
            if (word.length()< minLength){
                minLength = word.length();
            }
        }
        setMaxLength(maxLength);
        setMinLength(minLength);
    }

    public void animalWordsLength (){

        String[] lengthOfWords = getAnimals();

        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (String word : lengthOfWords){
            if (word.length() > maxLength){
                maxLength = word.length();
            }
            if (word.length()< minLength){
                minLength = word.length();
            }
        }
        setMaxLength(maxLength);
        setMinLength(minLength);
    }

    public void countryWordsLength (){

        String[] lengthOfWords = getRandomCountry();

        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (String word : lengthOfWords){
            if (word.length() > maxLength){
                maxLength = word.length();
            }
            if (word.length()< minLength){
                minLength = word.length();
            }
        }
        setMaxLength(maxLength);
        setMinLength(minLength);
    }

}
