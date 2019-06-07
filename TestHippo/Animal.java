class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Making an Animal.");
    }

    public void sayName() {
        System.out.println(type + " named " + name + ".");
    }
}