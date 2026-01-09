import java.util.Scanner;

class ResultCheck {

    Scanner sc = new Scanner(System.in);
     int sub1, sub2, sub3;
     int total;
     double percentage;
	 

     void inputMarks() {
        System.out.print("Enter marks for Subject 1: ");
        sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        sub3 = sc.nextInt();
    }

    
     void calculateTotal() {
        total = sub1 + sub2 + sub3;
        System.out.println("Total Marks = " + total);
    }

    
     void calculatePercentage() {
        percentage = total / 3.0;
        System.out.println("Percentage = " + percentage + "%");
    }

    
     void displayResult() {
        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    
     void displayGrade() {
        if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    
    public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		ResultCheck rc=new ResultCheck();

        int choice;
        rc.inputMarks();   
        do {
            System.out.println(" MENU ");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    rc.calculateTotal();
                    break;

                case 2:
                    rc.calculateTotal();
                    rc.calculatePercentage();
                    break;

                case 3:
                    rc.calculateTotal();
                    rc.calculatePercentage();
                    rc.displayResult();
                    break;

                case 4:
                    rc.calculateTotal();
                    rc.calculatePercentage();
                    rc.displayGrade();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}
