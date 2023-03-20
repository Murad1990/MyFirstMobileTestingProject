package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class Driver {

    private static AppiumDriver driver;

    public synchronized static AppiumDriver getDriver (){
        if(driver==null){





            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigurationReader.getProperty("PLATFORM_NAME"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigurationReader.getProperty("PLATFORM_VERSION"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigurationReader.getProperty("DEVICE_NAME"));
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigurationReader.getProperty("AUTOMATION_NAME"));
            desiredCapabilities.setCapability("appPackage", ConfigurationReader.getProperty("appPackage"));
            desiredCapabilities.setCapability("appActivity", ConfigurationReader.getProperty("appActivity"));

            try {
                //SetUp the Appium server URL to connect to
                URL appiumServer = new URL(ConfigurationReader.getProperty("url"));
                driver = new AppiumDriver(appiumServer,desiredCapabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigurationReader.getProperty("implicitWait"))));
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return driver;
    }

    public  static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
