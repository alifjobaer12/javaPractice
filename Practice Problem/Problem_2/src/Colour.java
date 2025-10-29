public class Colour {
    String color;

    public Colour(String color) {
        this.color = color;
    }

    public String getColourName() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
