public enum UnitOfMeasure {
    LITERS("L"),
    CENTILITERS("cL");

    private final String abbreviation;

    UnitOfMeasure(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getUnitAbbreviation() {
        return abbreviation;
    }
}
