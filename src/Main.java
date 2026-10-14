import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Plant> hostedPlants = new ArrayList<>();
        hostedPlants.add(new Palm("Laura", 5.0));
        hostedPlants.add(new Palm ( "Olof", 1.0));
        hostedPlants.add(new CarnivorousPlant("Meatloaf", 0.7));
        hostedPlants.add(new Cactus("Igge", 0.20));
        System.out.println("Welcome!");

        boolean running = true;
        while (running) {
            boolean found = false;
            System.out.println("To get watering instructions, type the plant's name below.\nOtherwise type \"exit\" to leave.");
            String usersChoiceRaw = scanner.nextLine();
            String usersChoiceEdit = usersChoiceRaw.trim();
            if ( usersChoiceEdit.equalsIgnoreCase("exit")){
                System.out.println("Thank you, good bye!");
                running = false;
            }
            else {
                for (Plant plant : hostedPlants) {
                    if (usersChoiceEdit.equalsIgnoreCase(plant.getName())) {
                        System.out.println(plant.wateringService());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("I don't recognise the name.\nMake sure to spell the name correctly and try again!");
                }
            }




        }



    } //STATIC VOID MAIN
} // MAIN CLASS

        // better to not have many if statements
        // check pizza project to reuse menu code and switch case







        /*
        double liquidAmount = laura.calculateLiquidAmount();
        LiquidType liquidType = laura.getLiquidType;

        sout plant leura.getname;
        sout   liquid type getliquidtype;
        sout liquid amount

           */



