import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Visit implements Serializable {
    public static int basicVisitCost = 200; // todo atrybut klasowy
     Room room; // todo atrybut złożony
     String paymentMethod;
     String additionalInformation = null; // todo atrybut opcjonalny
     Test test;
     Patient patient;
     static List<Visit> allVisits = new ArrayList<>(); // todo ekstensja

    public Visit(Room room, String paymentMethod, String additionalInformation, Test test, Patient patient) {
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

    public int getVisitCost(Test test) { // todo atrybut pochodny - wyliczanie wartości na bazie innego atrybutu
        return basicVisitCost + test.cost;
    }

    @Override
    public String toString() {
        return "Visit: " +
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
