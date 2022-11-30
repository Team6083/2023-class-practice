package frc.robot.name;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.Encoder;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
//import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
//import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Angel extends TimedRobot {
  Compressor com = new Compressor(PneumaticsModuleType.CTREPCM);
  //Joystick joy = new Joystick(0);
  DoubleSolenoid sol = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);//電磁閥
  //Encoder enc = new Encoder(0,1);
  //VictorSP vic = new VictorSP(0);
  //VictorSP tor = new VictorSP(1);
  //WPI_VictorSPX spx = new WPI_VictorSPX( 0 );
  //WPI_VictorSPX spxs = new WPI_VictorSPX( 17 );
  //WPI_VictorSPX spxl1 = new WPI_VictorSPX( 16 );
  //WPI_VictorSPX spxl2 = new WPI_VictorSPX( 11 );
  //WPI_VictorSPX spxr1 = new WPI_VictorSPX( 14 );
  //WPI_VictorSPX spxr2 = new WPI_VictorSPX( 12 );
  WPI_VictorSPX spxb = new WPI_VictorSPX( 15 );
  //WPI_VictorSPX spxu = new WPI_VictorSPX( 13 );
  //CANSparkMax shoot = new CANSparkMax(21, MotorType.kBrushless);
  XboxController xbox = new XboxController( 0 );
  //ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  //Timer timer = new Timer();
  /*protected static String autoselected = "autoselected";
  protected static final String Nothing = "Nothing";
  protected static final String Forward = "Forward";
  protected static final String Backward = "Backward";*/
  //SendableChooser<String> chooser = new SendableChooser<String>();
  //static SendableChooser<String> lazy = new SendableChooser<String>();



  @Override
  public void robotInit() {
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
      /*lazy.setDefaultOption("Nothing", Nothing);
      lazy.addOption("Forward", Forward);
      lazy.addOption("Backward", Backward);
      SmartDashboard.putData("Auto Choice", lazy);*/
  }

  @Override
  public void autonomousPeriodic() {
      /*switch (autoselected){         
          case Nothing:
          spxl1.set(0);
          spxl2.set(0);
          spxr1.set(0);
          spxr2.set(0);
          break;
          case Forward:
          spxl1.set(0.2);
          spxl2.set(0.2);
          spxr1.set(0.2);
          spxr2.set(0.2);
          break;
          case Backward:
          spxl1.set(-0.2);
          spxl2.set(-0.2);
          spxr1.set(-0.2);
          spxr2.set(-0.2);
          break;
        }*/

    }
  

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
      /*spxl1.set(-xbox.getRawAxis(1)*0.5);
      spxl2.set(-xbox.getRawAxis(1)*0.5);
      spxr1.set(xbox.getRawAxis(5)*0.5);
      spxr2.set(xbox.getRawAxis(5)*0.5);
      if (xbox.getAButton()){
          spxs.set(0.5);//A吸球
      } else if (xbox.getBButton()){
          shoot.set(0.5);//B射球
      } else if (xbox.getXButton()){
          spxu.set(0.5);//X上升機構
      } else if (xbox.getYButton()){
          spxu.set(-0.5);//Y下降機構
      } else if (xbox.getRawButton(5)){
          sol.set(Value.kForward);//LB電磁閥凸出
      } else if (xbox.getRawButton(6)){
          sol.set(Value.kReverse);//RB電磁閥收起
      } else if (xbox.getRawButton(7)){
          com.enableDigital();//汽缸開
      } else if (xbox.getRawButton(8)){
          com.disable();//汽缸關
      } else{
          spxs.set(0);
          shoot.set(0);
          spxu.set(0);
      }*/
      if (xbox.getPOV()==0){
          spxb.set(0.5);
      } else if (xbox.getPOV()==180){
          spxb.set(-0.5);
      } else {
          spxb.set(0);
      }
      //trigger 運球



    //enc.get(); 取得數職
    //enc.reset(); 重設
    //enc.setReverseDirection(ture); 轉向
  }


  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
