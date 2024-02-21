package gb;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса EmployeeDirectory
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавление сотрудников в справочник
        directory.addEmployee(1, "+79234564231", "Самойлов", 2);
        directory.addEmployee(2, "+79835674367", "Москалева", 10);
        directory.addEmployee(3, "+79645346709", "Громов", 5);
        directory.addEmployee(1, "+79234567777", "Киселев", 2);

        // Поиск сотрудников с опытом 5 лет и вывод их имен
        List<EmployeeDirectory.Employee> employeesExperience = directory.findEmployeesByExperience(2);
        System.out.println("1. Сотрудники со стажем 2 года:");
        for (EmployeeDirectory.Employee employee : employeesExperience) {
            System.out.println(employee.getName());
        }

        // Поиск номера телефона по имени сотрудника
        String phoneNumber = directory.findPhoneNumberByName("Громов");
        System.out.println("2. Номер телефона Громова: " + phoneNumber);

        // Поиск сотрудника по табельному номеру и вывод его имени
        EmployeeDirectory.Employee employee = directory.findEmployeeByEmployeeId(5);
        if (employee != null) {
            System.out.println("3. Сотрудник с табельным номером 2 найден: " + employee.getName());
        } else {
            System.out.println("3. Сотрудник с табельным номером 2 не найден.");
        }
    }
}