package labWork_2_10_3;

/**
 * Created by Bulik on 29.07.2016.
 */
public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+", color is :" + shapeColor ;
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape)o;
        if (this.calcArea() > shape.calcArea())
        return 1;
        if (this.calcArea() < shape.calcArea())
            return -1;
        return 0;
    }

    @Override
    public void draw() {
            System.out.println(this + ", area is: " + this.calcArea());
    }

    public abstract double calcArea();

   public static Shape parseShape(String str){
       Shape shape= null;
       String[] tokens = str.split("[:,]");
       switch (tokens[0]){
           case "Rectangle":
               //lab 2 _10_3
//               shape = new Rectangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
               //lab 2_10_4
               shape = Rectangle.parseRectangle(str);
               break;
           case "Triangle":
//               shape = new Triangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]), Double.parseDouble(tokens[4]));
               shape = Triangle.parseTriangle(str);
               break;
           case "Circle":
//               shape = new Circle(tokens[1], Double.parseDouble(tokens[2]));
               shape = Circle.parseCircle(str);

       }
       return shape;
   }

}
