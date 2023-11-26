package magento;

public class SearchService {
    private final SearchPage searchPage;

    public SearchService() {
        searchPage = new SearchPage();
    }
    public void insertSearch(String prenda){
        searchPage.getInputSearch().sendKeys(prenda);
    }
    public void submitSearch(){
       searchPage.getFormSearch().submit();
    }

    public void searchPrenda(String prenda){
      insertSearch(prenda);
      submitSearch();
    }

}
