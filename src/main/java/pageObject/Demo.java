package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class Demo {
    public Demo(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    public void addition(int x,int b){
       System.out.println(x+b);
    }
}
