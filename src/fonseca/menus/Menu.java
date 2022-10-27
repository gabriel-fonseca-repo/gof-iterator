package fonseca.menus;

public class Menu extends ItemMenu {

    private String url;

    public Menu(String label) {
        super(label);
    }

    @Override
    public void onClick() {
        redirect(url);
    }

    private void redirect(String url) {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
