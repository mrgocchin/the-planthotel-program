import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Waterable> hostedPlants = new ArrayList<>();
        hostedPlants.add(new Palm("Laura", 5.0));
        hostedPlants.add(new Palm("Olof", 1.0));
        hostedPlants.add(new CarnivorousPlant("Meatloaf", 0.7));
        hostedPlants.add(new Cactus("Igge", 0.20));

        System.out.println("Welcome!");

        boolean running = true;
        while (running) {
            boolean found = false;
            System.out.println("To get watering instructions, type the plant's name below." +
                    "\nOtherwise type \"exit\" to leave.");

            String usersChoiceRaw = scanner.nextLine();
            String usersChoiceEdit = usersChoiceRaw.trim();

            if (usersChoiceEdit.equalsIgnoreCase("exit")) {
                System.out.println("Thank you, good bye!");
                running = false;
            } else {

                //Interface: wateringService() is called through the Waterable interface.
                //This produces different results depending on the actual object, without the need to specify the class.

                for (Waterable waterable : hostedPlants) {
                    if (usersChoiceEdit.equalsIgnoreCase(waterable.getName())) {
                        System.out.println(waterable.wateringService());

                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("I don't recognise the name." +
                            "\nMake sure to spell the name correctly and try again!");
                }
            }


        }
        scanner.close();


    }
}



