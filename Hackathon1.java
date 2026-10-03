import java.util.Scanner;
public class Hackathon1 {
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vehicle Number:");
        int vehicleNumber = sc.nextInt();
        System.out.println("Enter Waste Collected (kg):");
        double wasteCollected = sc.nextDouble();
        System.out.println("Enter Number of Collection Points:");
        int collectionPoints = sc.nextInt();
        System.out.println("Enter Vehicle Status:");
        char vehicleStatus = sc.next().charAt(0);
        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println("\n---Waste Collection Status ---");
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println("\nEnter Waste Collected at Point 1 (kg):");
        double point1Waste = sc.nextDouble();
        System.out.println("Enter Waste Collected at Point 2 (kg):");
        double point2Waste = sc.nextDouble();
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected: " + totalWaste + " kg");
        sc.close();
    }
}