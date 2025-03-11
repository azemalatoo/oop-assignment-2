public class Student {
    private String name;
    private long  studentId;
    private String major;
    private String email;
    private String phone;
    private double gpa;

    public Student() {
        this.name = "N/A";
        this.studentId = 0;
        this.major = "N/A";
        this.email = "N/A";
        this.phone = "N/A";
        this.gpa = 0.0;
    }

    public Student(String name, long studentId, String major, String email, String phone, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.email = email;
        this.phone = phone;
        this.gpa = gpa;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getEmail() {
        return email;
    }

    public double getGpa() {
        return gpa;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("GPA: " + gpa);
        System.out.println("--------------------");
    }

    public boolean checkHonorRoll() {
        return gpa >= 3.5;
    }
}