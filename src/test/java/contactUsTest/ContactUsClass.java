package contactUsTest;

import base.ScriptBase;
import controller.ContactUsController;
import org.testng.annotations.Test;

public class ContactUsClass extends ScriptBase {
    ContactUsController contactUsController;

    @Test
    public void verifyContactUs() {
        contactUsController = new ContactUsController(driver);
        contactUsController.displayContactUsButton();

    }

    @Test
    public void verifyContactUs1() {
        contactUsController = new ContactUsController(driver);
        contactUsController.dropDownButton(driver);

    }

    @Test
    public void verifyContactUs2() {
        contactUsController = new ContactUsController(driver);
        contactUsController.contactUsInput();

    }

    @Test
    public void verifyContactUs3() {
        contactUsController = new ContactUsController(driver);
        contactUsController.attachFile(driver);

    }  @Test
    public void verifyContactUs4() {
        contactUsController = new ContactUsController(driver);
        contactUsController.inputMessage();
    }
    @Test
    public void verifyContactUs5() {
        contactUsController = new ContactUsController(driver);
        contactUsController.sendKeyButton();
    }
}
