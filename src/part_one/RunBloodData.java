package part_one;
import java.util.Scanner;


public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bloodType = sc.nextLine();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactor = sc.nextLine();

        if (bloodType == "" || rhFactor == "") {
            BloodData bd = new BloodData();
            bd.display();

        } else {
            BloodData bd = new BloodData(bloodType, rhFactor);
            bd.display();
        }
        sc.close();
    }
}