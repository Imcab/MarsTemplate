package frc.robot.configuration;

import mars.source.builder.Environment;
import mars.source.builder.RunMode;

public class Manifest {

    public static final RunMode CURRENT_MODE = RunMode.REAL;

    static{
        Environment.setMode(CURRENT_MODE);
    }
}
