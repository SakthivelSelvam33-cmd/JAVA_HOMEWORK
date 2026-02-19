
package innerclass;

import java.util.Scanner;


public class Institution 
{
    String institutionName = "ABC Institution";
    Student student;   

   
    class Student {

        private String studentName;
        private int rollNo;
        private int[] marks;
        private double average;
        private String grade;

        void addStudent(String name, int roll, int subjectCount) 
        {
            this.studentName = name;
            this.rollNo = roll;
            marks = new int[subjectCount]; 
        }

        void addMarks(Scanner sc) 
        {
            if (marks == null) {
                System.out.println("Please add student first!");
                return;
            }

            System.out.println("Enter Marks:");
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
        }

        void calculateGrade() 
        {
            if (marks == null) 
            {
                System.out.println("No marks available!");
                return;
            }

            int sum = 0;
            for (int m : marks) 
            {
                sum += m;
            }

            average = (double) sum / marks.length;

            if (average >= 90)
                grade = "A";
            else if (average >= 75)
                grade = "B";
            else if (average >= 50)
                grade = "C";
            else
                grade = "Fail";
        }

        void display() 
        {
            System.out.println("Institution Name: " + institutionName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll No: " + rollNo);

            System.out.print("Marks: ");
            for (int m : marks) {
                System.out.print(m + " ");
            }

            System.out.printf("Average: %.2f", average);
            System.out.println("Grade: " + grade);
        }
    }
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Institution inst = new Institution();
        Institution.Student stu = inst.new Student();

        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Number of Subjects: ");
                    int subjects = sc.nextInt();

                    stu.addStudent(name, roll, subjects);
                    break;

                case 2:
                    stu.addMarks(sc);
                    break;

                case 3:
                    stu.calculateGrade();
                    break;

                case 4:
                    stu.display();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
}
}
}
    