public enum PlantSpecie {
    PALM("Palm"),
    CACTUS("Catus"),
    CARNIVOROUS_PLANT("Carnivorous plant");

    private final String readableString;

    PlantSpecie(String readableString) {
        this.readableString = readableString;
    }

    public String getReadableString() {
        return readableString;
    }
}
