import java.util.Scanner;

public class Student {
    // Create objects
    // Создаем объекты
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    // Конструктор: подсказка к пользователю чтобы ввести имю и фамилию
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + "" + studentID);
    }

    // Generate an ID
    // Генерировать ID
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll courses
    // Записаться на курсы
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quite): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    // View balance
    // Просмотр баланса
    public void viewBalance() {
        System.out.println("\nYour balance is: $" + tuitionBalance);
    }

    // Pay tuition
    // Платить за обучение
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.print("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    // Показать статус
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourse Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}