public abstract class Plant {
    private double height;
    private String name;

    public Plant(String name, double height) {
        this.height = height;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public abstract String getPlantSpecies();

    public abstract double calculateLiquidAmount();

    public abstract String getUnitOfMeasure();

    public abstract String getLiquidType();


    //Polymorphism:
    //The class Plant has set the methods getLiquidType, getPlantSpecie and calculateLiquidAmount to abstract and empty.
    //These are overridden in each subclass in order to implement them differently.
    //When wateringService is called on any plant object, it results in the behaviour described by the object's class.

    public String wateringService() {
        String wateringMessage = "The " + this.getPlantSpecies() + " called " +
                this.getName() + " wants to be watered with " +
                this.calculateLiquidAmount() + this.getUnitOfMeasure() + " of " +
                this.getLiquidType();
        return wateringMessage;
    }

}
