package labWork_2_10_3;

/**
 * Created by Bulik on 29.07.2016.
 */
public class Triangle extends Shape {
    private double a,b,c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public double calcArea() {
        double s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)* (s-b) * (s-c));
    }

    public static Triangle parseTriangle (String str){
        String[] tokens = str.split("[:,]");
        return new Triangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]), Double.parseDouble(tokens[4]));
    }

}

