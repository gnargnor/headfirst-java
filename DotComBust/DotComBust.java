import java.util.*;

class DotComBust {
    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    int numOfGuesses = 0;

    void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Butts.com");
        DotCom two = new DotCom();
        two.setName("Buns.gif");
        DotCom three = new DotCom();
        three.setName("Squats.org");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Goal: sink three dot coms.");
        System.out.println(one.getName() + ", " + two.getName() + ", " + three.getName());
        System.out.println("Fewer guesses = more profit");

        for (DotCom dotComToSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocations(newLocation);
        }
    }

    public ArrayList<DotCom> getDotComsList() {
        return dotComsList;
    }

    void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess:  ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    void checkUserGuess(String guess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dc: dotComsList) {
            result = dc.checkYourself(guess);
            if (result == "hit") {
                break;
            }
            if (result == "kill") {
                dotComsList.remove(dc);
                break;
            }
        }
        System.out.println(result);
    }

    void finishGame() {
        if (numOfGuesses < 18) {
            System.out.println("OHHHHH HO HO HO GREAT JOB MERRY GRIMBUS.  VERY LOW GUESS COUNT OF " + numOfGuesses);
            
        } else {
            System.out.println("You can suck on grandma's eggs.  Number of Guesses: " + numOfGuesses + ". BOO.");
        }
    }

    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}