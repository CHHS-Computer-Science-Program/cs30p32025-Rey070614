package FriendMastery;
import java.io.Serializable;

/**
 * Represents a friend with personal contact information.
 * Implements ComparableNames for sorting and Serializable for persistent storage.
 */
public class Friend implements ComparableNames, Serializable {
    // Constants for consistent formatting
    private static final String PHONE_LABEL = "Phone: ";
    private static final String EMAIL_LABEL = "Email: ";
    private static final String LINE_SEPARATOR = "\n";
    
    // Friend attributes
    private final String lName;  // Last name
    private final String fName;  // First name
    private String phone;        // Phone number
    private String email;        // Email address

    /**
     * Full constructor creates a Friend with all details.
     * @param lN Last name
     * @param fN First name
     * @param Ph Phone number
     * @param E Email address
     */
    public Friend(String lN, String fN, String Ph, String E) {
        this.lName = lN;
        this.fName = fN;
        this.phone = Ph;
        this.email = E;
    }

    /**
     * Minimal constructor creates a Friend with only name information.
     * @param lN Last name
     * @param fN First name
     */
    public Friend(String lN, String fN) {
        this(lN, fN, "", "");  // Calls full constructor with empty phone/email
    }

    // Getter methods
    public String getLName() { return lName; }
    public String getFName() { return fName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    /**
     * Formats friend information with last name first.
     * @return Formatted string with contact details
     */
    public String displayByLast() {
        return String.format("%s %s,%s%s %s,%s%s %s%s",
                lName, fName,
                LINE_SEPARATOR, PHONE_LABEL, phone,
                LINE_SEPARATOR, EMAIL_LABEL, email, LINE_SEPARATOR);
    }

    /**
     * Formats friend information with first name first.
     * @return Formatted string with contact details
     */
    public String displayByFirst() {
        return String.format("%s %s,%s%s %s,%s%s %s%s",
                fName, lName,
                LINE_SEPARATOR, PHONE_LABEL, phone,
                LINE_SEPARATOR, EMAIL_LABEL, email, LINE_SEPARATOR);
    }

    /**
     * Compares friends by first name (case-insensitive).
     * @param f Friend object to compare with
     * @return Result of comparison
     */
    @Override
    public int compareToFirstName(Object f) {
        Friend other = (Friend) f;
        return this.fName.compareToIgnoreCase(other.fName);
    }

    /**
     * Compares friends by last name (case-insensitive).
     * @param f Friend object to compare with
     * @return Result of comparison
     */
    @Override
    public int compareToLastName(Object f) {
        Friend other = (Friend) f;
        return this.lName.compareToIgnoreCase(other.lName);
    }

    /**
     * Checks equality based on first and last names (case-insensitive).
     * @param obj Friend object to compare with
     * @return true if names match, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Friend)) return false;
        
        Friend other = (Friend) obj;
        return this.fName.equalsIgnoreCase(other.fName) 
                && this.lName.equalsIgnoreCase(other.lName);
    }

    /**
     * Returns a string representation of the friend.
     * @return Formatted string with all details
     */
    @Override
    public String toString() {
        return String.format("%s %s, %s %s, %s %s",
                fName, lName,
                PHONE_LABEL, phone,
                EMAIL_LABEL, email);
    }

	@Override
	public int compareToFirstName(ComparableNames item2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareToLastName(ComparableNames item2) {
		// TODO Auto-generated method stub
		return 0;
	}
}