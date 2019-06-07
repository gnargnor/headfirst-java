class Duck {
    String speed;
    short strength;

    public Duck() {
        this.speed = "fast";
        this.strength = 5;
    }

    public Duck(String speed) {
        this.speed = speed;
        this.strength = 5;
    }

    public Duck(String speed, short strength) {
        this.speed = speed;
        this.strength = strength;
    }

    public void quack () {
        if (speed == "fast") {
            System.out.println("quackquackquackquack");
        }
        if (speed == "medium") {
            System.out.println("Quack. Quack. Quack. Quack.");
        }
        if (speed == "slow") {
            System.out.println("QUuuuuuuaaaaaaaaccccccccck.");
        }
    }

    public void swim () {
        if (strength == 5) {
            System.out.println("Pitter patter pitter patter");
        }
        if (strength > 5) {
            System.out.println("VRRRROOOOOOOOOOOOOOM");
        }
        if (strength < 5) {
            System.out.println("Putputputputput");
        }
    }
}