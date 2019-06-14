class UseADuck {
    public static void main (String[] args) {
        short mediumDuckSize = 10;
        Duck dNone = new Duck();
        Duck dOne = new Duck("slow");
        Duck dTwo = new Duck("medium", mediumDuckSize);

        dNone.swim();
        dNone.quack();
        dOne.swim();
        dOne.quack();
        dTwo.swim();
        dTwo.quack();
    }
}