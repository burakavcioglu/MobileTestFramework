package Keywords;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Core.MobileCore;


public class Keywords extends MobileCore {

    //Click
    public static void Click(ElementType type, String value) throws Exception {
    	FindElement(type, value).click();
    }
    
    
    //Click Mobile
    public static void ClickMobile(ElementType type, String value) throws Exception {
        FindElementMobileBy(type, value).click();
    }
    
    
    
    
    
    //SendKeys & SetValue
    public static void SendKeys(ElementType type, String value, String Text) throws Exception {
        mobiledriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        FindElement(type, value).sendKeys(Text);
    }

    // SelectOptionIndex
    public static void SelectOptionIndex(ElementType type, String value, int index) throws Exception {

        new Select(FindElement(type, value)).selectByIndex(index);
    }

    // SelectOptionValue
    public static void SelectOptionValue(ElementType type, String value, String ItemValue) throws Exception {

        new Select(FindElement(type, value)).selectByValue(ItemValue);
    }

    // Element is Displayed
    public static void isDisplayed(ElementType type, String value) throws Exception {

        FindElement(type, value).isDisplayed();
    }

    //Wait Element To Be Clickable
    public static void WaitElementToBeClickable(ElementType type, String value) throws Exception {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(FindElement(type, value)));

    }

    // Wait Element To Be Clickable
    public static void WaitElementToBeClickableMobileBy(ElementType type, String value) throws Exception {

        WebDriverWait wait = new WebDriverWait(mobiledriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(FindElementMobileBy(type, value)));

    }


    // ClearInput
    public static void ClearInput(ElementType type, String value) throws Exception {

        FindElement(type, value).clear();
    }

    // Get Text
    public static String GetText(ElementType type, String value) throws Exception {

        return FindElement(type, value).getText();
    }

    // GetAttribute
    public static String GetAttribute(ElementType type, String value, String AttributeName) throws Exception {

        return FindElement(type, value).getAttribute(AttributeName);
    }

    // Dropdown Selected Option Get Text
    public static String SelectedOptionGetText(ElementType type, String value) throws Exception {

        new Select(FindElement(type, value)).getFirstSelectedOption().getText();
        return value;
    }

    // Thread Sleep 1 Seconds
    public static void ThreadSleep1Seconds() throws Exception {

        Thread.sleep(1 * 1000);
    }

    // Thread Sleep 5 Seconds
    public static void Sleep5() throws Exception {

        Thread.sleep(5000);
    }
    
    //Wait & Sleep: Seconds Type
    public static void Wait(int seconds) throws Exception {

        Thread.sleep(seconds * 1000);
    }

    // Thread Sleep 10 Seconds
    public static void ThreadSleep10Seconds() throws Exception {

        Thread.sleep(10 * 1000);
    }

    // Wait Page Load
    public static void PageLoad() {

    	mobiledriver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
    }

    // implicitly Wait
    public static void ImplicitlyWait() {

    	mobiledriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    }

    // Assert Equals
    public static void AssertEquals(String value1, String value2) {

        AssertEquals(value1, value2);

    }

    // Page Refresh
    public static void PageRefresh() {

    	mobiledriver.navigate().refresh();
    }

    // Keys.ENTER
    public static void KeysENTER(ElementType type, String value) throws Exception {

        FindElement(type, value).sendKeys(Keys.ENTER);
    }

    // Delete Cookie
    public static void DeleteCookie() {

        mobiledriver.manage().deleteAllCookies();
    }

    // Scroll
    public static void Scroll(MobileElement ElementPress, MobileElement ElementMove) {
        TouchAction scroll = new TouchAction(mobiledriver);
        scroll.press(ElementPress).moveTo(ElementMove).release().perform();
    }

}
