//Enum: Thanks to enums only predefined values can be used avoiding mistakes.
public enum PlantSpecies {
    PALM("Palm"),
    CACTUS("Cactus"),
    CARNIVOROUS_PLANT("Carnivorous plant");

    private final String readableString;

    PlantSpecies(String readableString) {
        this.readableString = readableString;
    }

    public String getReadableString() {
        return readableString;
    }
}
