package labWork_2_10_3;

/**
 * Created by Bulik on 29.07.2016.
 */
public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", height=" + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    public static Rectangle parseRectangle(String str){
        String[] tokens = str.split("[:,]");
        return new Rectangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
    }
}
