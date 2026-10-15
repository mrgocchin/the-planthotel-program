// Palm extends Plant therefore inheritance is used to follow the Plant class characteristics and behaviours.
public class Palm extends Plant implements CanCalculateLiquidAmount{

    private static final double heightMultiplier = 0.5;

    public Palm(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return heightMultiplier * getHeight();

    }

   public String getLiquidType(){
        return LiquidType.TAP_WATER.getReadableString();
   }
   public String getPlantSpecie(){
        return PlantSpecie.PALM.getReadableString();
   }
    @Override
    public String wateringService (){

        String wateringMessage = "The "+ this.getPlantSpecie()+" called " +
                this.getName() + " wants to be watered with " +
                this.calculateLiquidAmount() + " liters of " +
                this.getLiquidType();
        return wateringMessage;
    }


}
