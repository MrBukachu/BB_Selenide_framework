package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.RobotAction;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UserList extends ManagerDashboard {

    public void searchUserByFirstName(String firstName){
        setFirstName(firstName);
        clickSearchButton(); }

    public void searchUserByLastName(String lastName){
        setLastName(lastName);
        clickSearchButton();}

    public void searchUserByEmail(String email) {
        setEmail(email);
        clickSearchButton();}

    public UserList sortUserByManagerRole() {
        $("#select2-selectedRole-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;}

    public UserList sortUserBySellerRole() {
        $("#select2-selectedRole-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;}

    public UserList sortUserByInvestorRole() {
        $("#select2-selectedRole-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;}

    public UserList sortUserByAdminRole() {
        $("#select2-selectedRole-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;}

    public UserList sortUserByMemberRole() {
        $("#select2-selectedRole-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;}

    public UserList sortUserBySellerInvestorName() {
        $("#select2-selectedRole-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;}

    public void sendMessageToUser(String subject, String message) {
        $$(".glyphicon.glyphicon-envelope").get(0).click();
        $("#list-subject").setValue(subject);
        $("#list-message").setValue(message);
        $("#sendEmail").click();}
}

