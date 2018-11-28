package org.firstinspires.ftc.teamcode.santaclaus.hooves;

import com.qualcomm.robotcore.hardware.Servo;

public class Mouth {

    private static final double FOLD_POSITION = 0.1;
    private static final double RELEASE_POSITION = 0.2;
    private static final double GRAB_POSITION = 0.5;

    private Servo grabServo;

    public Mouth(Servo grabServo) {
        this.grabServo = grabServo;
    }

    public void grab() {
        grabServo.setPosition(GRAB_POSITION);
    }

    public void release() {
        grabServo.setPosition(RELEASE_POSITION);
    }

    public void foldUp() {
        grabServo.setPosition(FOLD_POSITION);
    }

    public Servo getGrabServo() {
        return grabServo;
    }
}
