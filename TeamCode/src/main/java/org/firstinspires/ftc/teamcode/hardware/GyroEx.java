package org.firstinspires.ftc.teamcode.hardware;

//import com.arcrobotics.ftclib.geometry.Rotation2d;

import org.firstinspires.ftc.teamcode.geometery.Rotation2d;

public abstract class GyroEx implements HardwareDevice {


    public abstract void init();

    // Gyro
    public abstract double getHeading();

    public abstract double getAbsoluteHeading();

    public abstract double[] getAngles();

    public abstract Rotation2d getRotation2d();

    public abstract void reset();

}

