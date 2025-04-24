package Mastery1;

/**
 * Represents a Staff member at a university, extending the base UEmployee class.
 * Includes staff-specific information such as job title.
 */
public class Staff extends UEmployee {
    
    private final String jobTitle;  // The staff member's official job position

    /**
     * Constructs a new Staff member with name, salary, and job title.
     *
     * @param name      The staff member's full name (inherited from UEmployee)
     * @param salary    Annual salary in USD (inherited from UEmployee)
     * @param jobTitle  The official job position (cannot be null or empty)
     * @throws IllegalArgumentException if jobTitle is null or empty
     */
    public Staff(String name, double salary, String jobTitle) {
        super(name, salary);
        validateJobTitle(jobTitle);
        this.jobTitle = jobTitle;
    }

    /**
     * Validates the job title parameter.
     *
     * @param jobTitle The job title to validate
     * @throws IllegalArgumentException if jobTitle is invalid
     */
    private void validateJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Job title cannot be null or empty");
        }
    }

    /**
     * Gets the staff member's job title.
     *
     * @return The official job position
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Returns a formatted string representation of the Staff member.
     * Includes all UEmployee information plus the job title.
     *
     * @return Formatted string with employee details
     */
    @Override
    public String toString() {
        return String.format("%s, Job Title: %s", 
                          super.toString(), 
                          jobTitle);
    }
}


