class GuessGame {
    public void startGame () {
        System.out.println("Game started.");
        
        GameMaster gm = new GameMaster();
        gm.pickTargetNumber();

        System.out.println("I'm thinking of a numero between one y ten.");

        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Player p3 = new Player(3);
        
        int round = 1;

        while(true) {
            System.out.println("Round " + Integer.toString(round));

            p1.guessNumber();
            System.out.println("Player 1 guessed " + Integer.toString(p1.currentGuess));
            if (gm.checkGuess(p1.currentGuess)) {
                System.out.println("Player 1 is the winner! The number was " + Integer.toString(gm.targetNumber));
                break;
            }

            p2.guessNumber();
            System.out.println("Player 2 guessed " + Integer.toString(p2.currentGuess));
            if (gm.checkGuess(p2.currentGuess)) {
                System.out.println("Player 2 is the winner! The number was " + Integer.toString(gm.targetNumber));
                break;
            }

            p3.guessNumber();
            System.out.println("Player 3 guessed " + Integer.toString(p3.currentGuess));
            if (gm.checkGuess(p2.currentGuess)) {
                System.out.println("Player 3 is the winner! The number was " + Integer.toString(gm.targetNumber));
                break;
            }

            System.out.println("No winners this round.");
            round = round + 1;
            if (round == 5) {
                System.out.println("Boring! Next.");
                break;
            }
        }
    }
}

class GameMaster {
    int targetNumber;

    public void pickTargetNumber () {
        targetNumber = (int) (Math.random() * 10);
    }

    public boolean checkGuess (int guess) {
        return guess == targetNumber;
    }
}

class Player {

    int currentGuess;
    int id;

    public Player (int playerId) {
        id = playerId;    
    }
    
    public void guessNumber () {
        currentGuess = (int) (Math.random() * 10);
    }
}

class GuessGameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();    
    }
}
