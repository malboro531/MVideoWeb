package tests;

import helpers.JavaScriptHelper;
import helpers.ScreenshotHelper;
import listeners.Selenium4Listener;
import matchers.StartPageMatchers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import steps.StartPageSteps;

public class StartPageTests extends BaseTest {
    @Test
    public void startPageTest() {
        Selenium4Listener listener = new Selenium4Listener();
        WebDriver eventFiringWebDriver = new EventFiringDecorator<>(listener).decorate(driver);

        StartPageSteps startPageSteps = new StartPageSteps(eventFiringWebDriver);
        StartPageMatchers startPageMatchers = new StartPageMatchers(startPageSteps);

        // Проверить отображение текста в элементах в главном меню (Ноутбуки, Холодильники, Телевизоры)
        startPageMatchers.isDisplayedLinkLaptops();
        startPageMatchers.isDisplayedLinkRefrigerators();
        startPageMatchers.isDisplayedLinkTv();

        JavaScriptHelper.slowScroll();

        // Проверить, что отображаемые Популярные категории соответствуют заданным
        startPageMatchers.isDisplayedPopularCategories();

        // Проверить количество элеменов в Наши преимущества
        startPageMatchers.isCountOurAdvantagesCorrect();

        // Сделать скриншот страницы
        ScreenshotHelper.screenshot("StartPageScreen");
    }
}