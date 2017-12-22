package com.workrocks.project.Pages.Settings;

import com.workrocks.project.Pages.ForgotPassword;
import org.openqa.selenium.WebDriver;

import javax.mail.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.page;

public class ReadMail {
    private WebDriver wd;
    public static String verify;



    public void displayAllMessagesFromGmail() {
        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("d:\\Java\\selenide_buildingbits_tests\\src\\main\\resources\\smtp.properties")));

            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "workrocksqa@gmail.com", "test55555");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);
            int messageCount = inbox.getMessageCount();

            Message[] messages = inbox.getMessages();
            System.out.println("------------------------------");

            for (int i = 0; i < messageCount; i++) {
                System.out.println("ReadMail Subject:- " + messages[i].getSubject());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ForgotPassword openConfirmationMessage(String email, String password){
        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("d:\\Java\\selenide_buildingbits_tests\\src\\main\\resources\\smtp.properties")));

            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", email, password);

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();

            verify = messages[0].getContent().toString();

            verify=verify.substring(verify.indexOf("http"), verify.indexOf("\">here"));

            wd.get(verify);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return page(ForgotPassword.class);
    }

    public void openRejectedMessage(){
        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("d:\\Java\\selenide_buildingbits_tests\\src\\main\\resources\\smtp.properties")));

            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "workrocksqa@gmail.com", "test55555");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();

            verify = messages[0].getContent().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteConfirmationMessage(String email, String password){
        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("d:\\Java\\selenide_buildingbits_tests\\src\\main\\resources\\smtp.properties")));

            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", email, password);

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_WRITE);

            Message[] messages = inbox.getMessages();

            messages[0].setFlag(Flags.Flag.DELETED, true);
            inbox.close(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearAllMessages(String email, String password){
        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("d:\\Java\\selenide_buildingbits_tests\\src\\main\\resources\\smtp.properties")));

            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", email, password);

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_WRITE);
            int messageCount = inbox.getMessageCount();

            Message[] messages = inbox.getMessages();

            for(int i = 0; i < messageCount; i++){
                messages[i].setFlag(Flags.Flag.DELETED, true);
            }

            inbox.close(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFirstMessageFromList(String email, String password){
        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("d:\\Java\\selenide_buildingbits_tests\\src\\main\\resources\\smtp.properties")));

            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", email, password);

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();

            verify = messages[0].getContent().toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


