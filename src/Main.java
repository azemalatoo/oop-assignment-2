public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("John Smith", 67890, "Mathematics", "john.smith@example.com", "555-5678", 3.2);
        Student student3 = new Student("Alice Johnson", 13579, "Physics", "alice.johnson@example.com", "555-9012", 3.9);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        System.out.println(student1.getName() + " is on the honor roll: " + student1.checkHonorRoll());
        System.out.println(student2.getName() + " is on the honor roll: " + student2.checkHonorRoll());
        System.out.println(student3.getName() + " is on the honor roll: " + student3.checkHonorRoll());

        student2.setGpa(3.6);
        System.out.println("After GPA change, " + student2.getName() + " is on the honor roll: " + student2.checkHonorRoll());    }
}