import javax.swing.JOptionPane;

public class ProgramCar {

    public static void main(String[] args) {

        // Object.
        Car myCar = new Car (2013, "Lexus");

        // Ask for vehicle speed.
        int speed = myCar.getSpeed();
        speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Speed" ));

        // Acceleration.
        for (int i = 0; i < 5; i++) {
            System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                    " " + "is going " );
            myCar.AccelerateSpeed(speed + i);
            System.out.println("Your Speed now is: " + (speed + i));
        }

        // Braking.
        speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Speed" ));
        for (int i = 0; i < 5; i++) {
            System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                    " " + "is going " );
            myCar.BrakeSpeed(speed + i);
            System.out.println("Your Speed now is: " + (speed - i));
        }
    }
}
