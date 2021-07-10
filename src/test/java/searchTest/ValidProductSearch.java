package searchTest;

import base.ScriptBase;
import controller.SearchController;
import org.testng.annotations.Test;

public class ValidProductSearch extends ScriptBase {
    SearchController searchController;

    @Test
    public void verifySearchByDress(){
        searchController = new SearchController(driver);
        searchController.searchProduct(driver,"Dress");

    }
    @Test
    public void verifySearchByHat(){
        searchController= new SearchController(driver);
        searchController.searchProduct(driver,"Hat");
    }

}
