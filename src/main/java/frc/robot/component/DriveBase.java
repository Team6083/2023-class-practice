
package frc.robot.component;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class DriveBase {

    // port
    private static final int Lm1 = 16;// motorControler ID
    private static final int Lm2 = 11;
    private static final int Rm1 = 14;
    private static final int Rm2 = 12;

    // basis drivebase
    public static WPI_VictorSPX leftMotor1;// define motor
    public static WPI_VictorSPX leftMotor2;
    public static WPI_VictorSPX rightMotor1;
    public static WPI_VictorSPX rightMotor2;

    public static void init() {
        leftMotor1 = new WPI_VictorSPX(Lm1);// add ID into MotorControler
        leftMotor2 = new WPI_VictorSPX(Lm2);
        rightMotor1 = new WPI_VictorSPX(Rm1);
        rightMotor2 = new WPI_VictorSPX(Rm2);
    }
}
