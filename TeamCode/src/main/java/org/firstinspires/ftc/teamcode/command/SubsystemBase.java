package org.firstinspires.ftc.teamcode.command;

public abstract class SubsystemBase implements Subsystem {
    /**
     * A base for subsystems and provides a more intuitive
     * method for setting the default command.
     *
     * @author Jackson
     */

    protected String m_name = this.getClass().getSimpleName();

    public SubsystemBase() {
        CommandScheduler.getInstance().registerSubsystem(this);
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public String getSubsystem() {
        return getName();
    }

    public void setSubsystem(String subsystem) {
        setName(subsystem);
    }
}
