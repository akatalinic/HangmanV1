public class Main {
    public static void main(String[] args) {

        RandomWords randomWords = new RandomWords();
        Game game = new Game ();

        game.initializeGame(randomWords.generateWord());
        game.gameOn(randomWords.getRandomGeneratedWord());

    }
}