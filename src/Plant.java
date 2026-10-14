public abstract class Plant {
   // why not necessary? --> private String plantSpecie;
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
    public abstract String wateringService ();

  //  String wateringMessage = "The plant called " + this.name + " wants to be watered with " + this.calculateLiquidAmount() + " liters of " + this.getLiquidType();
  //      return wateringMessage
}
