package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "prototipo0.2", group = "prueba")
public class Prototipo2 extends LinearOpMode {

    private DcMotor motor1;
    private DcMotor motor2;
    private DcMotor motor3;
    private DcMotor motor4;

    public void runOpMode(){

            motor1 = hardwareMap.get(DcMotor.class, "motor1");
            motor2 = hardwareMap.get(DcMotor.class, "motor2");
            motor3 = hardwareMap.get(DcMotor.class, "motor3");
            motor4 = hardwareMap.get(DcMotor.class, "motor4");


          motor1.setDirection(DcMotor.Direction.REVERSE);
          motor2.setDirection(DcMotor.Direction.FORWARD);
          motor3.setDirection(DcMotor.Direction.FORWARD);
          motor4.setDirection(DcMotor.Direction.REVERSE);


            waitForStart();

            while(opModeIsActive()){
              // movD sera la variable de del movimiento hacia adelante y atras y movL sera el movimiento lateral
              double  movD = gamepad1.left_stick_y;
              double  movL = -gamepad1.left_stick_x;
                boolean l1=false;
                boolean r1=false;
                boolean l2=false;
                boolean r2=false;
                l1 = gamepad1.left_bumper;
                r1 = gamepad1.right_bumper;
                l2 = gamepad1.left_trigger;
                r2 = gamepad1.right_trigger;
              
              
          
                motor1.setPower(movD);
                motor2.setPower(movD);
            
                motor3.setPower(movL);
                motor4.setPower(movL);

                if (l1){
                  motor1.setPower(0.5);
                  motor2.setPower(-0.5);
                  motor3.setPower(-0.5);
                  motor4.setPower(0.5);

                }
                else if(r1){
                  motor1.setPower(-0.5);
                  motor2.setPower(0.5);
                  motor3.setPower(0.5);
                  motor4.setPower(-0.5);
                }
                else{
                  motor1.setPower(0);
                  motor2.setPower(0);
                  motor3.setPower(0);
                  motor4.setPower(0);
                }
                 if (l1){
                  motor1.setPower(1);
                  motor2.setPower(-1);
                  motor3.setPower(-1);
                  motor4.setPower(1);

                }
                else if(r1){
                  motor1.setPower(-1);
                  motor2.setPower(1);
                  motor3.setPower(1);
                  motor4.setPower(-1);
                }
                else{
                  motor1.setPower(0);
                  motor2.setPower(0);
                  motor3.setPower(0);
                  motor4.setPower(0);
                }
            
            }
        
    }
}    