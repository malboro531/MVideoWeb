package data;

import java.util.ArrayList;
import java.util.List;

public class Data {

    // Элементы главного меню
    public static String expectedLaptops = "НОУТБУКИ";
    public static String expectedRefrigerators = "ХОЛОДИЛЬНИКИ";
    public static String expectedTv = "ТЕЛЕВИЗОРЫ";

    // Популярные категории
    public static List<String> getExpectedPopularCategories() {
        List<String> expectedPopularSubcategories = new ArrayList();
        expectedPopularSubcategories.add("Смартфоны");
        expectedPopularSubcategories.add("Ноутбуки");
        expectedPopularSubcategories.add("Телевизоры");
        expectedPopularSubcategories.add("Холодильники и морозильные камеры");
        expectedPopularSubcategories.add("Обогреватели");
        expectedPopularSubcategories.add("Стиральные и сушильные машины");
        expectedPopularSubcategories.add("Складные смартфоны");
        expectedPopularSubcategories.add("Кухонная мебель");
        expectedPopularSubcategories.add("Умные колонки");
        expectedPopularSubcategories.add("Планшеты");
        return expectedPopularSubcategories;
    }
}
