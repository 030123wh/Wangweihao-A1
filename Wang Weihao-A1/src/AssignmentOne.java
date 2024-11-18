import java.util.ArrayList;

// Main class demonstrating the management of health professional appointments
public class AssignmentOne {
    // Collection to store all appointment instances
    private static ArrayList<Appointment> appointmentRegistry = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // Instantiate GeneralPractitioner objects with sample data
        GeneralPractitioner familyDoctorSmith = new GeneralPractitioner(1, "Dr. Wang", "Internal Medicine", 12, "138-0011-2233", "dr.wang@hospital.cn", "Beijing Central Hospital", true);
        GeneralPractitioner pediatricianJones = new GeneralPractitioner(2, "Dr. Li", "Pediatrics", 8, "139-1122-3344", "dr.li@hospital.cn", "Shanghai Children's Hospital", false);
        GeneralPractitioner pediatricianJones2 = new GeneralPractitioner(3, "Dr. Zhang", "Orthopedics", 10, "135-8899-7766", "dr.zhang@hospital.cn", "Beijing Orthopedic Center", true);

        // Instantiate Specialist objects with sample data
        Specialist cardiologistBrown = new Specialist(4, "Dr. Brown", "Cardiology", 15, "111-222-3333", "dr.brown@example.com", "Cardiac Care", 20);
        Specialist neurologistGreen = new Specialist(5, "Dr. Green", "Neurology", 12, "444-555-6666", "dr.green@example.com", "Brain Health", 15);

        // Display details of each General Practitioner
        familyDoctorSmith.displayInformation();
        drawSeparator(); // Print a separator line for better readability
        pediatricianJones.displayInformation();
        drawSeparator();
        pediatricianJones2.displayInformation();
        drawSeparator();

        // Display details of each Specialist
        cardiologistBrown.displayInformation();
        drawSeparator();
        neurologistGreen.displayInformation();
        drawSeparator();

        // Part 5 – Collection of appointments
        // Create appointments for patients with different doctors
        scheduleAppointment("John Doe", "555-1234", "9:00 AM", familyDoctorSmith);
        scheduleAppointment("Jane Smith", "555-5678", "10:00 AM", pediatricianJones);
        scheduleAppointment("Alice Brown", "555-8765", "11:00 AM", cardiologistBrown);
        scheduleAppointment("Bob Green", "555-4321", "1:00 PM", neurologistGreen);

        // Print all existing appointments
        showBookedMeetings();
        drawSeparator();

        // Cancel one appointment based on the patient's phone number
        cancelScheduledMeeting("555-5678");

        // Print existing appointments after one has been canceled
        showBookedMeetings();
        drawSeparator();
    }

    /**
     * Schedules a new appointment and adds it to the registry.
     *
     * @param patientName The name of the patient.
     * @param contactNumber The patient's contact number.
     * @param timeSlot The preferred time slot for the appointment.
     * @param doctor The doctor with whom the appointment is scheduled.
     */
    private static void scheduleAppointment(String patientName, String contactNumber, String timeSlot, HealthProfessional doctor) {
        // Validate that all necessary information is provided
        if (patientName == null || contactNumber == null || timeSlot == null || doctor == null) {
            System.out.println("Error: All appointment details must be provided.");
            return;
        }
        // Create a new appointment and add it to the registry
        Appointment newAppointment = new Appointment(patientName, contactNumber, timeSlot, doctor);
        appointmentRegistry.add(newAppointment);
        System.out.println("Appointment scheduled for " + patientName + " with " + doctor.getName());
    }

    /**
     * Displays all scheduled appointments.
     * If there are no appointments, a message will be displayed.
     */
    private static void showBookedMeetings() {
        int scheduledCount = appointmentRegistry.size();

        if (scheduledCount == 0) {
            System.out.println("The schedule is currently empty.");
        } else {
            displayMeetingList(scheduledCount);
        }
    }

    private static void displayMeetingList(int count) {
        System.out.println("Current schedule contains " + count + " meeting(s):");
        int index = 1;
        for (Appointment meeting : appointmentRegistry) {
            System.out.print(index++ + ". ");
            presentMeetingInfo(meeting);
        }
    }

    private static void presentMeetingInfo(Appointment meeting) {
        meeting.printAppointmentDetails();
        System.out.println("--------------------");
    }


    /**
     * Removes an appointment from the registry based on the contact number.
     *
     * //
     */
    private static void cancelScheduledMeeting(String phoneContact) {
        int totalAppointments = appointmentRegistry.size();
        boolean meetingLocated = false;

        for (int index = 0; index < totalAppointments; index++) {
            Appointment currentAppointment = appointmentRegistry.get(index);
            String registeredPhone = currentAppointment.getMobilePhone();

            if (registeredPhone.equals(phoneContact)) {
                appointmentRegistry.remove(index);
                displayCancellationMessage(phoneContact);
                meetingLocated = true;
                return;
            }
        }


        if (!meetingLocated) {
            displayErrorMessage(phoneContact);
        }
    }

    private static void displayCancellationMessage(String phoneContact) {
        System.out.println("Meeting associated with " + phoneContact + " has been removed from the schedule.");
    }

    private static void displayErrorMessage(String phoneContact) {
        System.out.println("Error: Unable to locate any scheduled meeting for " + phoneContact);
    }


    /**
     * Prints a separator line to enhance the readability of the output.
     */
    private static void drawSeparator() {
        System.out.println("------------------------------");
    }
}
//A