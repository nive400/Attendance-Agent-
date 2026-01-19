public class AttendanceRecord {
    private String date;
    private boolean present;

    public AttendanceRecord(String date, boolean present) {
        this.date = date;
        this.present = present;
    }

    public String getDate() { return date; }
    public boolean isPresent() { return present; }

    @Override
    public String toString() {
        return date + " → " + (present ? "Present" : "Absent");
    }
}
