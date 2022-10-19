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

    private String [] animals = {"dog","cat","cow","dolphin","platypus","lion","tiger","bear","monkey","shark","kangaroo",
            "mouse","pigeon","moose"};

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
        boolean checkLogic = true;
        Scanner scanner = new Scanner(System.in);
        int wordsLength;

        do {
            switch (userChoice){

                case "1":

                    randomWordsLength();
                    System.out.println("The words in this category have minimum of " + getMinLength() + " letters," +
                            "and maximum of " + getMaxLength() + " letters");

                    System.out.print("Please choose a number of letters you wish for your word to have: ");

                    wordsLength = scanner.nextInt();
                  while (wordsLength < getMinLength() || wordsLength > getMaxLength()){
                        System.out.println("You entered wrong number, please enter number in range of: " + minLength +"-"
                                + maxLength);
                        wordsLength = scanner.nextInt();
                    }

                  String generateWord = randomWords[(int) (Math.random() * (randomWords.length))];

                  while (generateWord.length() != wordsLength){
                         generateWord = randomWords[(int) (Math.random() * (randomWords.length))];
                  }

                    setRandomGeneratedWord(generateWord);
                    checkLogic = false;
                    break;

                case "2":

                    countryWordsLength();

                    System.out.println("The words in this category have minimum of " + getMinLength() + " letters," +
                            "and maximum of " + getMaxLength() + " letters");

                    System.out.print("Please choose a number of letters you wish for your word to have: ");

                    wordsLength = scanner.nextInt();
                    while (wordsLength < getMinLength() || wordsLength > getMaxLength()){
                        System.out.println("You entered wrong number, please enter number in range of: " + minLength +"-"
                                + maxLength);
                        wordsLength = scanner.nextInt();
                    }


                    String generateWordCountry = randomCountry[(int) (Math.random() * (randomCountry.length))];

                    while( generateWordCountry.length() != wordsLength){
                        generateWordCountry = randomCountry[(int) (Math.random() * (randomCountry.length))];
                    }

                    setRandomGeneratedWord(generateWordCountry);
                    checkLogic = false;
                    break;

                case "3":

                    animalWordsLength();

                    System.out.println("The words in this category have minimum of " + getMinLength() + " letters," +
                            "and maximum of " + getMaxLength() + " letters");

                    System.out.print("Please choose a number of letters you wish for your word to have: ");

                    wordsLength = scanner.nextInt();

                    while (wordsLength < getMinLength() || wordsLength > getMaxLength()){
                        System.out.println("You entered wrong number, please enter number in range of: " + minLength +"-"
                                + maxLength);
                        wordsLength = scanner.nextInt();

                    }

                    String generateWordAnimal = animals[(int) (Math.random() * (animals.length))];

                    while(generateWordAnimal.length() != wordsLength){
                        generateWordAnimal = animals[(int) (Math.random() * (animals.length))];
                    }

                    setRandomGeneratedWord(generateWordAnimal);
                    checkLogic = false;
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
