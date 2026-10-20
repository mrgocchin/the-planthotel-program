//Interface: Waterable is implemented here to garantee that all subclasses have the required methods without repenting code.
//inheritance: The subclasses automatically implement Waterable by Inheritance.
public abstract class Plant implements Waterable{
    private double height;
    private String name;

    // Encapsulation: The class controls access to its data with private fields.
    // Methods control access to the fields value.

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


    //Polymorphism:
    //The method wateringService() is written only once for all the subclasses of Plant.
    //The methods getLiquidType, getPlantSpecies, getUnitOfMeasure and calculateLiquidAmount
    // are overridden in each subclass.
    //This allows to get different result from wateringService() depending on the selected object.

    public String wateringService() {
        String wateringMessage = "The " + this.getPlantSpecies() + " called " +
                this.getName() + " wants to be watered with " +
                this.calculateLiquidAmount() + this.getUnitOfMeasure() + " of " +
                this.getLiquidType();
        return wateringMessage;
    }

}
