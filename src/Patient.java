import java.util.ArrayList;
import java.util.List;

public class Patient 
{
    private String patientID;
    private String name;
    private int age;
    private String contactInfo;
    private String medicalHistory;
    private List<Appointment> visitRecords; 

    public Patient(String patientID, String name, int age, String contactInfo, String medicalHistory) 
    {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.medicalHistory = medicalHistory;
        this.visitRecords = new ArrayList<>(); 
    }
    public String getPatientID() {
        return patientID;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public int getAge() {
        return age;
    }
    public String getMedicalHistory() {
        return medicalHistory;
    }
    public String getName() {
        return name;
    }
    public List<Appointment> getVisitRecords() {
        return visitRecords;
    }
    public void updateContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
       System.out.println(" contact updated ");
    }
    public void addvisits( Appointment visit){
        this.visitRecords.add(visit);
        System.out.println("visit is added for   "+name +" :"+visit.getAppointmentID());
    }
    public void displayPatientInfo() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Medical History: " + medicalHistory);
    
        if (visitRecords.isEmpty()) {
            System.out.println("No visits recorded.");
        } else {
            System.out.println("Visit Records:");
            for (Appointment appointment : visitRecords) {
                System.out.println("    Appointment ID: " + appointment.getAppointmentID() +
                                   ", Date: " + appointment.getDate() +
                                   ", Time: " + appointment.getTime() +
                                   ", Status: " + appointment.getStatus());
            }
        }
    }
}    
