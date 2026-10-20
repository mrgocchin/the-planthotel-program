//Inheritance: Palm extends Plant therefore it follows the Plant class characteristics and behaviours.
//Interface: by inheritance Palm implements the Waterable interface.
public class Palm extends Plant {

    private static final double heightMultiplier = 0.5;

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public String getPlantSpecies() {
        return PlantSpecies.PALM.getReadableString();
    }

    @Override
    public double calculateLiquidAmount() {
        return heightMultiplier * getHeight();
    }

    @Override
    public String getUnitOfMeasure() {
        return UnitOfMeasure.LITERS.getUnitAbbreviation();
    }

    @Override
    public String getLiquidType() {
        return LiquidType.TAP_WATER.getReadableString();
    }


}
