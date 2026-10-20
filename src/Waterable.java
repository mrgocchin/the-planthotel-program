//Interface: This binds all classes that can be watered.
// From main one does not need to know the object class, but only if it can be watered.
public interface Waterable {
    public double calculateLiquidAmount();

    public String getUnitOfMeasure();

    public String getLiquidType();

    public String getName();

    public String getPlantSpecies();

    public String wateringService();

}
