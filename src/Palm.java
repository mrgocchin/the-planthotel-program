// Palm extends Plant therefore inheritance is used to follow the Plant class characteristics and behaviours.
public class Palm extends Plant {

    private static final double heightMultiplier = 0.5;

    public Palm(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return heightMultiplier * getHeight();

    }

   public LiquidType getLiquidType(){
        return LiquidType.TAP_WATER;

   }
    @Override
    public String wateringService (){

        String wateringMessage = "The plant called " + this.getName() + " wants to be watered with " + this.calculateLiquidAmount() + " liters of " + this.getLiquidType().getReadableString();
        return wateringMessage;
    }


}
