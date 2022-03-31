import java.io.*;
import java.util.*;


public class Main {
    static final String fileLocation = "db.txt";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput = 0;
        while (userInput != 5) {
            displayMainMenu();
            userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1:
                    createVisit();
                    break;
                case 2:
                    Visit.displayVisit();
                    break;
                case 3:
                    serialise();
                    break;
                case 4:
                    deserialize();
                    break;
            }
        }
    }

    public static void displayMainMenu() {
        System.out.println("1. Create a visit");
        System.out.println("2. Display your reservations for visits");
        System.out.println("3. Save to file");
        System.out.println("4. Read from file");
        System.out.println("5. Exit");
    }

    public static void createVisit() {
        Test enduredTest = Test.getTest();
        Visit visit = new Visit(
                new Room(Arrays.asList("Scalpel", "Manometer"), 20.5), "Cash", null, enduredTest,
                new Patient(new ArrayList<>(Collections.singleton(enduredTest)), Arrays.asList("I'm allergic to milk", "I'm scared to loud noises")));
        System.out.println("Visit created!");
    }

    public static void serialise() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileLocation));
            Visit.writeExtent(outputStream);
            outputStream.flush();
            outputStream.close();
            System.out.println("Serialised!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deserialize() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileLocation));
            Visit.readExtent(inputStream);
            inputStream.close();
            System.out.println("Deserialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}