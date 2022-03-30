import java.io.Serializable;
import java.util.List;

public class Hospital extends Room implements Serializable {
     int id;
     String street;
     String city;
     String code;
     List<Room> roomsInHospital;

    public Hospital(String street, String city, String code, List<Room> roomsInFacility, List<String> equipment, double roomSurface) {
        super(equipment, roomSurface);
        this.id = id;
        this.street = street;
        this.city = city;
        this.code = code;
        this.roomsInHospital = roomsInFacility;
    }

    @Override
    public double getSurface() { // todo przesłonięcie
        double surfaceValue = 0;
        for (Room room : roomsInHospital) {
            surfaceValue += room.roomSurface;
        }
        return surfaceValue;
    }

    @Override
    public String toString() {
        return "Facility: " +
                "facility id: " + id +
                ", street: " + street +
                ", city: " + city +
                ", code: " + code;
    }
}

