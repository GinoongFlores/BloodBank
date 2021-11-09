package part_two;

public class BloodData {
    private String bloodType = "O, A, B, AB";
    private String rhFactor = "+,-";

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }


    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor; 
    }

    public String getBloodType() {
        return bloodType;
    }
    
    public String getRhFactor() {
        return rhFactor;
    }


}
