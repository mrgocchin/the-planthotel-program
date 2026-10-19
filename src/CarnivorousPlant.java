//Inheritance:
// CarnivorousPlant extends Plant therefore inheritance is used to follow the Plant-class' characteristics and behaviours

public class CarnivorousPlant extends Plant implements Waterable {
    private static final double baseWateringAmount = 0.1;
    private static final double heightMultiplier = 0.2;


    // Encapsulation: The class controls access to its data with private fields.
    // Methods control access to data and behaviour.


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




