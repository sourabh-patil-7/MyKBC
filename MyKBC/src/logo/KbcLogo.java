package logo;

public class KbcLogo {
    public void printKbcLogo() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String purple = "\u001B[35m";
        String cyan = "\u001B[36m";
        String white = "\u001B[37m";

        // ANSI escape codes for styles
        String bold = "\033[0;1m"; // Bold
        String reset = "\u001B[0m"; // Reset color and style

        System.out.println(yellow + bold
                + "                        _______________________________________________________  " + reset);
        System.out.println(yellow + bold
                + "                      /                                                       \\ " + reset);
        System.out.println(yellow + bold + "                     |  " + red
                + "* *     * *    * ** ** ** ** *   * ** ** ** ** **" + yellow + "    | " + reset);
        System.out.println(yellow + bold + "                     |  " + red
                + "* *    * *     * ** ** ** ** *   * ** ** ** ** **" + yellow + "    | " + reset);
        System.out.println(yellow + bold + "                     |  " + green
                + "* *   * *      * *         * *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + green
                + "* *  * *       * *         * *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + blue           
                + "* * * *        * *         * *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + blue
                + "* *  *         * ** ** ** ** *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + purple
                + "* * * *        * ** ** ** ** *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + purple
                + "* *  * *       * *         * *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + cyan
                + "* *   * *      * *         * *   * *                 " + yellow + " | " + reset);
        System.out.println(yellow + bold + "                     |  " + cyan
                + "* *    * *     * ** ** ** ** *   * ** ** ** ** **" + yellow + "    | " + reset);
        System.out.println(yellow + bold + "                     |  " + white
                + "* *     * *.   * ** ** ** ** * . * ** ** ** ** **" + yellow + "    | " + reset);
        System.out.println(yellow + bold
                + "                     |_______________________________________________________| " + reset);
        System.out.println(yellow + bold
                + "                     |/_______________________________________________________/ " + reset);
    }
}
