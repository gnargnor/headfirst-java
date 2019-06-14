class PetTestDrive {
    public static void main (String[] args) {
        PetList petList = new PetList();
        Doggo doggo1 = new Doggo("Buns", "Big Oil");
        petList.add(doggo1);

        Cat cat1 = new Cat("Grimble", "But a Nip");
        petList.add(cat1);
        Cat cat2 = new Cat("No Name", "No Size, Baby");
        petList.add(cat2);

        Pet[] pets = petList.getPetList();

        for (Pet pet: pets) {
            pet.play();
            pet.beFriendly();
        }
    }
}