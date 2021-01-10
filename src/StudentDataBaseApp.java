import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        System.out.print("Enter number of new student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new students
        // Создаем количество новых студентов
        for (int n = 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < numberOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}