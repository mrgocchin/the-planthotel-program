public abstract class Plant
{
    private double height;
    private String name;

    public Plant(String name, double height) {
        this.height = height;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public abstract String wateringService ();

}
