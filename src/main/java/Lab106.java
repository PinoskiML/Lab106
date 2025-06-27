import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) throws IOException {
        System.out.println("Howdy!? Lab 1.06");

        Employee employee = new Employee("Jimmy J Jackson Jr", "email@com", 19, 22222);
        System.out.println(employee.toString());

        Intern intern = new Intern("Karl Kevin Karlson", "karl@blah.com", 66,2333333);
        System.out.println(intern.toString());

    //4
        Scanner scanner = new Scanner(System.in);
        String filepath = "src/main/java/employees.txt";
        FileWriter fileWriter = new FileWriter(filepath, true);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        System.out.println("how many new employees?");
        int numberNewEmployees = Integer.parseInt(scanner.nextLine());

        //System.out.println("\n" + numberNewEmployees + 1); //  checks that the string is now actually an int.

        try {


            for (int i = 0; i < numberNewEmployees; i++) {
                int age = 0;
                double salary = 0;
                boolean validAge = false;
                boolean validSalary = false;

                System.out.println("\nDetails of employee " + (i +1));
                System.out.println("Name");
                String name = scanner.nextLine();
                System.out.println("Email");
                String email = scanner.nextLine();
                System.out.println("Age");

                do{
                    try{
                        age = Integer.parseInt(scanner.nextLine());

                        if (age < 0){
                            System.out.println("Age must be positive");
                        } else if (age < 18) {
                            System.out.println("Must be at least 18 years old");

                        }else {


                            validAge = true;
                        }
                    } catch (NumberFormatException numberFormatException){
                        System.out.println("Age must be an int");
                    }
                } while (!validAge);


                    //int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Salary:");
                do {
                    try{
                        salary = Double.parseDouble(scanner.nextLine());
                        validSalary = true;
                    }catch (NumberFormatException numberFormatException){
                        System.out.println("Salary must be a number");
                    }
                } while (!validSalary);
                      /*  System.out.println("Salary");
                        double salary = Double.parseDouble(scanner.nextLine());*/


                System.out.println("Is intern? ");
                String isIntern = scanner.nextLine().toLowerCase();

                if (isIntern.contains("yes") || isIntern.contains("y")){
                    Intern newIntern = new Intern(name,email,age,salary);
                    System.out.println("New intern added: " +newIntern.toString());
                    employeeArrayList.add(newIntern);
                    fileWriter.write(newIntern.toString()+"\n");

                }else {


                    Employee newEmployee = new Employee(name, email, age, salary);
                    System.out.println("Employee added: " + newEmployee.toString());
                    employeeArrayList.add(newEmployee);
                    fileWriter.write(newEmployee.toString()+"\n");

                }
            }
        }catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            exception.printStackTrace();
        }

        fileWriter.close();

        }
        //end of main
    }




