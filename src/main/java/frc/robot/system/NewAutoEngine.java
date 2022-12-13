package frc.robot.system;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.component.DriveBase;

public class NewAutoEngine {
    //Define somethings
    static int currentStep = 0;// Declare variable currentstep and set the value.
    protected static Timer timer = new Timer();// define timer
    protected static SendableChooser<String> chooser;// define chooser
    protected static String autoSelected;// The variable that we want to judge.
    protected static final String StepBack = "StepBack";// Option and what will return to autoSelected when you choose StepBack.
    protected static final String Test = "Test";//  Option what will return to autoSelected when you choose Test.
    protected static final String DoNothing = "DoNothing";//  Option what will return to autoSelected when you choose DoNothing.

    // Run at robotInit()
    public static void init() {
        chooser = new SendableChooser<String>();// define chooser
        chooserSetting();// Call the function chooserSetting.
    }

    // Run at autonomousInit()
    public static void start() {
        currentStep = 0;
        autoSelected = chooser.getSelected();
        timer.reset();
        timer.start();
    }

    // Run at autonomousPeriodic() 
    public static void loop() {
        SmartDashboard.putNumber("AutoTimer", timer.get());//Display the value of the timer.
        SmartDashboard.putNumber("CurrentStep", currentStep);// Display the value of current step.

        // Judge which path you choose and what to do
        switch (autoSelected) {
            case StepBack:
                DoStepBack();// We use functions to write what it does.
                break;// break is very important
            case Test:// Another case(option)
                DoTest();
                break;
            case DoNothing:// Our DefaultOption
                DriveBase.leftMotor1.set(0);
                DriveBase.leftMotor2.set(0);
                DriveBase.rightMotor1.set(0);
                DriveBase.rightMotor2.set(0);
                break;
        }
    }

    // add options
    private static void chooserSetting() {
        chooser.setDefaultOption("Do Nothing", DoNothing);// The name of the option and the option. 
                                                         //DefaultOption : The option to run when nothing is chose.
        chooser.addOption("Test", Test);// The name of the option and the option.
        chooser.addOption("stepback", StepBack);// The name of the option and the option.
        SmartDashboard.putData("Auto Choice", chooser);// Put chooser on the SmartDashboard.
    }

    // What will do when you choose StepBack.
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
                    break;// break is very important
                }
            case 1:
            if(time>3&&time<=5){
                DriveBase.leftMotor1.set(-0.3);
                    DriveBase.leftMotor2.set(-0.3);
                    DriveBase.rightMotor1.set(0.3);
                    DriveBase.rightMotor2.set(0.3);
                    break;
            }
        }
    }

    // What will do when you choose Test.
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
