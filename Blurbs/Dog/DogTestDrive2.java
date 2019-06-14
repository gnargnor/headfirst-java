class Dog2 {
    int size;
    String breed;
    String name;

    void bark(int numBarks) {
        while (numBarks > 0) {
            if (size > 60) {
                System.out.println("Woof Woof!");
            } else if ( size > 14) {
                System.out.println("Rff ROFF!");
            } else {
                System.out.println("Yiipp");
            }
            numBarks = numBarks - 1;
        }
    }
}

class DogTestDrive2 {
    public static void main (String[] args) {
        Dog2 d1 = new Dog2();
        d1.size = 40;
        d1.bark(6);

        Dog2 d2 = new Dog2();
        d2.size = 75;
        d2.bark(4);

        d1.size = 13;
        d1.bark(3);
    }
}
