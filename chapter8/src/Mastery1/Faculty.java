package Mastery1;

/**
 * Represents a Faculty member at a university, extending the base UEmployee class.
 * Includes faculty-specific information such as academic department.
 */
public class Faculty extends UEmployee {
    
    private final String department;  // The academic department of the faculty member

    /**
     * Constructs a new Faculty member with name, salary, and department.
     *
     * @param name       The faculty member's full name (inherited from UEmployee)
     * @param salary     Annual salary in USD (inherited from UEmployee)
     * @param department The academic department (cannot be null or empty)
     * @throws IllegalArgumentException if department is null or empty
     */
    public Faculty(String name, double salary, String department) {
        super(name, salary);
        validateDepartment(department);
        this.department = department;
    }

    /**
     * Validates the department parameter.
     *
     * @param department The academic department to validate
     * @throws IllegalArgumentException if department is invalid
     */
    private void validateDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cannot be null or empty");
        }
    }

    /**
     * Gets the faculty member's academic department.
     *
     * @return The name of the academic department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Returns a formatted string representation of the Faculty member.
     * Includes all UEmployee information plus the academic department.
     *
     * @return Formatted string with employee details
     */
    @Override
    public String toString() {
        return String.format("%s, Department: %s", 
                           super.toString(), 
                           department);
    }
}