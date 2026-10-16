//Inheritance:
// CarnivorousPlant extends Plant therefore inheritance is used to follow the Plant-class' characteristics and behaviours

public class CarnivorousPlant extends Plant implements Waterable {
    private static final double baseWateringAmount = 0.1;
    private static final double heightMultiplier = 0.2;

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    public String getLiquidType(){
        return LiquidType.PROTEIN_DRINK.getReadableString();
    }
    public String getPlantSpecie(){
        return PlantSpecie.CARNIVOROUS_PLANT.getReadableString();
    }

    // Encapsulation: The class controls access to its data with private fields and
    // methods control access to data and behaviour.


    public double calculateLiquidAmount(){
        return baseWateringAmount + (heightMultiplier * getHeight());
    }

    //Polymorphism:
    //The class Plant has set the method wateringService to abstract and empty.
    //This is overridden in each subclass which implements it differently.
    //From main the method can be called on any plant object and results in the corresponding behaviour.

    @Override
    public String wateringService (){

        String wateringMessage = "The plant called " +
                this.getName() + " wants to be watered with " +
                this.calculateLiquidAmount() + " liters of " +
                this.getLiquidType();
        return wateringMessage;
    }
}
