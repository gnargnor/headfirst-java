import java.text.MessageFormat;

class Cat extends Animal implements Pet {
    public Cat (String name, String size) {
        this.name = name;
        this.size = size;
    }    
    
    public void beFriendly () {
        Object[] friendParams = new Object[]{"Cat"};
        String msg = MessageFormat.format("{0}. Purr.", friendParams);
        System.out.println(msg);
    }
    
    public void play () {
        Object[] friendParams = new Object[]{name};
        String msg = MessageFormat.format("{0}. Catnip plz.", friendParams);
        System.out.println(msg);
    }

    public void introduction () {
        Object[] params = new Object[]{"Cat", "Cat"};
        String msg = MessageFormat.format("Meow. Me {0}. Size {1}.", params);
        System.out.println(msg);
    }
}