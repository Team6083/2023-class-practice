package frc.robot.name;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;

public class Williamrise {
    protected static XboxController joy = new XboxController(0);
    protected static WPI_VictorSPX rise = new WPI_VictorSPX(13);
    if (joy.getRawButton(5) == true) {
      rise.set(ControlMode.PercentOutput, 0.5);
    } else if (joy.getRawButton(6) == true) {
      rise.set(ControlMode.PercentOutput, -0.5);
    } else {
      rise.set(ControlMode.PercentOutput, 0);
    }
}
