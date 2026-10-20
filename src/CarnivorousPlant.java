//Inheritance: CarnivorousPlant extends Plant.
//It inherits the Plant-class' characteristics and behaviours, including the contract with Waterable.
//It fulfills the Waterable methods by overriding them with its specific implementations.

public class CarnivorousPlant extends Plant {
    private static final double baseWateringAmount = 0.1;
    private static final double heightMultiplier = 0.2;


    // Encapsulation: The class controls access to its data with private fields.
    // Methods control access to the fields value.


    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public String getPlantSpecies() {
        return PlantSpecies.CARNIVOROUS_PLANT.getReadableString();
    }

    @Override
    public double calculateLiquidAmount() {
        return baseWateringAmount + (heightMultiplier * getHeight());
    }

    @Override
    public String getUnitOfMeasure() {
        return UnitOfMeasure.LITERS.getUnitAbbreviation();
    }

    @Override
    public String getLiquidType() {
        return LiquidType.PROTEIN_DRINK.getReadableString();
    }


}




