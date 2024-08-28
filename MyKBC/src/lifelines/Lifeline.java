package lifelines;
import java.util.*;

public class Lifeline {
    public void lifeline(int quesno, int ap, int ph, int ff, int fq) {
        Scanner m = new Scanner(System.in);
        if (quesno == 1) {
            try {
                System.out.print("------------------------------------------------------");
                System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
                System.out.println("------------------------------------------------------");
                System.out.println("1.Audience poll \t\t2.Phone a friend");
                System.out.println("3.Fifty fifty   \t\t4.Flip The question");
                System.out.println("5.Power paplu   \t\t6.Ask an expert");
                System.out.println("7.Double Dip");
                for (int space = 1; space <= 23; space++) {
                    System.out.println("");
                }
                int lifeline = m.nextInt();
                System.out.println();
                System.out.println();
                if (lifeline == 1) {
                    try {
                        ap = ap + 1;
                        if (ap == 1) {
                            System.out.print("Audience are voting");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".\n\n\n\n\n");
                            System.out.println("          Audience Rating");
                            System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                            System.out.println(" |-|     A     B    C   D     |-|");
                            System.out.println(" |-|                          |-|");
                            System.out.println(" |-|                          |-|");
                            System.out.println(" |-|                          |-|");
                            System.out.println(" |-|     __                   |-|");
                            System.out.println(" |-|    |  |                  |-|");
                            System.out.println(" |-|    |  |                  |-|");
                            System.out.println(" |-|    |  |                  |-|");
                            System.out.println(" |-|    |  |  __              |-|");
                            System.out.println(" |-|    |60| |20|  __   __    |-|");
                            System.out.println(" |-|    |  |_|  |_|10|_|10|   |-|");
                            System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
                            System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                            for (int move = 1; move <= 16; move++) {
                                System.out.println();
                            }
                        } else {
                            System.out.println("you have used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } catch (InterruptedException exc) {
                        System.out.println("sleep\\wait is not working");
                    }

                }

                else if (lifeline == 2) {
                    for (int space = 1; space <= 25; space++) {
                        System.out.println("");
                    }
                    ph = ph + 1;
                    if (ph == 1) {
                        System.out.println("Choose any friend to call for help");
                        System.out.println(" _________        _________         _________       _________ ");
                        System.out.println("|         |      |         |       |         |     |         |");
                        System.out.println("| RAM     |      |  RAHIM  |       |  RAJAN  |     |  ROHIT  |");
                        System.out.println("|_________|      |_________|       |_________|     |_________|");

                        System.out.println("Enter any one name for calling");

                        for (int space = 1; space <= 24; space++) {
                            System.out.println("");
                        }
                        String call = m.next();
                        switch (call) {

                            case "Ram":
                            case "RAM":
                            case "ram":
                            case "Rahim":
                            case "rahim":
                            case "RAHIM":
                            case "Rajan":
                            case "rajan":
                            case "RAJAN":
                            case "Rohit":
                            case "rohit":
                            case "ROHIT":

                                System.out.print("Call is Diverting to " + call);

                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.println(".");
                                System.out.println("Hello");
                                String as = m.next();

                                System.out.println("Hi !! give me your question");
                                String a = m.next();
                                System.out.println("give me option");
                                String asa = m.next();
                                System.out.println("I think A is True");
                                break;

                        }

                    } else {
                        System.out.println("You have already used this lifeline");
                        lifeline(1, ap, ph, ff, fq);
                    }
                } else if (lifeline == 3) {
                    for (int move = 1; move <= 30; move++) {
                        System.out.println("");
                    }
                    ff = ff + 1;
                    if (ff == 1) {
                        System.out.println("Fifty fifty");
                        System.out.println("You Answer may be :-");
                        System.out.println("A.     ");
                        System.out.println("\t\tC.");
                        for (int move = 1; move <= 27; move++) {
                            System.out.println("");
                        }
                    } else {
                        System.out.println("You have already used this lifeline");
                        lifeline(1, ap, ph, ff, fq);
                    }
                } else if (lifeline == 4) {
                    fq = fq + 1;
                    if (fq == 1) {
                        System.out.println("Flip the Question");
                        System.out.println("According to the Mahabharata, who made Gandiva, the famous bow of Arjuna?");
                        System.out.println("(A) Brahma                            (B) Indra ");
                        System.out.println("(C) Chandra                           (D) Prajapati");
                        for (int clr = 1; clr <= 25; clr++) {
                            System.out.println("");
                        }

                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                    } else {
                        System.out.println("you have already used this lifeline");
                        lifeline(1, ap, ph, ff, fq);
                    }
                }

            } catch (InterruptedException exc) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
            }

        }
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        else if (quesno == 2) {
            {
                try {
                    System.out.print("------------------------------------------------------");
                    System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
                    System.out.println("------------------------------------------------------");
                    System.out.println("1.Audience poll \t\t2.Phone a friend");
                    System.out.println("3.Fifty fifty   \t\t4.Flip The question");
                    System.out.println("5.Power paplu   \t\t6.Ask an expert");
                    System.out.println("7.Double Dip");
                    for (int space = 1; space <= 23; space++) {
                        System.out.println("");
                    }
                    int lifeline = m.nextInt();
                    System.out.println();
                    System.out.println();
                    if (lifeline == 1) {
                        try {
                            ap = ap + 1;
                            if (ap == 1) {
                                System.out.print("Audience are voting");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".\n\n\n\n\n");
                                System.out.println("          Audience Rating");
                                System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                                System.out.println(" |-|     A     B    C   D     |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|          __              |-|");
                                System.out.println(" |-|         |  |             |-|");
                                System.out.println(" |-|         |  |             |-|");
                                System.out.println(" |-|         |  |             |-|");
                                System.out.println(" |-|         |  |             |-|");
                                System.out.println(" |-|         |  |             |-|");
                                System.out.println(" |-|     __  |80|  __   __    |-|");
                                System.out.println(" |-|    |10|_|  |_|10|_|10|   |-|");
                                System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
                                System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                                for (int move = 1; move <= 16; move++) {
                                    System.out.println();
                                }
                            } else {
                                System.out.println("you have used this lifeline");
                                lifeline(1, ap, ph, ff, fq);
                            }

                        } catch (InterruptedException exc) {

                        }

                    }

                    else if (lifeline == 2) {
                        for (int space = 1; space <= 25; space++) {
                            System.out.println("");
                        }
                        ph = ph + 1;
                        if (ph == 1) {
                            System.out.println("Choose any friend to call for help");
                            System.out.println(" _________        _________         _________       _________ ");
                            System.out.println("|         |      |         |       |         |     |         |");
                            System.out.println("| RAM     |      |  RAHIM  |       |  RAJAN  |     |  ROHIT  |");
                            System.out.println("|_________|      |_________|       |_________|     |_________|");

                            System.out.println("Enter any one name for calling");

                            for (int space = 1; space <= 24; space++) {
                                System.out.println("");
                            }
                            String call = m.next();
                            switch (call) {

                                case "Ram":
                                case "RAM":
                                case "ram":
                                case "Rahim":
                                case "rahim":
                                case "RAHIM":
                                case "Rajan":
                                case "rajan":
                                case "RAJAN":
                                case "Rohit":
                                case "rohit":
                                case "ROHIT":

                                    System.out.print("Call is Diverting to " + call);

                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.println(".");
                                    System.out.println("Hello");
                                    String as = m.next();

                                    System.out.println("Hi !! Tell me your question");
                                    String a = m.next();
                                    System.out.println("give me option");
                                    String asa = m.next();
                                    System.out.println("I think B is True");
                                    break;

                            }

                        } else {
                            System.out.println("You have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else if (lifeline == 3) {
                        for (int move = 1; move <= 30; move++) {
                            System.out.println("");
                        }
                        ff = ff + 1;
                        if (ff == 1) {
                            System.out.println("Fifty fifty");
                            System.out.println("You Answer may be :-");
                            System.out.println("\t\tB.");
                            System.out.println("C.");
                            for (int move = 1; move <= 27; move++) {
                                System.out.println("");
                            }
                        } else {
                            System.out.println("You have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else if (lifeline == 4) {
                        fq = fq + 1;
                        if (fq == 1) {
                            System.out.println("Flip the Question");
                            System.out.println("In Cricket, “round the wicket” and “over the wicket” represent what ?");
                            System.out.println("(A) Wicket-keeping                    (B) Bowling ");
                            System.out.println("(C) Batting                           (D) Commentary");
                            for (int clr = 1; clr <= 25; clr++) {
                                System.out.println("");
                            }

                            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                        } else {
                            System.out.println("you have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    }

                    else {
                        System.out.println("you have enter wrong choice");
                        lifeline(1, ap, ph, ff, fq);
                    }

                } catch (InterruptedException exc) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
                }

            }
        }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        else if (quesno == 3) {
            {
                try {
                    System.out.print("------------------------------------------------------");
                    System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
                    System.out.println("------------------------------------------------------");
                    System.out.println("1.Audience poll \t\t2.Phone a friend");
                    System.out.println("3.Fifty fifty   \t\t4.Flip The question");
                    System.out.println("5.Power paplu   \t\t6.Ask an expert");
                    System.out.println("7.Double Dip");
                    for (int space = 1; space <= 23; space++) {
                        System.out.println("");
                    }
                    int lifeline = m.nextInt();
                    System.out.println();
                    System.out.println();
                    if (lifeline == 1) {
                        try {
                            ap = ap + 1;
                            if (ap == 1) {
                                System.out.print("Audience are voting");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".\n\n\n\n\n");
                                System.out.println("          Audience Rating");
                                System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                                System.out.println(" |-|     A     B    C   D     |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|               __         |-|");
                                System.out.println(" |-|     __       |  |        |-|");
                                System.out.println(" |-|    |  |  __  |  |        |-|");
                                System.out.println(" |-|    |30| |20| |  |  __    |-|");
                                System.out.println(" |-|    |  |_|  |_|40|_|10|   |-|");
                                System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
                                System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                                for (int move = 1; move <= 15; move++) {
                                    System.out.println();
                                }
                            } else {
                                System.out.println("you have used this lifeline");
                                lifeline(1, ap, ph, ff, fq);
                            }

                        } catch (InterruptedException exc) {

                        }

                    }

                    else if (lifeline == 2) {
                        for (int space = 1; space <= 25; space++) {
                            System.out.println("");
                        }
                        ph = ph + 1;
                        if (ph == 1) {
                            System.out.println("Choose any friend to call for help");
                            System.out.println(" _________        _________         _________       _________ ");
                            System.out.println("|         |      |         |       |         |     |         |");
                            System.out.println("| RAM     |      |  RAHIM  |       |  RAJAN  |     |  ROHIT  |");
                            System.out.println("|_________|      |_________|       |_________|     |_________|");

                            System.out.println("Enter any one name for calling");

                            for (int space = 1; space <= 24; space++) {
                                System.out.println("");
                            }
                            String call = m.next();
                            switch (call) {

                                case "Ram":
                                case "RAM":
                                case "ram":
                                case "Rahim":
                                case "rahim":
                                case "RAHIM":
                                case "Rajan":
                                case "rajan":
                                case "RAJAN":
                                case "Rohit":
                                case "rohit":
                                case "ROHIT":

                                    System.out.print("Call is Diverting to " + call);

                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.println(".");
                                    System.out.println("Hello");
                                    String as = m.next();

                                    System.out.println("Hi !! Tell me your question");
                                    String a = m.next();
                                    System.out.println("give me option");
                                    String asa = m.next();
                                    System.out.println("I think C is True");
                                    break;

                            }

                        } else {
                            System.out.println("You have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else if (lifeline == 3) {
                        for (int move = 1; move <= 30; move++) {
                            System.out.println("");
                        }
                        ff = ff + 1;
                        if (ff == 1) {
                            System.out.println("Fifty fifty");
                            System.out.println("You Answer may be :-");
                            System.out.println("\t\tB.     ");
                            System.out.println("C.");
                            for (int move = 1; move <= 26; move++) {
                                System.out.println();
                            }
                        } else {
                            System.out.println("You have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else if (lifeline == 4) {
                        fq = fq + 1;
                        if (fq == 1) {
                            System.out.println("Flip the Question");
                            System.out.println("Which of these Indian cricketers made his Test Debut in 2012?");
                            System.out.println("(A) Abhinav Mukund                    (B) Ajankia Rahane ");
                            System.out.println("(C) Ravindra Jadeja                   (D) Rohit Sharma");
                            for (int clr = 1; clr <= 25; clr++) {
                                System.out.println("");
                            }

                            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                        } else {
                            System.out.println("you have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else {
                        System.out.println("you have enter wrong choice");
                        lifeline(1, ap, ph, ff, fq);
                    }

                } catch (InterruptedException exc) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
                }

            }
        } else {
            {
                try {
                    System.out.print("------------------------------------------------------");
                    System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
                    System.out.println("------------------------------------------------------");
                    System.out.println("1.Audience poll \t\t2.Phone a friend");
                    System.out.println("3.Fifty fifty   \t\t4.Flip The question");
                    System.out.println("5.Power paplu   \t\t6.Ask an expert");
                    System.out.println("7.Double Dip");
                    for (int space = 1; space <= 23; space++) {
                        System.out.println("");
                    }
                    int lifeline = m.nextInt();
                    System.out.println();
                    System.out.println();
                    if (lifeline == 1) {
                        try {
                            ap = ap + 1;
                            if (ap == 1) {
                                System.out.print("Audience are voting");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".");
                                Thread.sleep(1000);
                                System.out.print(".\n\n\n\n\n");
                                System.out.println("          Audience Rating");
                                System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                                System.out.println(" |-|     A     B    C   D     |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                          |-|");
                                System.out.println(" |-|                    __    |-|");
                                System.out.println(" |-|                   |  |   |-|");
                                System.out.println(" |-|                   |  |   |-|");
                                System.out.println(" |-|                   |  |   |-|");
                                System.out.println(" |-|          __       |  |   |-|");
                                System.out.println(" |-|     __  |20|  __  |  |   |-|");
                                System.out.println(" |-|    |10|_|  |_|10|_|60|   |-|");
                                System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
                                System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");
                                for (int move = 1; move <= 16; move++) {
                                    System.out.println();
                                }
                            } else {
                                System.out.println("you have used this lifeline");
                                lifeline(1, ap, ph, ff, fq);
                            }

                        } catch (InterruptedException exc) {

                        }

                    }

                    else if (lifeline == 2) {
                        for (int space = 1; space <= 25; space++) {
                            System.out.println("");
                        }
                        ph = ph + 1;
                        if (ph == 1) {
                            System.out.println("Choose any friend to call for help");
                            System.out.println(" _________        _________         _________       _________ ");
                            System.out.println("|         |      |         |       |         |     |         |");
                            System.out.println("| RAM     |      |  RAHIM  |       |  RAJAN  |     |  ROHIT  |");
                            System.out.println("|_________|      |_________|       |_________|     |_________|");
                            System.out.println("Enter any one name for calling");

                            for (int space = 1; space <= 24; space++) {
                                System.out.println("");
                            }
                            String call = m.next();
                            switch (call) {

                                case "Ram":
                                case "RAM":
                                case "ram":
                                case "Rahim":
                                case "rahim":
                                case "RAHIM":
                                case "Rajan":
                                case "rajan":
                                case "RAJAN":
                                case "Rohit":
                                case "rohit":
                                case "ROHIT":

                                    System.out.print("Call is Diverting to " + call);

                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.println(".");
                                    System.out.println("Hello");
                                    String as = m.next();

                                    System.out.println("Enter your question");
                                    String a = m.next();
                                    System.out.println("give me option");
                                    String asa = m.next();
                                    System.out.println("I think D is True");
                                    break;

                            }

                        } else {
                            System.out.println("You have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else if (lifeline == 3) {
                        for (int move = 1; move <= 30; move++) {
                            System.out.println("");
                        }
                        ff = ff + 1;
                        if (ff == 1) {
                            System.out.println("Fifty fifty");
                            System.out.println("You Answer may be :-");
                            System.out.println("A.     ");
                            System.out.println("\t\tC.");
                            for (int move = 1; move <= 27; move++) {
                                System.out.println("");
                            }
                        } else {
                            System.out.println("You have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else if (lifeline == 4) {
                        fq = fq + 1;
                        if (fq == 1) {
                            System.out.println("Flip the Question");
                            System.out.println(
                                    "Which of the only planet of our Solar System that rotates in a clockwise direction around its own axis?");
                            System.out.println("(A) Earth                             (B) Jupiter ");
                            System.out.println("(C) Mars                              (D) Venus");
                            for (int clr = 1; clr <= 25; clr++) {
                                System.out.println("");
                            }

                            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                        } else {
                            System.out.println("you have already used this lifeline");
                            lifeline(1, ap, ph, ff, fq);
                        }
                    } else {
                        System.out.println("you have enter wrong choice");
                        lifeline(1, ap, ph, ff, fq);
                    }

                } catch (InterruptedException exc) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
                }

            }

        }

    }
    
}
