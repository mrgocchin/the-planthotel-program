//Cactus extends Plant therefore inheritance is used to follow the Plant class characteristics and behaviours.
public class Cactus extends Plant {

    private static final double baseWateringAmount =0.02;

    public Cactus(String name, double height) {
        super(name, height);
    }
    public double calculateLiquidAmount(){
        return baseWateringAmount;

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
