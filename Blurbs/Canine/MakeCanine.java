import java.util.*;

public class MakeCanine {
    public static void go() {
        ArrayList<Animal> doggos = new ArrayList<Animal>();

        Canine c = new Canine();
        doggos.add(c);

        Dog d = new Dog();
        doggos.add(d);

        for (Animal doggo: doggos) {
            doggo.roam();
        }
    }

    public static void main (String[] args) {
        MakeCanine.go();
    }
}