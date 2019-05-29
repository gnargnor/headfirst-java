class TapeDeck {
    boolean canRecord = false;
}

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        
        t.canRecord = true;

        System.out.println(t.canRecord);
    }
}
