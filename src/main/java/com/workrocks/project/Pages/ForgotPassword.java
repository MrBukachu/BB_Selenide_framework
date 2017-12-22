package com.workrocks.project.Pages;


import static com.codeborne.selenide.Selenide.$;

public class ForgotPassword {
    private void setUserEmail(String userEmail){
        $("#Email").setValue(userEmail);}

    private void setPassword(String userPassword){
        $("#Password").setValue(userPassword);}

    private void setConfirmPassword(String userConfirmPassword){
        $("#ConfirmPassword").setValue(userConfirmPassword);}

    public void setUserData(String email){
        setUserEmail(email);
        $("#continue").click();}

    public void setNewPassword(String email, String password, String confirmPassword){
        setUserEmail(email);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        $(".btn.btn-primary.btn-flat").click();
    }
}
