class AnimalTestDrive {
    public static void main (String[] args) {
        AnimalList animalList = new AnimalList();

        Doggo doggo0 = new Doggo("Bill", "Bigly");
        animalList.add(doggo0);
        Doggo doggo1 = new Doggo("Willy", "Yuge");
        animalList.add(doggo1);
        Doggo doggo2 = new Doggo("Bernie", "Small Business");
        animalList.add(doggo2);
        Cat cat3 = new Cat("Bing", "Itty Bitty");
        animalList.add(cat3);
        Cat cat4 = new Cat("Tim", "Tiny");
        animalList.add(cat4);

        System.out.println();
        System.out.println("Generating Animal Introductions!");
        System.out.println();

        Animal[] animals = animalList.getAnimals();

        for (Animal animal: animals) {
            animal.introduction();
        }
    }
}