class SimpleDotComTestDrive {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();

        int firstCell = (int) (Math.random() * 5);
        int[] locations = {firstCell, firstCell + 1, firstCell + 2};
        dot.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String userGuess = helper.getUserInput("enter a number");
            numOfGuesses++;
            String result = dot.checkYourself(userGuess);

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You used " + numOfGuesses + " guesses.");
            }

        }
    }
}