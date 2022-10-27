package fonseca.menus;

public abstract class ItemMenu implements ItemMenuInterface {
    private String label;

    public ItemMenu(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
