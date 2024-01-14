package org.amazon.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.amazon.pages.HomePage;
import org.amazon.pages.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageStepDef {

    private WebDriver driver;
    private HomePage homePage;
   // private SearchResultPage searchResultPage;

    /*public HomePageStepDef(WebDriver driver){
        this.homePage =new HomePage(driver);
        this.searchResultPage = new SearchResultPage(driver);
    }*/

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }



    @Given("I am on Amazon website")
    public void i_am_on_amazon_website() {
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
    }

    @Given("I type {string} in the search field")
    public void i_type_in_the_search_field(String string) {
        homePage.searchProduct("Monitor");
        homePage.setSearchButtonLocator();
    }

    @Given("I select the first item on the list")
    public void i_select_the_first_item_on_the_list() {

    }

    @When("I Add to Cart")
    public void i_add_to_cart() {

    }

    @When("I open Cart from the top-left")
    public void i_open_cart_from_the_top_left() {

    }

    @Then("The price should be identical price on the product page")
    public void the_price_should_be_identical_price_on_the_product_page() {

    }

    @Then("The subtotal should be identical to price on the product page")
    public void the_subtotal_should_be_identical_to_price_on_the_product_page() {

    }
}
