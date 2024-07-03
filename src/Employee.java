import java.util.Scanner;

class Employee {
    double salary;
    int hoursPerDay;

    public void getInfo(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public void addSal() {
        if (this.salary < 500) {
            this.salary += 10;
        }
    }

    public void addWork() {
        if (this.hoursPerDay > 6) {
            this.salary += 5;
        }
    }

    public void printSalary() {
        System.out.println("Final Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter hours of work per day:");
        int hours = scanner.nextInt();

        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();
        emp.printSalary();
    }
}
