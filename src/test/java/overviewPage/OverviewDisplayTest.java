package overviewPage;

import base.ScriptBase;
import controller.OverviewPageController;
import org.testng.annotations.Test;

public class OverviewDisplayTest extends ScriptBase {
    OverviewPageController overviewPageController;
    @Test
    public void verifySpecialTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Specials");
    }
    @Test
    public void newProductsTestDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"New products");
    }
    @Test
    public void bestSellersTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Best sellers");
    }
    @Test
    public void ourStoresTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Our stores");
    }
    @Test
    public void contactUsTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Contact us");
    }
    @Test
    public void termsAndConditionTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Terms and conditions of use");
    }
    @Test
    public void aboutUsTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"About us");
    }
    @Test
    public void siteMapTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Sitemap");
    }
    @Test
    public void myOrdersTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"My orders");
    }
    @Test
    public void myCreditSlipsTextDisplayed(){
        overviewPageController= new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"My credit slips");
    }
    @Test
    public void topsButtonDisplay() throws InterruptedException {
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.womenCatalog(driver);
    }
    @Test
    public void casualDressesDisplay() throws InterruptedException {
        overviewPageController = new OverviewPageController(driver);
        overviewPageController.dressCatalog(driver);
    }
    @Test
    public void catalogDisplay(){
        overviewPageController =  new OverviewPageController(driver);
        overviewPageController.tShirtCatalog(driver);
    }

}
