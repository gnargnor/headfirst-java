class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie.");
    }
}

class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stalk";
        one.genre = "Tragedy";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in the Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Bunhole Glory Oven";
        three.genre = "Butt Centric";
        three.rating = 127;
    }
}
