 class Employee {
    String employeeId;
    String name;
    double salary;

    Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    void salaryRaise(double percent) {
        double raise = salary * (percent / 100);
        salary += raise;
        System.out.println(name + "'s new salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("E001", "Charlie", 50000);
        emp.salaryRaise(10); // 10% raise
    }
}