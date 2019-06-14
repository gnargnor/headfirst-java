import java.text.MessageFormat;

class Doggo extends Animal implements Pet {
    public Doggo (String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void beFriendly () {
        Object[] friendParams = new Object[]{name};
        String msg = MessageFormat.format("{0} wags they tailed ass.", friendParams);
        System.out.println(msg);
    }
    
    public void play () {
        Object[] friendParams = new Object[]{name};
        String msg = MessageFormat.format("{0} bites you.", friendParams);
        System.out.println(msg);
    }

    public void introduction () {
        Object[] introParams = new Object[]{size, name};
        String msg = MessageFormat.format("Hello, gents.  I am a {0} sized doggo named {1}.", introParams);
        System.out.println(msg);
    }
}