 class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}