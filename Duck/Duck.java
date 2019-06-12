class Duck {
    private int size;
    private static int duckCount = 0;  // Static variable initialized to 0.

    public Duck() {
        duckCount++;  // Every instance of duck has the same local static variable duckCount.
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Duck[] ducks = new Duck[5];
        for (int i = 0; i < 5; i++) {
            ducks[i] = new Duck();
        }
        System.out.println("Duck count: " + Duck.duckCount);
    }
}