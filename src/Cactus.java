//Cactus extends Plant therefore inheritance is used to follow the Plant class characteristics and behaviours.
public class Cactus extends Plant implements Waterable {

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
