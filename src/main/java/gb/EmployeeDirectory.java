package gb;

import java.util.List;
import java.util.ArrayList;

public class EmployeeDirectory {
    private List<Employee> employees = new ArrayList<>();
    public class Employee {
        private int employeeId;
        private String phoneNumber;
        private String name;
        private int experience;

        public Employee(int employeeId, String phoneNumber, String name, int experience) {
            this.employeeId = employeeId;
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.experience = experience;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getName() {
            return name;
        }

        public int getExperience() {
            return experience;
        }
    }

    // Метод добавления нового сотрудника
    public void addEmployee(int employeeId, String phoneNumber, String name, int experience) {
        Employee newEmployee = new Employee(employeeId, phoneNumber, name, experience);
        employees.add(newEmployee);
    }

    // Метод поиска сотрудника по стажу
    public List<Employee> findEmployeesByExperience(int targetExperience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == targetExperience) {
                result.add(employee);
            }
        }
        return result;
    }

    // Метод поиска сотрудника по имени
    public String findPhoneNumberByName(String targetName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(targetName)) {
                return employee.getPhoneNumber();
            }
        }
        return "Сотрудник с именем " + targetName + " не найден.";
    }

    // Метод поиска сотрудника по табельному номеру
    public Employee findEmployeeByEmployeeId(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null; // Если сотрудник не найден
    }
}

