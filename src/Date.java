public class Date
{
    private int month;
    private int day;

    public Date(int month, int day)
    {
        this.month = month;
        this.day = day;
    }

    public static class Time
    {
        private int hour;
        private int minute;
        public Time(int hour, int minute)
        {
            this.hour = hour;
            this.minute = minute;
        }
    }
}
