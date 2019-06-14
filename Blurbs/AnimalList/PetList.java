import java.util.ArrayList;

class PetList {
    Pet[] petList = new Pet[3];
    int nextIndex = 0;

    public void add (Pet p) {
        petList[nextIndex] = p;
        System.out.println("Added pet of " + p.getClass() + " to the party player pet list.");
        nextIndex++;
    }

    public Pet[] getPetList () {
        return petList;
    }
}