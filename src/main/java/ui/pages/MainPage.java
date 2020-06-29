package ui.pages;

/**
 * @author Jean Carlo Rodriguez
 */
public class MainPage extends BasePageObject {

    public CatalogPage catalogPage;

    public MainPage() {
        catalogPage = new CatalogPage();
    }

    public void waitUntilPageIsLoaded() {
        //add a Web element verification when needed
    }
}
