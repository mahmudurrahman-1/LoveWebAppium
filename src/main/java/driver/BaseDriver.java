package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseDriver {
    //all declared variables
    public static AndroidDriver driver = null;
    URL url =null;
    DesiredCapabilities capabilities=new DesiredCapabilities();

    public AndroidDriver setup(){
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"HUAWEI Y9 2019");
        capabilities.setCapability(MobileCapabilityType.UDID,"DEFNW18B08002204");
        capabilities.setCapability("appPackage","com.android.chrome");
        capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");


        // capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");



        try{
            url=new URL("http://0.0.0.0:4723/wd/hub/");
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        driver=new AndroidDriver(url,capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.love.com");
        PageDriver.getInstance().setAndroiddriver(driver);
        return driver;
    }
}
