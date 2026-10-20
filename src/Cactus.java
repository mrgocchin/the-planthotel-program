//Inheritance: Cactus extends Plant therefore it follows the Plant class characteristics and behaviours.
//Interface: by inheritance Cactus implements the Waterable interface.

public class Cactus extends Plant {

    private static final double baseWateringAmount = 2;

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public String getPlantSpecies() {
        return PlantSpecies.CACTUS.getReadableString();
    }

    @Override
    public double calculateLiquidAmount() {
        return baseWateringAmount;
    }

    @Override
    public String getUnitOfMeasure() {
        return UnitOfMeasure.CENTILITERS.getUnitAbbreviation();
    }

    @Override
    public String getLiquidType() {
        return LiquidType.MINERAL_WATER.getReadableString();
    }


}
