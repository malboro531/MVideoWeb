package elements;

import helpers.*;
import org.openqa.selenium.WebElement;

public class Link extends BaseElement {
    // Конструктор
    public Link(WebElement webElement) {
        super(webElement);
    }

    // Нажатие на ссылку
    public void click() {
        // Ожидание кликабельности ссылки
        WaitHelper.clickabilityOfElement(webElement);
        webElement.click();
    }

    // Наведение курсора мыши на ссылку
    public void focusOnLink() {
        WaitHelper.clickabilityOfElement(webElement);
        ActionHelper.moveToElement(webElement);
    }

    // Открытие ссылки в новом окне
    public void openInNewWindow() {
        // Получение URL ссылки
        String URL = this.getURL();
        // Создание нового окна и переключение на него
        SwitchHelper.switchToNewWindow();
        // Максимизация размеров окна
        WindowHelper.maximizeWindow();
        // Переход по ссылке в новом окне
        NavigationHelper.navigateTo(URL);
    }

    // Получение URL ссылки
    public String getURL() {
        return webElement.getAttribute("href");
    }

    // Получение текста ссылки
    public String getText() {
        return webElement.getText();
    }

    // Фокус на элементе
    public void focusOnElement() {
        ActionHelper.moveToElement(webElement);
    }

}
