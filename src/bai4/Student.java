package bai4;

public class Student {
    private String name;
    private int age;
    private String gender;
    private double averagePoint;

    public Student() {
    }

    public Student(String name, int age, String gender, double averagePoint) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.averagePoint = averagePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
