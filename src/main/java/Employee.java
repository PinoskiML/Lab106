public class Employee {

    private String name;
    private String email;
    private int age;
    private double salary;
    private String type = "Employee";


    //Constructor


    public Employee( String name, String email, int age, double salary) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or over");
        }

        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }


    // Getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getType() {
        return type;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setType(String type) {
        this.type = type;
    }

    //to string

    @Override
    public String toString() {
        return  "" + getType() +
                " name:'" + getName() + '\'' +
                ", email:'" + getEmail() + '\'' +
                ", age:" + getAge() +
                ", salary:" + getSalary() +
                ' ';
    }



}


