public class Palm extends Plant {
    public Palm(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return 0.5 * getHeight();

    }

   public LiquidType getLiquidType(){
        return LiquidType.TAP_WATER;

   }
    @Override
    public void wateringService (){

        String wateringMessage = "The plant called " + this.getName() + " wants to be watered with " + this.calculateLiquidAmount() + " liters of " + this.getLiquidType();
        System.out.println(wateringMessage);
    }


}
