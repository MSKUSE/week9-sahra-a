public abstract class Rectangle extends Shape implements Drawable{

    int sideA=0, sideB=0;


    public Rectangle(String color, int sideA,int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double perimeter(){
        return 2*(this.sideA+this.sideB);

    }
    public double area(){
        return sideB*sideA;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public void draw() {
        System.out.println("A rectangle is drawn");
    }
}
