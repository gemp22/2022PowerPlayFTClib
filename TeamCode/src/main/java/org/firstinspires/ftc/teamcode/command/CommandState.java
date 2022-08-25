package org.firstinspires.ftc.teamcode.command;

/**
 * Class that holds scheduling state for a command.  Used internally by the
 * {@link CommandScheduler}.
 *
 * <p>
 * <i>Has been <u>grossly</u> oversimplified compared to that of WPILib</i>
 * </p>
 *
 * @author Jackson
 */


class CommandState {


        // Whether or not it is interruptible.
        private final boolean m_interruptible;


        CommandState(boolean interruptible) {
            m_interruptible = interruptible;
        }

        boolean isInterruptible() {
            return m_interruptible;
        }

}

