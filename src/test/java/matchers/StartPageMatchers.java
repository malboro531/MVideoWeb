package matchers;

import data.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import steps.StartPageSteps;
import tests.StartPageTests;

public class StartPageMatchers {
    private static Logger logger = LogManager.getLogger(StartPageMatchers.class);
    StartPageSteps startPageSteps;

    public StartPageMatchers(StartPageSteps startPageSteps) {
        this.startPageSteps = startPageSteps;
    }

    // Проверить, что отображается ссылка Ноутбуки
    public void isDisplayedLinkLaptops() {
        Assertions.assertEquals(Data.expectedLaptops, startPageSteps.getTextLaptops(),
                "ERROR! Ошибка в тексте ссылки [Ноутбуки]");
        logger.info("Ссылка [Ноутбуки] отображается корректно");
    }

    // Проверить, что отображается ссылка Холодильники
    public void isDisplayedLinkRefrigerators() {
        Assertions.assertEquals(Data.expectedRefrigerators, startPageSteps.getTextRefrigerators(),
                "ERROR! Ошибка в тексте ссылки [Холодильники]");
        logger.info("Ссылка [Холодильники] отображается корректно");
    }

    // Проверить, что отображается ссылка Телевизоры
    public void isDisplayedLinkTv() {
        Assertions.assertEquals(Data.expectedTv, startPageSteps.getTextTv(),
                "ERROR! Ошибка в тексте ссылки [Телевизоры]");
        logger.info("Ссылка [Телевизоры] отображается корректно");
    }

    // Проверить, что отображаемые Популярные категории соответствуют заданным
    public void isDisplayedPopularCategories() {
        Assertions.assertEquals(Data.getExpectedPopularCategories(), startPageSteps.getTextPopularCategories(),
                "ERROR!Запрашиваемые категории не найдены");
        logger.info("Популярные категории отображаются корректно");
    }

    // Проверить количество элеменов в Наши преимущества
    public void isCountOurAdvantagesCorrect() {
        Assertions.assertTrue(startPageSteps.countOurAdvantages() == 8,
                "ERROR! Количество Наших преимуществ больше(меньше) восьми");
        logger.info("Количество Наших преимуществ равно восьми");
    }
}