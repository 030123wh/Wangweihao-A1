public class Specialist extends HealthProfessional {
    // Instance variables specific to Specialist
    private String specialtyField; // Field of specialty
    private int numberOfPublications; // Number of research publications

    // Default constructor
    public Specialist() {
        super(); // Call the base class default constructor
        this.specialtyField = "Unknown";
        this.numberOfPublications = 0;
    }

    // Parameterized constructor
    public Specialist(int id, String name, String specialization,
                      int yearsOfExperience, String contactNumber,
                      String email, String specialtyField, int numberOfPublications) {
        super(id, name, specialization, yearsOfExperience, contactNumber, email);
        this.specialtyField = specialtyField;
        this.numberOfPublications = numberOfPublications;
    }

    // Method to display details
    @Override
    public void displayInformation() {
        System.out.println("The health professional is a Specialist.");
        super.displayInformation(); // Call the base class method
        System.out.println("Specialty Field: " + specialtyField);
        System.out.println("Number of Publications: " + numberOfPublications);
    }

    // Getter and Setter for Specialty Field
    public String getSpecialtyField() {
        return specialtyField;
    }

    public void setSpecialtyField(String specialtyField) {
        this.specialtyField = specialtyField;
    }

    // Getter and Setter for Number of Publications
    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
//A