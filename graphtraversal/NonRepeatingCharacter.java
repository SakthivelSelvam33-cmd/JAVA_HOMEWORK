package graphtraversal;

import java.util.Scanner;

public class NonRepeatingCharacter {

    public char nonRepeatingCharacter(String str) {

        for(int i = 0; i < str.length(); i++) {

            boolean repeat = false;

            for(int j = 0; j < str.length(); j++) {

                if(i != j && str.charAt(i) == str.charAt(j)) {

                    repeat = true;
                    break;
                }
            }

            if(!repeat) {

                return str.charAt(i);
            }
        }

        return '\0';
    }


    public static void main(String[] args) {

        NonRepeatingCharacter nrc = new NonRepeatingCharacter();

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String:");
        String str = sc.nextLine();


        char result = nrc.nonRepeatingCharacter(str);


        if(result != '\0') {

            System.out.println("First Non-Repeating Character: " + result);

        } else {

            System.out.println("No Non-Repeating Character Found");
        }


        sc.close();
    }
}