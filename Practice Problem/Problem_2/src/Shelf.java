public class Shelf implements Product {
    private Colour colour;

    public Shelf(Colour colour) {
        this.colour = colour;
    }
    @Override
    public Colour getColour() {
        return colour;
    }
}
