package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;

public class TopInvestors extends ManagerDashboard {

    public void checkPresentElementsOnTopPages(){
        $$(".table.table-hover.table-striped>tbody>tr>td").get(0).shouldBe(Condition.visible);
        $$(".table.table-hover.table-striped>tbody>tr>td").get(1).shouldBe(Condition.visible);
        $$(".table.table-hover.table-striped>tbody>tr>td").get(2).shouldBe(Condition.visible);
        $$(".table.table-hover.table-striped>tbody>tr>td").get(3).shouldBe(Condition.visible);
        $$(".table.table-hover.table-striped>tbody>tr>td").get(4).shouldBe(Condition.visible);
        $$(".table.table-hover.table-striped>tbody>tr>td").get(5).shouldBe(Condition.visible);
    }
}
