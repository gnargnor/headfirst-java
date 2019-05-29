import java.util.ArrayList;

class DotComTest {
    static void testSetName () {
        String expectedName = "Classic Times";
        String actualName;
        String testResult = "failed";

        DotCom dot = new DotCom();
        dot.setName(expectedName);
        actualName = dot.getName();

        if (expectedName == actualName) {
            testResult = "passed";
        }
        
        System.out.println("DotCom.setName " + testResult);
    }

    static void testSetLocations() {
        ArrayList<String> expectedLocations = new ArrayList<String>();
        ArrayList<String> actualLocations;
        String testResult = "failed";

        DotCom dot = new DotCom();
        dot.setLocations(expectedLocations);
        actualLocations = dot.getLocations();

        if (actualLocations == expectedLocations) {
            testResult = "passed";
        }

        System.out.println("DotCom.setLocations " + testResult);
    }

    public static void main (String[] args) {
        testSetName();
        testSetLocations();
    }
}