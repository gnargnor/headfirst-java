import java.text.MessageFormat;

class Cat extends Animal {
    public Cat (String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void introduction () {
        Object[] params = new Object[]{"Cat", "Cat"};
        String msg = MessageFormat.format("Meow. Me {0}. Size {0}.", params);
        System.out.println(msg);
    }
}