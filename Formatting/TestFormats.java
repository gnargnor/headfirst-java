class TestFormats {
    public static void main (String[] args) {
        String s1 = String.format("%,d", 1000000000);
        System.out.println(s1);

        String s2 = String.format("I have %.2f bugs on my body.", 6969.420420);
        System.out.println(s2);

        String s3 = String.format("You gave me %,.2f bugs.", 123456.7890123);
        System.out.println(s3);

        String s4 = String.format("A hamburgie costs $%,.2f and you gave me $%d.  Your change is $%,.2f.  Have a good day.", 527246.257542, 13, 6542345346417643.6252435653);
        System.out.println(s4);
    }
}