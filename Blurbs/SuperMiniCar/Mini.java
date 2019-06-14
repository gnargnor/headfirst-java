class Mini extends Car {
    Color color;

    public Mini() {
        this(Color.Red);
    }

    public Mini(Color color) {
        super("Mini");
        this.color = color;
    }

    public Mini(int size) {
        super(size);
        this.color = Color.Red;
    }

    public Color getColor() {
        System.out.println("Color: " + color.toString());
        return this.color;
    }

    public static void main (String[] args) {
        Mini m1 = new Mini();
        m1.getColor();
        m1.getSize();
        m1.getType();
    }
}