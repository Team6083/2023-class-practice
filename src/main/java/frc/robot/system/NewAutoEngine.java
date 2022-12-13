package frc.robot.system;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.component.DriveBase;

public class NewAutoEngine {
    static int currentStep = 0;
    protected static Timer timer = new Timer();
    protected static SendableChooser<String> chooser;
    protected static String autoSelected;
    protected static final String StepBack = "StepBack";
    protected static final String Test = "Test";
    protected static final String DoNothing = "DoNothing";

    public static void init() {
        chooser = new SendableChooser<String>();
        chooserSetting();
    }

    public static void start() {
        currentStep = 0;
        autoSelected = chooser.getSelected();
        timer.reset();
        timer.start();
    }

    public static void loop() {
        SmartDashboard.putNumber("AutoTimer", timer.get());
        SmartDashboard.putNumber("CurrentStep", currentStep);
        switch (autoSelected) {
            case StepBack:
                DoStepBack();
                break;
            case Test:
                DoTest();
                break;
            case DoNothing:
                DriveBase.leftMotor1.set(0);
                DriveBase.leftMotor2.set(0);
                DriveBase.rightMotor1.set(0);
                DriveBase.rightMotor2.set(0);
                break;
        }
    }

    private static void chooserSetting() {
        chooser.setDefaultOption("Do Nothing", DoNothing);
        chooser.addOption("Test", Test);
        chooser.addOption("stepback", StepBack);
        SmartDashboard.putData("Auto Choice", chooser);
    }

    public static void DoStepBack() {
        timer.start();
        double time = timer.get();
        switch (currentStep) {
            case 0:
                DriveBase.leftMotor1.set(0.3);
                DriveBase.leftMotor2.set(0.3);
                DriveBase.rightMotor1.set(-0.3);
                DriveBase.rightMotor2.set(-0.3);
                if (time >= 3) {
                    DriveBase.leftMotor1.set(0);
                    DriveBase.leftMotor2.set(0);
                    DriveBase.rightMotor1.set(0);
                    DriveBase.rightMotor2.set(0);
                    currentStep++;
                    break;
                }
        }
    }

    public static void DoTest() {
        timer.start();
        double time = timer.get();
        switch (currentStep) {
            case 0:
                if (time >= 3) {
                    DriveBase.leftMotor1.set(-0.3);
                    DriveBase.leftMotor2.set(-0.3);
                    DriveBase.rightMotor1.set(0.3);
                    DriveBase.rightMotor2.set(0.3);
                    break;
                }
        }
    }
}
