package creationBy;

import java.util.concurrent.TimeUnit;

public class CreatedBy {
    public void print() {
        System.out.println("\n" + "Created by:");
        printWithDelay("Sou", 500, Colors.RED);
        printWithDelay("r", 500, Colors.GREEN);
        printWithDelay("a", 500, Colors.BLUE);
        printWithDelay("b", 500, Colors.PURPLE);
        printWithDelay("h ", 500, Colors.YELLOW);
    }

    public void printWithDelay(String text, long delay, String color) {
        for (char c : text.toCharArray()) {
            System.out.print(color + c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Colors {
        public static final String RESET = "\033[0m";
        public static final String BLACK = "\033[0;30m";
        public static final String RED = "\033[0;31m";
        public static final String GREEN = "\033[0;32m";
        public static final String YELLOW = "\033[0;33m";
        public static final String BLUE = "\033[0;34m";
        public static final String PURPLE = "\033[0;35m";
        public static final String CYAN = "\033[0;36m";
        public static final String WHITE = "\033[0;37m";
        public static final String BOLD = "\033[1m";
        public static final String UNDERLINE = "\033[4m";
        public static final String REVERSED = "\033[7m";
    }
}
