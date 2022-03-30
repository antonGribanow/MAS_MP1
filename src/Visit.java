import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Visit implements Serializable {
    public static int basicVisitCost = 200; // todo atrybut klasowy
    public final UUID idVisit;
    public final GregorianCalendar visitDate;
    public final Room room; // todo atrybut złożony
    public final String paymentMethod;
    public String additionalInformation = null; // todo atrybut opcjonalny
    public final Test test;
    public final Patient patient;
    private static List<Visit> allVisits = new ArrayList<>(); // todo ekstensja

    public Visit(GregorianCalendar visitDate, Room room, String paymentMethod, String additionalInformation, Test test, Patient patient) {
        this.idVisit = UUID.randomUUID();
        this.visitDate = visitDate;
        this.room = room;
        this.paymentMethod = paymentMethod;
        this.additionalInformation = additionalInformation;
        this.test = test;
        this.patient = patient;
        addVisit(this);
    }


    public static void addVisit(Visit visit) {
        allVisits.add(visit);

    }

    public int getVisitCost(Test test) { // todo atrybut pochodny - wyliczanie jakiejś wartości na bazie innego atrybutu
        return basicVisitCost + test.cost;
    }

    @Override
    public String toString() {
        return "Visit: " +
                "visit id: " + idVisit +
                ", visitDate: " + visitDate.get(Calendar.DATE) +
                "." + visitDate.get(Calendar.MONTH) +
                "." + visitDate.get(Calendar.YEAR) +
                ", room: " + room.toString() +
                ", paymentMethod: " + paymentMethod +
                ", additionalInformation: " + additionalInformation +
                ", visitCost: " + getVisitCost(test) +
                ", test: " + test +
                '}';
    }

    public static void writeExtent(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.writeObject(allVisits);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readExtent(ObjectInputStream objectInputStream) {
        try {
            allVisits = (ArrayList<Visit>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void displayVisit() {
        for (Visit visit : allVisits) {
            System.out.println(visit);
        }
    }

    public static void changeBasicVisitCost(int newCost) { // todo metoda klasowa
        basicVisitCost = newCost;
    }


}
