import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeBook = new Employee[11];
        Employee ivanov = new Employee("Иванов", "Иван", "Иванович", 1, 15524);
        Employee semenov = new Employee("Семенов", "Алексей", "Андреевич", 2, 17743);
        Employee kuznecov = new Employee("Кузнецов", "Алексей", "Андреевич", 3, 10976);
        Employee suhoi = new Employee("Сухой", "Алексей", "Андреевич", 4, 923054);
        Employee popov = new Employee("Попов", "Алексей", "Андреевич", 4, 15460);
        Employee skvortsov = new Employee("Скворцов","Андрей", "Витальевич",1,87644);
        Employee shakirov = new Employee("Шакиров", "Алексей", "Андреевич", 3, 10976);
        Employee tonkih = new Employee("Тонких", "Алексей", "Андреевич", 5, 10976);
        Employee kovalev = new Employee("Ковалев", "Алексей", "Андреевич", 2, 10976);
        Employee smirnov = new Employee("Смирнов", "Алексей", "Андреевич", 5, 10976);
        employeeBook[0] = ivanov;
        employeeBook[1] = semenov;
        employeeBook[2] = kuznecov;
        employeeBook[3] = suhoi;
        employeeBook[4] = popov;
        employeeBook[5] = skvortsov;
        employeeBook[6] = shakirov;
        employeeBook[7] = tonkih;
        employeeBook[8] = kovalev;
        employeeBook[9] = smirnov;

        System.out.println("Список сотрудников " + Arrays.toString(employeeBook));
        System.out.println("Сумма затрат на месяц " + Employee.sumSalary(employeeBook));
        System.out.println("Минимальная зарплата составляет "+ Employee.minSalaryCheck(employeeBook));
        System.out.println("Максимальная зарплата составляет "+ Employee.maxSalaryCheck(employeeBook));
        System.out.println("Средняя зарплата " + Employee.averegeSalary(employeeBook));




    }


}




