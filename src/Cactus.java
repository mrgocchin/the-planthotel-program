public class Cactus extends Plant {
    public Cactus(String name, double height) {
        super(name, height);
    }
    public double calculateLiquidAmount(){
        return 0.02;

    }

    public LiquidType getLiquidType(){
        return LiquidType.MINERAL_WATER;

    }
    @Override
    public String wateringService (){

        String wateringMessage = "The plant called " + this.getName() + " wants to be watered with " + this.calculateLiquidAmount() + " liters of " + this.getLiquidType().getReadableString();
        return wateringMessage;
    }
}
