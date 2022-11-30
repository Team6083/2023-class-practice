package frc.robot.name;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;

public class Weiru {
    XboxController xbox = new XboxController(0);
    WPI_VictorSPX left = new WPI_VictorSPX(16);
    WPI_VictorSPX leftt = new WPI_VictorSPX(11);
    WPI_VictorSPX right = new WPI_VictorSPX(14);
    WPI_VictorSPX rightt = new WPI_VictorSPX(22);
    
    left.set(xbox.getRawAxis(1) * -0.5);
    leftt.set(xbox.getRaAxis(5);
    rightt.set(xbox.getRawAxis(5) * 0.5);
}
