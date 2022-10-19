public class Main {
    public static void main(String[] args) {

        RandomWords randomWords = new RandomWords();
        Game game = new Game ();

        game.initializeGame(randomWords.playerMenu());
        System.out.println("THIS IS JUST FOR TESTING:" + randomWords.getRandomGeneratedWord());
        game.gameOn(randomWords.getRandomGeneratedWord());

    }
}