public class Employer {
    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private String position;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + age + " " + (gender ? "Male" : "Female") + " " + position + " " + salary;
    }
}
