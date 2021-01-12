package hw4.tests.firstExerciseTestRun;

import hw4.tests.abstractTest.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Домашняя работа №4, Allure and jenkins")
@Story("Упражнение №1")
public class FirstExerciseRunTest extends BaseTest {

    @Test(description = "Тестирование страницы Home page")
    public void verifyHomePage() {

        actionStep.openMainPage();
        assertionStep.verifyHomePageURLAndTitle();
        actionStep.loggInHomePage();
        assertionStep.verifyLoggIn();
        assertionStep.verifyHeaderElementsAreDisplayed();
        assertionStep.verifyHeaderElementsText();
        assertionStep.verifyImagesAreDisplayedOnTheIndexPage();
        assertionStep.verifyImagesOnTheIndexPageText();
        assertionStep.verifyIframeExist();
        actionStep.switchToFrame();
        assertionStep.verifyFrameButtonExist();
        actionStep.switchBackToOriginalWindow();
        assertionStep.verifyFocusOnOriginalWindow();
        assertionStep.verifyLeftElementsAreDisplayed();
        assertionStep.verifyLeftElementsText();
        soft.assertAll();
    }
}