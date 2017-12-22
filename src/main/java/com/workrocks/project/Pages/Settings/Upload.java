package com.workrocks.project.Pages.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Upload {
    private WebDriver wd;
    private WebDriverWait wait;

    public static String verify;

    public Upload(WebDriver driver) {
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);

    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard()
                .setContents(stringSelection, null);
    }

    public void uploadFile(String filePath, String buttonId) throws InterruptedException {
        setClipboardData(filePath);

        WebElement fileInput = wd.findElement(By.id(buttonId));
        fileInput.click();

        Thread.sleep(1000);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.waitForIdle();

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void uploadFileViaXPath(String filePath, String xpath) throws InterruptedException {
        setClipboardData(filePath);

        WebElement fileInput = wd.findElement(By.xpath(xpath));
        fileInput.click();

        Thread.sleep(1000);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.waitForIdle();

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void uploadReport(String elementName, String filePath){
        wd.findElement(By.name(elementName)).sendKeys(filePath);
    }
}
