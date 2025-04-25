public class Triangle extends Shape {


    private  int sideA, sideB, sideC;
    public Triangle(){
        super();
    }
    public Triangle(String color, int sideA, int sideB, int sideC){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle)) return false;
        Triangle triangle = (Triangle) obj;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC;
    }
}
