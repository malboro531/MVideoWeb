package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class Selenium4Listener implements WebDriverListener {
    private final Logger logger = LogManager.getLogger(Selenium4Listener.class);

    @Override
    public void afterClick(WebElement element) {
        logger.info("Нажата кнопка " + element.getText());
    }

    @Override
    public void afterFindElement(WebDriver driver, By locator, WebElement element) {
        logger.info("Найден элемент " + element.getText());
    }
}