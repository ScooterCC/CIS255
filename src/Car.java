public class Car {

    // Variables.
    private int yearModel, speed;
    private String make;

    // The constructor accept the car's year model and make as argument
    // The constructor assigns 0 to the speed field
    public Car (int yearModel, String carMake) {
        this.yearModel = yearModel;
        make = carMake;
        speed = 0;
    }

    // Setters and Getters.
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
    public void setMake (String carMake) {
        make = carMake;
    }
    public void setSpeed(int carSpeed) {
        speed = carSpeed;
    }
    public int getYearModel() {
        return yearModel;
    }
    public String getMake () {
        return make;
    }
    public int getSpeed () {
        return speed;
    }
    public void AccelerateSpeed (int speed) {
        this.speed = speed + 5;
    }
    public void BrakeSpeed (int speed) {
        this.speed = speed - 5;
    }
}