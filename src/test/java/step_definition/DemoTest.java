package step_definition;

import io.cucumber.java.en.Given;
import pageObject.Demo;

public class DemoTest {
    Demo d=new Demo();

    @Given("^test$")
    public void test() throws InterruptedException{
        Thread.sleep(15000);
        d.addition(1,2);
    }
}
