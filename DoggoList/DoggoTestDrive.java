class DoggoTestDrive {
    public static void main (String[] args) {
        DoggoList doggoList = new DoggoList();

        Doggo doggo0 = new Doggo("Bill", "Bigly");
        doggoList.add(doggo0);

        Doggo doggo1 = new Doggo("Willy", "Yuge");
        doggoList.add(doggo1);

        Doggo doggo2 = new Doggo("Bernie", "Small Business");
        doggoList.add(doggo2);

        Doggo doggo3 = new Doggo("Bing", "Itty Bitty");
        doggoList.add(doggo3);

        Doggo doggo4 = new Doggo("Tim", "Tiny");
        doggoList.add(doggo4);

        Doggo[] doggos = doggoList.getDoggos();

        for (Doggo doggy: doggos) {
            doggy.introduction();
        }
    }
}