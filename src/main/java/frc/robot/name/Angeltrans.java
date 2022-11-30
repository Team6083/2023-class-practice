package frc.robot.name;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;

public class Angeltrans {
  WPI_VictorSPX spxb = new WPI_VictorSPX( 15 );
  //WPI_VictorSPX spxu = new WPI_VictorSPX( 13 );
  //CANSparkMax shoot = new CANSparkMax(21, MotorType.kBrushless);
  XboxController xbox = new XboxController( 0 );
  //ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  if (xbox.getPOV()==0){
        spxb.set(0.5);
    } else if (xbox.getPOV()==180){
        spxb.set(-0.5);
    } else {
        spxb.set(0);
    }
}
