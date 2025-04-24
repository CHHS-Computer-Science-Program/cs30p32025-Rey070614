package Mastery1;

/**
 * Represents a university employee system that demonstrates the use of UEmployee, Faculty, and Staff classes.
 * This class serves as the main entry point for the university employee management system.
 */
public class university extends UEmployee {  // Changed to proper PascalCase naming

    /**
     * Constructs a new University employee with name and salary.
     *
     * @param name   The name of the university employee
     * @param salary The salary of the university employee
     */
    public university(String name, double salary) {
        super(name, salary);
    }

    /**
     * Main method that demonstrates the creation and display of university faculty and staff.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create and display faculty members
        createAndDisplayFaculty();
        
        // Create and display staff members
        createAndDisplayStaff();
    }

    /**
     * Creates and displays faculty member information.
     */
    private static void createAndDisplayFaculty() {
        Faculty faculty = new Faculty("Mr. Reynaldo de Guzman", 75000, "BFA Performing Arts");
        System.out.println("Faculty Member: " + faculty);
        
        Faculty faculty1 = new Faculty("Mr. Abdalha", 95000, "Computer Science");
        System.out.println("Faculty Member: " + faculty1);
    }

    /**
     * Creates and displays staff member information.
     */
    private static void createAndDisplayStaff() {
        Staff staff = new Staff("Mr. Justine Fung", 50000, "Administrative Assistant");
        System.out.println("Staff Member: " + staff);
        
        Staff staff1 = new Staff("Mr. Rishi Bhalla", 50000, "Student Counselor");
        System.out.println("Staff Member: " + staff1);
    }
}