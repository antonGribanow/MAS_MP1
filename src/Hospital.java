import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Facility extends Room implements Serializable {
     UUID id;
     String street;
     String city;
     String code;
     List<Room> roomsInFacility;

    public Facility(String street, String city, String code, List<Room> roomsInFacility, List<String> equipment, double roomSurface) {
        super(equipment, roomSurface);
        this.id = UUID.randomUUID();
        this.street = street;
        this.city = city;
        this.code = code;
        this.roomsInFacility = roomsInFacility;
    }

    @Override
    public double getSurface() { // todo przesłonięcie
        double surfaceValue = 0;
        for (Room room : roomsInFacility) {
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

