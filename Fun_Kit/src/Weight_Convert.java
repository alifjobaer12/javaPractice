import java.util.Scanner;

public class Weight_Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double currentWeight;
        double newWeight;

        System.out.println("---------------------Weight Conversion---------------------");
        System.out.println("1. kg to lbs");
        System.out.println("2. lbs to kg");
        System.out.println("3. kg to mg");
        System.out.println("4. mg to kg");
        System.out.println("5. lbs to mg");
        System.out.println("6. mg to lbs");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        while (choice < 1 || choice > 6) {
            System.out.println("Invalid choice");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }

        switch (choice) {
            case 1:
                System.out.print("Your Current Weight in kg: ");
                currentWeight = sc.nextDouble();
                newWeight = currentWeight * 2.20642;
                System.out.printf("Your Current Weight in lbs: %.2f", newWeight);
                break;
            case 2:
                System.out.print("Your Current Weight in lbs: ");
                currentWeight = sc.nextDouble();
                newWeight = currentWeight * 0.453592;
                System.out.printf("Your Current Weight in kg: %.2f", newWeight);
                break;
            case 3:
                System.out.print("Your Current Weight in kg: ");
                currentWeight = sc.nextDouble();
                newWeight = currentWeight * 1000000;
                System.out.printf("Your Current Weight in mg: %.2f", newWeight);
                break;
            case 4:
                System.out.print("Your Current Weight in mg: ");
                currentWeight = sc.nextDouble();
                newWeight = currentWeight / 1000000;
                System.out.printf("Your Current Weight in lbs: %.2f", newWeight);
                break;
            case 5:
                System.out.print("Your Current Weight in lbs: ");
                currentWeight = sc.nextDouble();
                newWeight = currentWeight * 453592;
                System.out.printf("Your Current Weight in mg: %.2f", newWeight);
                break;
            case 6:
                System.out.print("Your Current Weight in mg: ");
                currentWeight = sc.nextDouble();
                newWeight = currentWeight * 2.2046e6;
                System.out.printf("Your Current Weight in lbs: %.2f", newWeight);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
