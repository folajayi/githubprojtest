package org.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By searchFieldLocator = By.id("twotabsearchtextbox");
    private By searchButtonLocator = By.id("nav-search-submit-button");

    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Page Actions
    public void searchProduct(String productName){
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys("Monitor");
    }
    public void setSearchButtonLocator(){
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }


}
