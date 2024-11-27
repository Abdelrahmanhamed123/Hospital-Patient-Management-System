public class Appointment
{
    private int appointmentID;
    private String status;

    public Appointment(int appointmentID, Patient patient, Date date, Date.Time time, String status)
    {
        this.appointmentID = appointmentID;
        this.status = status;
    }
}
