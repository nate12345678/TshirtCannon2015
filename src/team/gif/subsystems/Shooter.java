package team.gif.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import team.gif.*;

/**
 *
 * @oauth Nathan
 */

public class Shooter extends Subsystem {
    
    private static final Victor angleMotor = new Victor(RobotMap.angleMotor);
    private static final Solenoid shootTop = new Solenoid(RobotMap.shootTop);
    private static final Solenoid shootBottom = new Solenoid(RobotMap.shootBottom);
    
    public void shootTop(){
        
    }
    
    public void shootBottom(){
        
    }
    
    public void changeAngle(){
    
    }
    
    public void initDefaultCommand() {
        
    }
}
