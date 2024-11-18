public class HealthProfessional {
    // Instance variables to store basic information
    private int id; // Unique identifier for each health professional
    private String name; // Name of the health professional
    private String specialization; // Area of expertise
    private int yearsOfExperience; // Number of years in practice
    private String contactNumber; // Phone number for contact
    private String email; // Email address for communication

    // Default constructor
    public HealthProfessional() {
        // Initialize variables with default values
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
        this.yearsOfExperience = 0;
        this.contactNumber = "N/A";
        this.email = "N/A";
    }

    // Parameterized constructor
    public HealthProfessional(int id, String name, String specialization,
                              int yearsOfExperience, String contactNumber, String email) {
        // Assign parameter values to instance variables
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.contactNumber = contactNumber;
        this.email = email;
    }



    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Specialization
    public String getSpecialization() {
        return specialization;
    }

    // Setter for Specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter for Years of Experience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // Setter for Years of Experience
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getter for Contact Number
    public String getContactNumber() {
        return contactNumber;
    }

    // Setter for Contact Number
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter for Email
    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display all instance variables
    public void displayInformation() {
        // Print each variable with a descriptive label
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
    }
}
//A