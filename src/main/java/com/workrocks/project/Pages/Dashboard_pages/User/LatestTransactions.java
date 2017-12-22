package com.workrocks.project.Pages.Dashboard_pages.User;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;

public class LatestTransactions extends UserDashboard{

    public void checkPresentElements() {
        $$(".userRow>td").get(0).shouldBe(Condition.visible);
        $$(".userRow>td").get(1).shouldBe(Condition.visible);
        $$(".userRow>td").get(2).shouldBe(Condition.visible);
        $$(".userRow>td").get(3).shouldBe(Condition.visible);

    }

}
