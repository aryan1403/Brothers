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

            System.out.println(happiness);
            System.out.println("Wanna contribute ??");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes"))
                System.out.println("Mela Bhai");
            else
                System.out.println("No problem brother");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        checkBrothers("aaryan", "atul");
    }
}