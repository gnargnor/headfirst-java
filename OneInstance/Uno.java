class Uno {
    private static boolean exists = false;

    public Uno() {
        if (exists) {
            throw new RuntimeException("No.");
        }
        exists = true;
    }

    public static void main(String[] args) {
        Uno u = new Uno();
        Uno u2 = new Uno();
    }
}