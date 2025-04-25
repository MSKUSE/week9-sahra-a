public class Circle extends Shape{

    private int radius;

    public Circle(){
        super();
    }
    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return super.toString() +
                " Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }
}
