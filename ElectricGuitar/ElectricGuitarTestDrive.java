class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public String getRockStarUsesIt() {
        if (rockStarUsesIt) {
            return "Yes.";
        } else {
            return "No.";
        }
    }

    public void setRockStarUsesIt(boolean yesNo) {
        rockStarUsesIt = yesNo;
    }
 }

class ElectricGuitarTestDrive {
    public static void main (String[] args) {
        ElectricGuitar eg = new ElectricGuitar();
        eg.setBrand("Poop Laden");
        eg.setNumOfPickups(69);
        eg.setRockStarUsesIt(true);

        System.out.println("Brand: " + eg.getBrand());
        System.out.println("Number of Pickups: " + eg.getNumOfPickups());
        System.out.println("Used by rock man: " + eg.getRockStarUsesIt());
        try {
            eg.setBrand("Fart");
        } 
        catch (Exception e) {
            System.out.println("Wrong");
            System.out.println(e);
        }
        System.out.println("Brand changed to " + eg.getBrand() + ".");
    }
}