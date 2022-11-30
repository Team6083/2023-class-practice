package frc.robot.name;

import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Ning {
    WPI_VictorSPX suck = new WPI_VictorSPX(17);
    XboxController xbox = new XboxController(0);{
    if(xbox.getRawButton(5)){ 
        suck.set(0.5);  
      } else{
        suck.set(0); 
      }   
    }
}
