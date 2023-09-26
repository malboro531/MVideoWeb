package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.StartPage;

import java.util.List;
import java.util.stream.Collectors;

public class StartPageSteps {

    private static Logger logger = LogManager.getLogger(StartPageSteps.class);
    private StartPage startPage;


    public StartPageSteps(WebDriver driver) {
        startPage = new StartPage(driver);
        startPage.openPage();
        logger.info("Открыта страница [Стартовая страница МВидео]");
    }

    // Получить текст элемента Ноутбуки
    public String getTextLaptops() {
        return startPage.laptopsLink().getText();
    }

    // Перейти на страницу Ноутбуки
    public void goToLaptopsPage() {
        startPage.laptopsLink().click();
        logger.info("Открыта страница [Ноутбуки]");
    }

    // Получить текст элемента Холодильники
    public String getTextRefrigerators() {
        return startPage.refrigeratorsLink().getText();
    }

    // Перейти на страницу Холодильники
    public void goToRefrigeratorsPage() {
        startPage.refrigeratorsLink().click();
        logger.info("Открыта страница [Холодильники]");
    }

    // Получить текст элемента Телевизоры
    public String getTextTv() {
        return startPage.tvLink().getText();
    }

    // Перейти на страницу Телевизоры
    public void goToTv() {
        startPage.tvLink().click();
        logger.info("Открыта страница [Телевизоры]");
    }

    // Получить список популярных категорий
    public List<String> getTextPopularCategories() {
        return startPage.popularCategories().stream().map(WebElement::getText).collect(Collectors.toList());
    }

    // Получить количество элементов в Наши преимущества
    public int countOurAdvantages() {
        return startPage.ourAdvantages().size();
    }
}