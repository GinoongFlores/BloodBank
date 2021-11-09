package part_two;

import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();
        BloodData bd1 = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String bloodType = sc.nextLine();
        bd.setBloodType(bloodType);

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactor = sc.nextLine();
        bd.setRhFactor(rhFactor);

        if (bloodType == "" || rhFactor == "") {
            bd1.display();
        } else {
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
        }
        sc.close();

    }
}