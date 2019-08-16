// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc8000.Droids2020;

import org.usfirst.frc8000.Droids2020.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc8000.Droids2020.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton gyroMove;
    public JoystickButton liftUpButton;
    public JoystickButton liftDownButton;
    public JoystickButton intakeOpenButton;
    public JoystickButton intakeCloseButton;
    public Joystick joystick1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick1 = new Joystick(0);
        
        intakeCloseButton = new JoystickButton(joystick1, 2);
        intakeCloseButton.whileHeld(new IntakeClose());
        intakeOpenButton = new JoystickButton(joystick1, 3);
        intakeOpenButton.whileHeld(new IntakeOpen());
        liftDownButton = new JoystickButton(joystick1, 1);
        liftDownButton.whileHeld(new LiftDown());
        liftUpButton = new JoystickButton(joystick1, 4);
        liftUpButton.whileHeld(new LiftUp());
        gyroMove = new JoystickButton(joystick1, 6);
        gyroMove.whileHeld(new GyroMoveStraight());


        // SmartDashboard Buttons
        SmartDashboard.putData("MoveForward", new MoveForward());
        SmartDashboard.putData("MoveOff", new MoveOff());
        SmartDashboard.putData("JoystickControl", new JoystickControl());
        SmartDashboard.putData("GyroMoveStraight", new GyroMoveStraight());
        SmartDashboard.putData("PathPlanner", new PathPlanner());
        SmartDashboard.putData("GoToTarget", new GoToTarget());
        SmartDashboard.putData("LiftUp", new LiftUp());
        SmartDashboard.putData("LiftDown", new LiftDown());
        SmartDashboard.putData("IntakeOpen", new IntakeOpen());
        SmartDashboard.putData("IntakeClose", new IntakeClose());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

