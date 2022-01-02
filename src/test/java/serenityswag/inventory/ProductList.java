package serenityswag.inventory;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class ProductList extends PageObject {
    public static By productDetailsLinkFor(String firstItemName) {
        return By.linkText(firstItemName);
    }

    public List<String> titles(){
        return findAll(By.className("inventory_item_name")).textContents();
    }

    public String imageTextForProduct(String productName) {
        return $("//div[@class='inventory_item'][contains(.,'"+productName+"')]//img").getAttribute("alt");
    }
}
