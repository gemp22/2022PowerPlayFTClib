package org.firstinspires.ftc.teamcode.command;


import java.util.function.BooleanSupplier;

/**
 * A command that does nothing but ends after a specified condition. Useful for
 * CommandGroups.
 *
 * @author Jackson
 */

public class WaitUntilCommand extends CommandBase{
    private final BooleanSupplier m_condition;

    /**
     * Creates a new WaitUntilCommand that ends after a given condition becomes true.
     *
     * @param condition the condition to determine when to end
     */
    public WaitUntilCommand(BooleanSupplier condition) {
        m_condition = condition;
    }

    @Override
    public boolean isFinished() {
        return m_condition.getAsBoolean();
    }

    @Override
    public boolean runsWhenDisabled() {
        return true;
    }

}
