package project;


class Employeeex {
    String firstName;
    String lastName;
    double monthlySalary;

    // Constructor
    public Employeeex(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    // Set methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    // Get methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void giveRaise() {
        monthlySalary *= 1.10;
    }
}



public class Employeedetails {
    public static void main(String[] args) {
        // Create two Employee objects
        Employeeex employee1 = new Employeeex("John", "Doe", 5000.0);
        Employeeex employee2 = new Employeeex("Jane", "Smith", 6000.0);

        // Display each object's yearly salary
        System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() + ": $" + employee1.getYearlySalary());
        System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() + ": $" + employee2.getYearlySalary());

        // Give each Employee a 10% raise
        employee1.giveRaise();
        employee2.giveRaise();

        // Display each object's yearly salary after the raise
        System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() + " after 10% raise: $" + employee1.getYearlySalary());
        System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() + " after 10% raise: $" + employee2.getYearlySalary());
    }
}
