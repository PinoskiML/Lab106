public class Intern extends Employee {  //necesitamos extender

    public static final double MAX_INTERN_SALARY = 20000;


    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        setType("Intern");
          //  throw new IllegalArgumentException("Intern salary cant exceed: " + MAX_INTERN_SALARY);



    }

    @Override
    public double getSalary() {
        if (super.getSalary() > MAX_INTERN_SALARY){
            //System.out.println("Intern salary capped at " + MAX_INTERN_SALARY);
            return MAX_INTERN_SALARY;
        }
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {

        if (salary > MAX_INTERN_SALARY) {
            //System.out.println("Intern salary capped at " + MAX_INTERN_SALARY);
            super.setSalary(MAX_INTERN_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return super.toString() +" (Salary capped at 20000 per Intern)";
    }
}
