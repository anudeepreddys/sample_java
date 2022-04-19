public class RegularPolygon {
    // Declaration of Variables
    private int n;
    private double side;
    private double x,y;
    // Constructor without arguments
    public RegularPolygon()
    {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    // Constructor with arguments
    public RegularPolygon(int n1,double side1)
    {
        n = n1;
        side = side1;
        x = 0;
        y = 0;
    }
    // Constructor with all arguments
    public RegularPolygon(int n1,double side1,double x1,double y1)
    {
        n = n1;
        side = side1;
        x = x1;
        y = y1;
    }
    // Setter methods
    public void set_n(int n1)
    {
        n = n1;
    }
    public void set_side(double side1)
    {
        side = side1;
    }
    public void set_x(double x1)
    {
        x = x1;
    }
    public void set_y(double y1)
    {
        y = y1;
    }
    // Getter methods
    public int get_n()
    {
        return n;
    }
    public double get_side()
    {
        return side;
    }
    public double get_x()
    {
        return x;
    }
    public double get_y()
    {
        return y;
    }
    // Calculation of Perimeter
    public double getPerimeter()
    {
        return n*side;
    }
    // Calculation of Area
    public double getArea()
    {
        double Area=(n * side * side) / (Math.tan(Math.PI / n) * 4);
        return Area;
    }
    public static void main(String[] args) {
        // Creation of RegularPolygon object
        RegularPolygon rp1 = new RegularPolygon();
        double perimeter_1 = rp1.getPerimeter();
        double area_1 = rp1.getArea();
        System.out.println("Perimeter and Area of First Polygon is " + perimeter_1 +" and "+ area_1);
        // Creation of RegularPolygon object
        RegularPolygon rp2 = new RegularPolygon(6,4);
        double perimeter_2 = rp2.getPerimeter();
        double area_2 = rp2.getArea();
        System.out.println("Perimeter and Area of Second Polygon is " + perimeter_2 +" and "+ area_2);
        // Creation of RegularPolygon object
        RegularPolygon rp3 = new RegularPolygon();
        double perimeter_3 = rp3.getPerimeter();
        double area_3 = rp3.getArea();
        System.out.println("Perimeter and Area of Third Polygon is " + perimeter_3 +" and "+ area_3);
    }
}

