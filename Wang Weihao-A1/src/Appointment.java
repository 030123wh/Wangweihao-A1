public class Appointment {
    // Instance variables for patient details
    private String patientName;
    private String mobilePhone;

    // Instance variable for the preferred time slot
    private String preferredTimeSlot;

    // The selected doctor (can be a GeneralPractitioner or Specialist)
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this("Unknown", "Unknown", "Unknown", null);
    }

    // Constructor that initializes all instance variables
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all instance variables
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.printf("Patient Name: %s%n", patientName);
        System.out.printf("Mobile Phone: %s%n", mobilePhone);
        System.out.printf("Preferred Time Slot: %s%n", preferredTimeSlot);
        System.out.print("Selected Doctor: ");
        if (selectedDoctor == null) {
            System.out.println("No doctor selected.");
        } else {
            selectedDoctor.displayInformation();
        }
        System.out.println("===========================");
    }

    // Additional methods can be added here if needed


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}
//A