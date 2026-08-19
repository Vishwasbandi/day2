package daytwo;

import java.util.Scanner;

class code17 {

    String name;
    int age;
    String designation;
    double salary = 30000;
}

 class code17Management {

    static Scanner sc = new Scanner(System.in);
    static code17 e = new code17();

    // CREATE METHOD
    static void create() {

        while (true) {

            // Name
            while (true) {
                System.out.print("Enter your name: ");
                e.name = sc.nextLine().trim();

                int spaces = 0;

                for (int i = 0; i < e.name.length(); i++) {
                    if (e.name.charAt(i) == ' ') {
                        spaces++;
                    }
                }

                if (e.name.isEmpty()) {
                    System.out.println("Name cannot be empty!");
                } 
                else if (spaces > 2) {
                    System.out.println("Maximum 2 spaces allowed!");
                } 
                else {
                    break;
                }
            }

            // Age
            while (true) {
                System.out.print("Enter your age: ");

                if (sc.hasNextInt()) {
                    e.age = sc.nextInt();
                    sc.nextLine();

                    if (e.age >= 16 && e.age <= 66) {
                        break;
                    }

                    System.out.println("Age must be between 16 and 66!");
                } 
                else {
                    System.out.println("Please enter a valid number!");
                    sc.nextLine();
                }
            }

            // Designation
            while (true) {

                System.out.println("\n1. Programmer");
                System.out.println("2. Manager");
                System.out.println("3. Tester");
                System.out.print("Select designation: ");

                int d;

                if (sc.hasNextInt()) {
                    d = sc.nextInt();
                    sc.nextLine();
                } 
                else {
                    System.out.println("Please enter a valid choice!");
                    sc.nextLine();
                    continue;
                }

                if (d == 1) {
                    e.designation = "Programmer";
                    break;
                } 
                else if (d == 2) {
                    e.designation = "Manager";
                    break;
                } 
                else if (d == 3) {
                    e.designation = "Tester";
                    break;
                } 
                else {
                    System.out.println("Invalid choice!");
                }
            }

            // Confirmation
            System.out.println("\n--- Employee Details ---");
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Designation: " + e.designation);

            System.out.print("Do you want to edit? (yes/no): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Employee saved!");
                break;
            }
        }
    }

    // DISPLAY METHOD
    static void display() {

        if (e.name == null) {
            System.out.println("No employee records available.");
        } 
        else {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Designation: " + e.designation);
            System.out.println("Salary: ₹" + e.salary);
        }
    }

    // RAISE SALARY METHOD
    static void raiseSalary() {

        if (e.name == null) {
            System.out.println("No employee records available.");
            return;
        }

        System.out.println("Current Salary: ₹" + e.salary);

        System.out.print("Enter salary raise: ₹");

        if (sc.hasNextDouble()) {
            double raise = sc.nextDouble();
            sc.nextLine();

            if (raise > 0) {
                e.salary = e.salary + raise;

                System.out.println("Salary updated!");
                System.out.println("New Salary: ₹" + e.salary);
            } 
            else {
                System.out.println("Salary raise must be greater than 0.");
            }
        } 
        else {
            System.out.println("Please enter a valid salary amount.");
            sc.nextLine();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int choice = 0;

        do {
            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } 
            else {
                System.out.println("Please enter a valid choice!");
                sc.nextLine();
                continue;
            }

            if (choice == 1) {
                create();
            } 
            else if (choice == 2) {
                display();
            } 
            else if (choice == 3) {
                raiseSalary();
            } 
            else if (choice == 4) {
                System.out.println(
                    "Thank you for using Employee Management System!"
                );
            } 
                  else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}