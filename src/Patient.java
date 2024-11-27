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
    
}