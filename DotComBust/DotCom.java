import java.util.ArrayList;

class DotCom {
    String name;
    ArrayList<String> locations = new ArrayList<String>();

    public void setName (String aName) {
        name = aName;
    }

    public String getName () {
        return name;
    }

    public void setLocations (ArrayList<String> locs) {
        locations = locs;
    }

    public ArrayList<String> getLocations () {
        return locations;
    }

    public String checkYourself(String userGuess) {
        String result = "miss";
        int index = locations.indexOf(userGuess);

        if (index >= 0) {
            locations.remove(index);
            
            if (locations.isEmpty()) {
                result = "kill";
                System.out.println("You killed " + name + ". Great Job!");
            } else {
                result = "hit";
            }
        }

        return result;
    }
}