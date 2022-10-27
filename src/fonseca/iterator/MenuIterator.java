package fonseca.iterator;

import java.util.ArrayList;

import fonseca.menus.ItemMenu;
import fonseca.menus.Submenu;
import interfaces.Iterator;

public class MenuIterator implements Iterator<ItemMenu> {

    private ArrayList<ItemMenu> itens;

    private Integer position;

    public MenuIterator(ArrayList<ItemMenu> itens) {
	this.itens = itens;
	position = 0;
    }

    @Override
    public boolean hasNext() {
	return position < itens.size();
    }

    @Override
    public ItemMenu next() {
	return itens.get(position++);
    }

    public void printarTodosMenus() {
	while (hasNext()) {
	    ItemMenu menuAtual = next();
	    System.out.println(menuAtual.getLabel());
	    if (menuAtual instanceof Submenu) {
		MenuIterator submenuIterator = (MenuIterator) ((Submenu) menuAtual).getIterator();
		submenuIterator.printarTodosMenus();
	    }
	}
    }

    public Integer getPosition() {
	return position;
    }

    public void setPosition(Integer position) {
	this.position = position;
    }

    public ArrayList<ItemMenu> getItens() {
	return itens;
    }

    public void setItens(ArrayList<ItemMenu> itens) {
	this.itens = itens;
    }
}
