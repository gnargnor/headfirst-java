import java.text.MessageFormat;

class Doggo {
    private String name;
    private String size;

    public Doggo (String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void introduction () {
        Object[] introParams = new Object[]{size, name};
        String msg = MessageFormat.format("Hello, gents.  I am a {0} sized doggo named {1}.", introParams);
        System.out.println(msg);
    }
}