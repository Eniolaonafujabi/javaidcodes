package tdd;
public class Bike {
    private int milesPerHour;
    private String Gear;

    public void deceleration(int decreaseSpeed) {
        if (decreaseSpeed < milesPerHour&&decreaseSpeed>0)this.milesPerHour -= decreaseSpeed;
    }

    public boolean OnAndOffBike(String input) {
        return input.equalsIgnoreCase("on");
    }

    public int checkCurrentSpeedMilesPerHour() {
        return this.milesPerHour;
    }

    public void acceleration(int increaseOfSpeed) {
        milesPerHour += increaseOfSpeed;
    }
    public void changeGear(int milesPerHour){
        if(milesPerHour>=0&&milesPerHour<=20)
            this.Gear = "Gear 1";
        if(milesPerHour>=21&&milesPerHour<=30)
            this.Gear = "Gear 2";
        if(milesPerHour>=31&&milesPerHour<=40)
            this.Gear = "Gear 3";
        if(milesPerHour>=41)
            this.Gear = "Gear 4";
    }

    public String CheckGear() {
        return this.Gear;
    }
}
