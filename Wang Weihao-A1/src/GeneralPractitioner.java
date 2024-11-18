public class GeneralPractitioner extends HealthProfessional {
    // Instance variables specific to General Practitioner
    private String clinicLocation; // Location of the GP's clinic
    private boolean homeVisitAvailable; // Whether home visits are available

    // Default constructor
    public GeneralPractitioner() {
        super(); // Call the base class default constructor
        this.clinicLocation = "Unknown";
        this.homeVisitAvailable = false;
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String specialization,
                               int yearsOfExperience, String contactNumber,
                               String email, String clinicLocation, boolean homeVisitAvailable) {
        super(id, name, specialization, yearsOfExperience, contactNumber, email);
        this.clinicLocation = clinicLocation;
        this.homeVisitAvailable = homeVisitAvailable;
    }

    // Method to display details
    @Override
    public void displayInformation() {
        System.out.println("The health professional is a General Practitioner.");
        super.displayInformation(); // Call the base class method
        System.out.println("Clinic Location: " + clinicLocation);
        System.out.println("Home Visits Available: " + (homeVisitAvailable ? "Yes" : "No"));
    }

    // Getter and Setter for Clinic Location
    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }

    // Getter and Setter for Home Visit Availability
    public boolean isHomeVisitAvailable() {
        return homeVisitAvailable;
    }

    public void setHomeVisitAvailable(boolean homeVisitAvailable) {
        this.homeVisitAvailable = homeVisitAvailable;
    }
}
//A