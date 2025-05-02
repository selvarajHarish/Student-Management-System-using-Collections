package collection.studentsystem;

import java.util.*;

public class Student {
    private String name;
    private long phone;
    private String email;
    private String gender;
    private String degree;
    private String stream;
    private int yop;
    private double cgpa;
    private String status;
    private Date doj;

    public Student(String name, long phone, String email, String gender, String degree, String stream, int yop, double cgpa, String status, Date doj) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.degree = degree;
        this.stream = stream;
        this.yop = yop;
        this.cgpa = cgpa;
        this.status = status;
        this.doj = doj;
    }

    public Student() {}

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    public String getStream() { return stream; }
    public void setStream(String stream) { this.stream = stream; }

    public int getYop() { return yop; }
    public void setYop(int yop) { this.yop = yop; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getDoj() { return doj; }
    public void setDoj(Date doj) { this.doj = doj; }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email + "\nGender: " + gender +
                "\nDegree: " + degree + "\nStream: " + stream + "\nYOP: " + yop + "\nCGPA: " + cgpa +
                "\nStatus: " + status + "\nDOJ: " + doj;
    }
}
