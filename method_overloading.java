class Area {
    // Method to calculate the area of a square
    double area(float sides) {
        return sides * sides;
    }
    // Method to calculate the area of a circle
    double area(double radius) {
        return 3.14 * radius * radius;    
    }
    // Method to calculate the area of a rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }
}
 class Main{
       public static void main(String[] args) {
        Area ob = new Area();
 // No need to cast here as `sides` is already a float

        double circle_area = ob.area(20.4);
        System.out.println("Area of the circle is " + circle_area);

        double square_area = ob.area(56);
        System.out.println("Area of the square is " + square_area);

        double rectangle_area = ob.area(65, 43);
        System.out.println("Area of the rectangle is " + rectangle_area);
    }
}
