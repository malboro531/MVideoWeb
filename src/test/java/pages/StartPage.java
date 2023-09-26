package pages;

import elements.Link;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StartPage extends BasePage {

    private Logger logger = LogManager.getLogger(StartPage.class);
    private final String URL = "https://www.mvideo.ru/";

    // Ссылка Ноутбуки
    @FindBy(xpath = "//a[contains(text(),'Ноутбуки')]")
    private WebElement laptopsLink;
    // Ссылка Холодильники
    @FindBy(xpath = "//a[contains(text(),'Холодильники')]")
    private WebElement refrigeratorsLink;
    // Ссылка Телевизоры
    @FindBy(xpath = "//a[contains(text(),'Телевизоры')]")
    private WebElement tvLink;
    // Ссылка Смартфоны в Популярные категории
    @FindBy(xpath = "//mvid-plaintext-ellipsis[text()='Смартфоны ']")
    private WebElement smartphonesPopularLink;
    // Популярные категории
    @FindBy(xpath = "//mvid-plaintext-ellipsis[contains(@class, 'popular-categories__item-name')]")
    private List<WebElement> popularCategories;
    // Наши преимущества
    @FindBy(xpath = "//p[@class='carousel-block-text']")
    private List<WebElement> ourAdvantages;

    // Конструктор класса
    public StartPage(WebDriver driver) {
        // Вызов родительского конструктора
        super(driver);
        // Инициализация веб элементов
        PageFactory.initElements(driver, this);
    }

    public String getURL() {
        return this.URL;
    }

    public void openPage() {
        driver.get(this.URL);
        logger.info("Открыта страница https://www.mvideo.ru/");
    }

    // Ссылка Ноутбуки
    public Link laptopsLink() { return new Link(laptopsLink); }
    // Ссылка Холодильники
    public Link refrigeratorsLink() { return new Link(refrigeratorsLink); }
    // Ссылка Телевизоры
    public Link tvLink() { return new Link(tvLink); }
    // Популярные категории
    public List<WebElement> popularCategories() { return popularCategories; }
    // Наши преимущества
    public List<WebElement> ourAdvantages() { return ourAdvantages; }
}
