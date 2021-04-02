import java.util.Random;

public class Dice {

    public static class Roll {
        static int dieValue1;
        static int dieValue2;

        public static void main(String[] args) {
            roll();
            int dieValue1 = roll_1();
            int dieValue2 = roll_2();

            // Declare a variable for the sum of the dice values (and add the dice values to
            // get that sum).
            int diceSum = dieValue1;
            int dicesum2 = dieValue2;

            // Determine if the user won or not.
            if (diceSum > dicesum2)
                System.out.println("Player 1 goes 1st");
            else if (diceSum < dicesum2)
                System.out.println("Player 2 goes 1st");
            System.exit(0);

        }

        // roll() method header that rolls the die (creates a Die object and gets a random value for the object).
        public static void roll() {
            // Create a Random class object.
            Random dieRoll = new Random();

            // Get a random integer value for the dice between 1 and 6.
            dieValue1 = dieRoll.nextInt(6) + 1;
            dieValue2 = dieRoll.nextInt(6) + 1;
        }

        // method that returns the value of die1.
        public static int roll_1() {
            return dieValue1;
        }

        // method that returns the value of die2.
        public static int roll_2() {
            return dieValue2;
        }



        // method that returns the sum of the values of die1, die2;
        public static int sum() {
            return dieValue1 + dieValue2;
        }
    }
}
