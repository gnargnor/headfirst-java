class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Bark. I am " + name);
    }
}

class DogTestDrive {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        Dog[] pets;
        pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[0].name = "Butthole";
        pets[2] = pets[1];
        pets[2].name = "Beavishole";
        pets[1].bark();
        pets[2].bark();

        int x = 0;
        while (x < 3) {
            pets[x].bark();
            x = x + 1;
        }
        
    }
}
