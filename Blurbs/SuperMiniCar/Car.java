class Car {
    String type;
    int size;

    public Car() {
        this.type = "Sedan";
        this.size = 10;
    }

    public Car(int size) {
        this.size = size;
        this.type = "Sedan";
    }

    public Car(String type) {
        this.type = type;
        this.size = 10;
    }

    public int getSize() {
        System.out.println("Size: " + this.size);
        return this.size;
    }

    public String getType() {
        System.out.println("Type: " + this.type);
        return this.type;
    }
}