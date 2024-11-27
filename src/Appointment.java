public class Appointment
{
    private int appointmentID;
    private String status;
    private Patient patient;
    private Date date;
    private Date.Time time;

    public Appointment(int appointmentID, Patient patient, Date date, Date.Time time, String status)
    {
        this.appointmentID = appointmentID;
        this.status = status;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }
    public int getAppointmentID() {
        return appointmentID;
    }
    public Date getDate() {
        return date;
    }
    public Patient getPatient() {
        return patient;
    }public String getStatus() {
        return status;}
    public Date.Time getTime() {
            return time;
        }


}
