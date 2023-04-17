public class Employee {
    private String lastName;
    private String firstName;
    private String surName;
    private int deportament;
    private int salary;
    public final int id;
    public static int idNum = 1;


    public Employee(String lastName, String firstName, String surName, int deportament, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.deportament = deportament;
        this.salary = salary;
        id = idNum;
        idNum++;


    }

    public String toString() {
        return "ФИО: " + lastName + " " + firstName + " " + surName + " Отдел: " + deportament + " Зарплата: " + salary + " руб " + " id: " + id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDeportament() {
        return deportament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDeportament(int deportament) {
        this.deportament = deportament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Employee maxSalaryCheck(Employee[] employees) {
      Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null)
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    public static Employee minSalaryCheck(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null)
                if (minSalary.getSalary() > employee.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }


    public static double sumSalary (Employee[] employees){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();

            }
        }
        return (double) sum;
    }

    public static int averegeSalary (Employee[] employees){
        int averege = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                averege = averege + employee.getSalary();

            }
        }
        return (int) averege / Employee.idNum;

    }





    }









