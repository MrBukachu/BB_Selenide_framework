package com.workrocks.project.Pages.Dashboard_pages.Manager;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Comments extends ManagerDashboard {
    public Comments searchCommentByUserName(String userName) {
        setUserName(userName);
        clickSearchButton();
        return this;
    }

    public Comments searchCommentByBuildingName(String buildingName) {
        setBuildingName(buildingName);
        clickSearchButton();
        return this;
    }

    public Comments searchCommentByMessage(String comment) {
        $("#Message").setValue(comment);
        clickSearchButton();
        return this;
    }

    public Comments editLastComment(String editComment) {
        $$(".fa.fa-edit").get(0).click();
        $(".textarea").clear();
        $(".textarea").setValue(editComment);
        $("#saveComment").click();
        return this;
    }

    public Comments deleteLastComment() {
        $$(".fa.fa-trash-o").get(0).click();
        $("#deleteComment").click();
        return this;
    }
}
