package frc.robot.name;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Lisa {
    CANSparkMax spark1 = new CANSparkMax(21, MotorType.kBrushless);
    if(xbox.getYButton()){
        spark1.set(0.3);
      }else{
        spark1.set(0);
      }
      abcd
}
