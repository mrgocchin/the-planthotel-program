public enum LiquidType {
    TAP_WATER("Tap water"),
    MINERAL_WATER("Mineral water"),
    PROTEIN_DRINK("Protein drink");

    private final String readableString ;

    LiquidType(String readableString) {

        this.readableString = readableString;
    }
    public String getReadableString(){

        return readableString;
    }
}
