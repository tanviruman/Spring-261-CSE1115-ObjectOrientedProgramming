 class Car {
    String color;
    String model;
    String name;

    Car(String color, String model, String name) {
        this.color = color;
        this.model = model;
        this.name = name;
    }

    void startEngine() {
        System.out.println(name + "'s engine started!");
    }

    void stopEngine() {
        System.out.println(name + "'s engine stopped!");
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Model: " + model + ", Color: " + color);
    }

    public static void main(String[] args) {
        Car car = new Car("Red", "Sedan", "Toyota");
        car.displayDetails();
        car.startEngine();
        car.stopEngine();
    }
}