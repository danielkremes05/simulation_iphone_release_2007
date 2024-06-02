package br.com.Iphone.InternetBrowser;

public interface InternetBrowser {
    // Methods: displayPage(String url), addNewTab(), updatePage()

    public default void displayPage(String url) {
        System.out.println(url);
    }

    public default void addNewTab() {
        System.out.println("New Tab");
    }

    public default void updatePage () {
        System.out.println("Update page");
    }

}
