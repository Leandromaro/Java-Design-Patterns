package BehavioralDesignPatterns.Iterator;

public class Main {
    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepository();

        Iterator iterator = employeeRepository.getIterator();
        while (iterator.hasNext()) {
            String employee = (String)iterator.next();
            System.out.println("Employee: " + employee);
        }
    }
}
