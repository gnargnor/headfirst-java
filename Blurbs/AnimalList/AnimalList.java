class AnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add (Animal a) {
        animals[nextIndex] = a;
        System.out.println("New animal of " + a.getClass() + " added at index " + nextIndex + ".");
        nextIndex++;
    }

    public Animal[] getAnimals () {
        return animals;
    }
}