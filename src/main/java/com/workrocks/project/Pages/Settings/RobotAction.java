package com.workrocks.project.Pages.Settings;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotAction {

    public static void selectItemInDropdown(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.waitForIdle();

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
