class Student {
    String name;
    String rollNumber;
    double[] marks;

    Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    double totalMarks() {
        double total = 0;
        for (double m : marks) total += m;
        return total;
    }

    double average() {
        return totalMarks() / marks.length;
    }

    public static void main(String[] args) {
        Student s = new Student("Bob", "R001", new double[]{80, 90, 75, 85});
        System.out.println("Total: " + s.totalMarks());
        System.out.println("Average: " + s.average());
    }
}