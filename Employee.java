import java.text.ParseException;

    class Employee extends Person1 {
     String empId;
     double salary;

    public Employee(String name, String dateOfBirth, String empId, double salary) throws ParseException {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}

 class Test {
    public static void main(String[] args) throws ParseException {
        Person1 person = new Person1("John Doe", "1990-05-15");
        person.displayPersonName();
        person.displayAge();

        Employee employee = new Employee("Jane Smith", "1985-08-25", "E12345", 75000.0);
        employee.displayEmployeeDetails();
    }
}


