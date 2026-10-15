//CarnivorousPlant extends Plant therefore inheritance is used to follow the Plant-class' characteristics and behaviours

public class CarnivorousPlant extends Plant {
    private static final double baseWateringAmount = 0.1;
    private static final double heightMultiplier = 0.2;

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return baseWateringAmount + (heightMultiplier * getHeight());

    }

    public LiquidType getLiquidType(){
        return LiquidType.PROTEIN_DRINK;

    }

    @Override
    public String wateringService (){

        String wateringMessage = "The plant called " +
                this.getName() + " wants to be watered with " +
                this.calculateLiquidAmount() + " liters of " +
                this.getLiquidType().getReadableString();
        return wateringMessage;
    }


}
