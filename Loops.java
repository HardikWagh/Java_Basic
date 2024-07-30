public class ControlStructures {
    public static void main(String[] args) {
        int number = 5;

        // if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // for loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // while loop
        System.out.println("While loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }
    }
}
