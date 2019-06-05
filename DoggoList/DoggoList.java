class DoggoList {
    private Doggo [] doggos = new Doggo[5];
    private int nextIndex = 0;

    public void add(Doggo d) {
        doggos[nextIndex] = d;
        System.out.println("New dog added at index " + nextIndex);
        nextIndex++;
    }

    public Doggo[] getDoggos () {
        return doggos;
    }
}