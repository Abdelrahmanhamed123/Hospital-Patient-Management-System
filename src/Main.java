import javax.xml.crypto.Data;
import java.sql.Time;
public class Main
{
    public static void main(String[] args)
    {
        Patient p1 = new Patient(23101421, "Tefa", 18, "+201025799528", "ADHD");
        Date d1 = new Date(12,2);
        Date.Time t1 = new Date.Time(5,30);

        Appointment appointment1 = new Appointment(50, p1, d1, t1, "schedule");
    }
}