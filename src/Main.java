import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RandomWords randomWords = new RandomWords();
        String generatedWord = randomWords.generateWord();

        System.out.println(generatedWord);


    randomWords.playingField(generatedWord);
    randomWords.gameOn(generatedWord);

    //Make another class with game rules so that class random words is only for words
    // connect all the logic


    }
}