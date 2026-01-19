import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AttendanceAgent agent = new AttendanceAgent();

        while (true) {
            System.out.println("\n===== Attendance System =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Show Attendance History");
            System.out.println("3. Show Leave Status");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    agent.showStudents();
                    System.out.print("Enter student name: ");
                    String stu = sc.nextLine();
                    System.out.print("Present? (true/false): ");
                    boolean pr = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    agent.markAttendance(stu, pr, date);
                    break;

                case 2:
                    agent.showStudents();
                    System.out.print("Enter student name: ");
                    agent.showAttendanceHistory(sc.nextLine());
                    break;

                case 3:
                    agent.showStudents();
                    System.out.print("Enter student name: ");
                    agent.showLeaveStatus(sc.nextLine());
                    break;

                case 4:
                    agent.showStudents();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
