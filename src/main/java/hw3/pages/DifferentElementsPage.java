package hw3.pages;

import hw3.pages.poElements.RightSideBarElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DifferentElementsPage extends AbstractPage {

    private final RightSideBarElement rightSideBarElement;

    @FindBy(xpath = "//a[contains(text(),'Service')]")
    private WebElement headerService;

    @FindBy(xpath = "//a[contains(@href,'different-elements')]")
    private WebElement diffElements;

    @FindBy(css = "label:nth-child(1) > input[type=checkbox]")
    private WebElement waterCheckboxe;

    @FindBy(css = "label:nth-child(3) > input[type=checkbox]")
    private WebElement windCheckboxe;

    @FindBy(css = "label.label-radio > input")
    private List<WebElement> radioSelen;

    @FindBy(xpath = "//select")
    private WebElement colorsDropDown;

    @FindBy(xpath = "//option[text()='Yellow']")
    private WebElement yellowColor;

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
        rightSideBarElement = new RightSideBarElement();
        PageFactory.initElements(driver, rightSideBarElement);
    }

    public WebElement getWaterCheckboxe() {
        return waterCheckboxe;
    }

    public WebElement getWindCheckboxe() {
        return windCheckboxe;
    }

    public List<WebElement> getRadioSelen() {
        return radioSelen;
    }

    public WebElement getYellowColor() {
        return yellowColor;
    }

    public RightSideBarElement getRightSideBarElement() {
        return rightSideBarElement;
    }

    public void openDiffElPage() {
        headerService.click();
        diffElements.click();
    }

    public void selectWaterAndWindCheckboxes() {
        waterCheckboxe.click();
        windCheckboxe.click();
    }

    public void selectSelenRadio() {
        radioSelen.get(3).click();
    }

    public void selectYellowColor() {
        colorsDropDown.click();
        yellowColor.click();
    }
}