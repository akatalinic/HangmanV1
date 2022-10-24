public class Main {
    public static void main(String[] args) {
        PlayerMenu playerMenu = new PlayerMenu();
        Game game = new Game();

        game.initializeGame(playerMenu.playerMenu());
        System.out.println("THIS IS JUST FOR TESTING:" + playerMenu.getRandomGeneratedWord());
        game.gameOn(playerMenu.getRandomGeneratedWord());
    }
}