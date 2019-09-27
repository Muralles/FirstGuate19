package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "prototipo0.1", group = "prueba")
public class Prototipo1 extends LinearOpMode {

    private DcMotor motor1;
    private DcMotor motor2;
    private DcMotor motor3;
    private DcMotor motor4;

    public void runOpMode(){

            motor1 = hardwareMap.get(DcMotor.class, "motor1");
            motor2 = hardwareMap.get(DcMotor.class, "motor1");
            

            motor1.setDirection(DcMotor.Direction.REVERSE);
        	motor2.setDirection(DcMotor.Direction.FORWARD);


            waitForStart();

            while(opModeIsActive()){

            	double  ejeY = gamepad1.left_stick_y;
            	double  ejeX = gamepad1.left_stick_x;

            	if (ejeY != 0){
                motor1.setPower(ejeY);
                motor2.setPower(ejey);
            }
                else if (ejeX != 0){
               	motor1.setPower(ejeX);
            }
            else {
                motor1.setPower(0);
            }
        }
    }
}    