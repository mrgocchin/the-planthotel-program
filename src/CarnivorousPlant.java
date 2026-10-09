public class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }
    public double calculateLiquidAmount(){
        return 0.1 + (0.2 * getHeight());

    }

    public LiquidType getLiquidType(){
        return LiquidType.PROTEIN_DRINK;

    }

    @Override
    public void wateringService (){

         String wateringMessage = "The plant called " + this.getName() + " wants to be watered with " + this.calculateLiquidAmount() + " liters of " + this.getLiquidType();
        System.out.println(wateringMessage);
    }


}
