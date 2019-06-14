class TestBox {
    Integer i;
    int j;

    public static void main (String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j=i;  // Throws exception since Integer is an object and objects are initialized to null.
        System.out.println(j);
        System.out.println(i);
    }
}