public class Main {
    public static void main(String[] args) {
        Colour colour1 = new Colour("Red");
        Colour colour2 = new Colour("Green");

        Product self = new Shelf(colour1);
        Product desk = new Shelf(colour2);

        System.out.println(self.getColour());
        System.out.println(desk.getColour());
    }
}