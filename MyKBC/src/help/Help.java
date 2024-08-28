package help;

public class Help {
    public void printHelpDescription() throws InterruptedException {
        for (int clr = 1; clr <= 25; clr++) {
            System.out.println("");
        }
        System.out.println("\t\t\t\t\tHELP");
        System.out.println(" Welcome to the game assistance section. Here's what you need to know:");
        System.out.println(
                " --------------------------------------------------------------------------------------");
        System.out.println(
                "|1. Solve the Fastest Finger question first. This will determine your position in the    |");
        System.out.println(
                "|   Hot Seat zone.                                                                      |");
        System.out.println(
                "|2. In the Hot Seat zone, you'll face a series of questions. Answer correctly to advance |");
        System.out.println(
                "|   to the next question.                                                               |");
        System.out.println(
                "|3. To win, answer all 15 questions correctly.                                          |");
        System.out.println(
                "|4. You have 30 seconds to answer each question. However, if you use a lifeline, the     |");
        System.out.println(
                "|   timer will pause until the lifeline is completed.                                   |");
        System.out.println(
                "|5. You have access to 4 Lifelines, each usable once. Choose wisely!                     |");
        System.out.println(
                " --------------------------------------------------------------------------------------\n");

        Thread.sleep(5000);

        System.out.println("For Checking Your Score:");
        System.out.println(
                " --------------------------------------------------------------------------------------");
        System.out.println(
                "|1. Navigate to the Menu and select the Third option.                                    |");
        System.out.println(
                "|2. Enter your name and age when prompted.                                               |");
        System.out.println(
                " --------------------------------------------------------------------------------------\n");

        Thread.sleep(5000);

        System.out.println("For Exiting the Game:");
        System.out.println(
                " --------------------------------------------------------------------------------------");
        System.out.println(
                "|1. Access the Menu and choose the fourth option.                                        |");
        System.out.println(
                "|2. The program will gracefully exit.                                                     |");
        System.out.println(
                " --------------------------------------------------------------------------------------");

        Thread.sleep(5000);
    }
}
