public class Desk implements Product{
    private Colour colour;

    public Desk(Colour colour) {
        this.colour = colour;
    }
    @Override
    public Colour getColour() {
        return colour;
    }
}
