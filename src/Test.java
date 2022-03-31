import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test implements Serializable {

    String testType;
    List<String> preparationToTest;
    int cost;

    public Test(String testType, List<String> preparationToTest, int cost) {

        this.testType = testType;
        this.preparationToTest = preparationToTest;
        this.cost = cost;
    }

    public void updatePreparationToTest(String oldPreparation, String newPreparation) { // przeciążenie
        Collections.replaceAll(preparationToTest, oldPreparation, newPreparation);
    }

    public void updatePreparationToTest(String newPreparation) { // przeciążenie
        preparationToTest.add(newPreparation);
    }

    static Test getTest() {
        return new Test(
                "MRI",
                Arrays.asList(
                        "DO NOT SMOKE",
                        "DO NOT EAT"
                ),
                300);
    }

    @Override
    public String toString() {
        return "Test: " +
                ", testType: " + testType +
                ", preparationToTest: " + preparationToTest +
                ", cost: " + cost;
    }
}
