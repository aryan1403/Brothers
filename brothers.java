import java.util.Scanner;

public class brothers {
    static Scanner sc = new Scanner(System.in);

    public static boolean checkBrothers(String n, String n2) {
        int happiness = 0;
        if (n.equalsIgnoreCase("aaryan") && n2.equalsIgnoreCase("atul")
                || n.equalsIgnoreCase("atul") && n2.equalsIgnoreCase("aaryan")) {
            System.out.println("Both are brothers  from different mother's");

            while (happiness < 100)
                happiness += 20;

            System.out.println("Happiness : " + happiness);
            System.out.println("Wanna contribute ??");
            System.out.println("1. yes");
            String choice = sc.nextLine();
            switch (choice) {
                case "yes":
                    System.out.println("Mela Bhai");
                    break;
                case "no":
                    System.out.println("No problem brother");
                    break;
                default:
                    System.out.println("Wrong choice !!");
                    break;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first name");
        String name1 = sc.nextLine();
        System.out.println("Enter the second name");
        String name2 = sc.nextLine();
        if (checkBrothers(name1, name2) != true) {
            System.out.println("LOL! try Entering Atul & Aaryan as names");
        }
    }
}
