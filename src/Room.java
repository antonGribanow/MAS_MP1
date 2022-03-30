import java.io.Serializable;
import java.util.List;

class Room implements Serializable {
    List<String> equipment;
    double roomSurface;

    public Room(List<String> equipment, double roomSurface) {
        this.equipment = equipment;
        this.roomSurface = roomSurface;
    }

    public double getSurface() { // todo przesłonięcie
        return roomSurface;
    }

    @Override
    public String toString() {
        return "equipment=" + equipment +
                ", roomSurface=" + roomSurface +
                '}';
    }
}