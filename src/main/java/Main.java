public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
            101,
            "Kavya",
            "DevOps"
        );

        System.out.println("Employee Management Application");
        System.out.println("--------------------------------");

        employee.displayEmployee();
    }
}
