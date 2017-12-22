package com.workrocks.project.Pages.Dashboard_pages.Manager;

import static com.codeborne.selenide.Selenide.$;

public class EventsList extends ManagerDashboard {
    public EventsList searchEventByUserName(String userName) {
        setUserName(userName);
        clickSearchButton();
        return this;
    }

    public EventsList searchEventByIP(String ip) {
        $("#IP").setValue(ip);
        clickSearchButton();
        return this;
    }
}
