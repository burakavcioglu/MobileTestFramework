package Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import static io.appium.java_client.remote.MobileCapabilityType.*;

public class MobileCore {

	
	//Drivers
    public static AppiumDriver<MobileElement> mobiledriver;
    public static String ErrorMessage = "Failed Transaction: ";
    
    
    //Element Type
    public enum ElementType {
        CLASS_NAME,
        ID,
        LINK_TEXT,
        NAME,
        PARTIAL_LINK_TEXT,
        TAG_NAME,
        XPATH,
        ACCESSIBILITYID,
        ANDROIDUIAUTOMATOR
        }

    
    
    
    @Before
    public void SetupKKT() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(DEVICE_NAME, "TestDevice");
        capabilities.setCapability("udid", "emulator-5554"); //Nexus 5
        capabilities.setCapability(PLATFORM, "Windows");
        capabilities.setCapability(PLATFORM_NAME, "Android");
        capabilities.setCapability(PLATFORM_VERSION, "8.1.0");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("useNewWDA", true);
        capabilities.setCapability("TakesScreenshot", true);
        capabilities.setCapability("showXcodeLog", true);
        capabilities.setCapability("appPackage", "org.sbm.ktt"); //KKT
        capabilities.setCapability("appActivity", "org.sbm.ktt.SplashActivity"); //KKT
        //capabilities.setCapability("app", "C:\JAVA\MobileTestFramework\APK\mobilkaza.apk");
        capabilities.setCapability(NEW_COMMAND_TIMEOUT, 1000);

        mobiledriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);
    }

    /*
    @Before
    public void SetupSigortam360() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(DEVICE_NAME, "TestDevice");
        capabilities.setCapability("udid", "emulator-5554"); //Nexus 5
        capabilities.setCapability(PLATFORM, "Windows");
        capabilities.setCapability(PLATFORM_NAME, "Android");
        capabilities.setCapability(PLATFORM_VERSION, "8.1.0");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("useNewWDA", true);
        capabilities.setCapability("TakesScreenshot", true);
        capabilities.setCapability("showXcodeLog", true);
        //capabilities.setCapability("appPackage", "org.sbm.ktt"); //MKT
        //capabilities.setCapability("appActivity", "org.sbm.ktt.SplashActivity"); //MKT
        capabilities.setCapability("app", "C:\\JAVA\\MobileTestFramework\\src\\main\\resources\\APK\\sigortam360.apk");
        capabilities.setCapability(NEW_COMMAND_TIMEOUT, 1000);

        mobiledriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);
    }
    */
    
    
    //Finished Test
    @After
    public void tearDown() throws Exception{
        if (mobiledriver != null) {
        	mobiledriver.closeApp();
            mobiledriver.quit();
        }
    }
    
    
    
    //FindElement
    public static MobileElement FindElement(ElementType Type, String value) throws Exception {

        switch (Type) {

            case CLASS_NAME:
                return mobiledriver.findElement(By.className(value));

            case ID:
                return mobiledriver.findElement(By.id(value));

            case LINK_TEXT:
                return mobiledriver.findElement(By.linkText(value));

            case NAME:
                return mobiledriver.findElement(By.name(value));

            case PARTIAL_LINK_TEXT:
                return mobiledriver.findElement(By.partialLinkText(value));

            case TAG_NAME:
                return mobiledriver.findElement(By.tagName(value));

            case XPATH:
                return mobiledriver.findElement(By.xpath(value));

            default:
                throw new Exception(ErrorMessage + value);

        }
    }

    
    //FindElementMobileBy
    public static MobileElement FindElementMobileBy(ElementType Type, String value) throws Exception {

        switch (Type) {

            case CLASS_NAME:
                return mobiledriver.findElement(MobileBy.className(value));

            case ID:
                return mobiledriver.findElement(MobileBy.id(value));

            case LINK_TEXT:
                return mobiledriver.findElement(MobileBy.linkText(value));

            case NAME:
                return mobiledriver.findElement(MobileBy.name(value));

            case PARTIAL_LINK_TEXT:
                return mobiledriver.findElement(MobileBy.partialLinkText(value));

            case TAG_NAME:
                return mobiledriver.findElement(MobileBy.tagName(value));

            case XPATH:
                return mobiledriver.findElement(By.xpath(value));

            case ACCESSIBILITYID:
                return mobiledriver.findElement(MobileBy.AccessibilityId(value));

            case ANDROIDUIAUTOMATOR:
                return mobiledriver.findElement(MobileBy.AndroidUIAutomator(value));

            default:
                throw new Exception(ErrorMessage + value);

        }
    }




}