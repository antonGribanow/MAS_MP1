import java.io.Serializable;
import java.util.List;

public class Patient implements Serializable {
     int id;
     List<Test> enduredTest; // todo atrybut powtarzalny
     List<String> additionalInfo;

    public Patient(List<Test> enduredTest, List<String> additionalInfo) {
        this.id = id;
        this.enduredTest = enduredTest;
        this.additionalInfo = additionalInfo;
    }
}
