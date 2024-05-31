package task5.point2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Runner {

    private static List<Employee> createEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        String[] departments = {"IT", "HR", "Business", "Social Media"};
        String[] names = {"John", "Adam", "Max", "Lev"};

        for (int i = 0; i < 20; i++) {
            String randName = names[(int) (Math.random() * (names.length))];
            String randDepartment = departments[(int) (Math.random() * (departments.length))];
            Integer randSalary = (int) (Math.random() * (10000));
            Integer randAge = (int) (Math.random() * (100));

            employeeList.add(new Employee(randName, randDepartment, randSalary, randAge));
        }
        return  employeeList;
    }

    private static List<Employee> sortEmployees(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(el -> el.getAge() >= 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
    }

    private static Integer getEmployeesITCount(List<Employee> employeeList) {
        return (int) employeeList.stream()
                .filter(el -> el.getDepartment().equals("IT"))
                .count();
    }

    private static Employee getEmployeeWithMaxSalary(List<Employee> employeeList) {
        return employeeList.stream().max(Comparator.comparingInt(Employee::getSalary)).orElseThrow();
    }

    private static List<Employee> getEmployeesHR(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(el -> el.getDepartment().equals("HR"))
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
    }

    private static Integer getAvgSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .mapToInt(Employee::getSalary)
                .reduce(Integer::sum)
                .orElse(0) / employeeList.size();
    }

    public static void main(String[] args) {
        List<Employee> employeeList = createEmployees();

        System.out.println("1. Employees:");
        employeeList.forEach(System.out::println);

        System.out.println("\n2. Sorted Employees:");
        sortEmployees(employeeList).forEach(System.out::println);

        System.out.println("\n3. IT Employees count: " + getEmployeesITCount(employeeList));

        System.out.println("\n4. Employee with max salary:");
        System.out.println(getEmployeeWithMaxSalary(employeeList));

        System.out.println("\n5. HR Employees:");
        getEmployeesHR(employeeList).forEach(System.out::println);

        System.out.println("\n6. Employees avg salary: " + getAvgSalary(employeeList));
    }
}
