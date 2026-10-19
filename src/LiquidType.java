public enum LiquidType {
    TAP_WATER("tap water"),
    MINERAL_WATER("mineral water"),
    PROTEIN_DRINK("protein drink");

    private final String readableString;

    LiquidType(String readableString) {
        this.readableString = readableString;
    }

    public String getReadableString() {
        return readableString;
    }
}
