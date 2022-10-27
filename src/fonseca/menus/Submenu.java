package fonseca.menus;

import java.util.ArrayList;
import java.util.Arrays;

import fonseca.iterator.MenuIterator;
import interfaces.Iterable;
import interfaces.Iterator;

public class Submenu extends ItemMenu implements Iterable<ItemMenu> {

    private ArrayList<ItemMenu> subItens;

    public Submenu(String label) {
	super(label);
	this.subItens = new ArrayList<>();
    }

    public Submenu(String label, ItemMenu... menus) {
	super(label);
	this.subItens = new ArrayList<>(Arrays.asList(menus));
    }

    public void addSubitens(ItemMenu... menus) {
	this.subItens.addAll(Arrays.asList(menus));
    }

    @Override
    public void onClick() {
	expand();
    }

    private void expand() {

    }

    public ArrayList<ItemMenu> getSubItens() {
	return subItens;
    }

    public void setSubItens(ArrayList<ItemMenu> subItens) {
	this.subItens = subItens;
    }

    @Override
    public Iterator<ItemMenu> getIterator() {
	return new MenuIterator(subItens);
    }

}
