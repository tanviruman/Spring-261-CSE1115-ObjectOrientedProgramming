class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void updateAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address updated to: " + address);
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    public static void main(String[] args) {
        Person p = new Person("Diana", 25, "123 Main St");
        p.displayDetails();
        p.updateAddress("456 New Ave");
        p.displayDetails();
    }
}