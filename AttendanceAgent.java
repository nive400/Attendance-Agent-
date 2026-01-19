import java.util.*;

public class AttendanceAgent {

    private Map<String, List<AttendanceRecord>> attendanceMap;

    public AttendanceAgent() {
        attendanceMap = new HashMap<>();

        // Add 20 students automatically
        String[] students = {
            "Arun", "Priya", "Rahul", "Meera", "Karthik",
            "Divya", "Suresh", "Anitha", "Rohit", "Nivetha",
            "Santhosh", "Keerthi", "Vignesh", "Varsha", "Deepak",
            "Lavanya", "Harish", "Swathi", "Manoj", "Aishwarya"
        };

        for (String s : students) {
            attendanceMap.put(s, new ArrayList<>());
        }
    }

    // Mark attendance
    public void markAttendance(String student, boolean present, String date) {
        if (!attendanceMap.containsKey(student)) {
            System.out.println("Student not found!");
            return;
        }

        attendanceMap.get(student).add(new AttendanceRecord(date, present));
        System.out.println("Attendance recorded successfully!");
    }

    // Show attendance history
    public void showAttendanceHistory(String student) {
        if (!attendanceMap.containsKey(student)) {
            System.out.println("Student not found!");
            return;
        }

        List<AttendanceRecord> list = attendanceMap.get(student);

        if (list.isEmpty()) {
            System.out.println("No attendance records for: " + student);
            return;
        }

        System.out.println("\nAttendance History of " + student + ":");
        for (AttendanceRecord r : list) {
            System.out.println("- " + r);
        }
    }

    // Show leaves left (5 absences → 5 leaves used)
    public void showLeaveStatus(String student) {
        if (!attendanceMap.containsKey(student)) {
            System.out.println("Student not found!");
            return;
        }

        int absents = 0;
        for (AttendanceRecord r : attendanceMap.get(student)) {
            if (!r.isPresent()) absents++;
        }

        int remaining = 10 - absents;
        if (remaining < 0) remaining = 0;

        System.out.println("Remaining leave days for " + student + ": " + remaining);
    }

    // Show all students
    public void showStudents() {
        System.out.println("\n--- Student List ---");
        for (String s : attendanceMap.keySet()) {
            System.out.println("- " + s);
        }
    }
}
