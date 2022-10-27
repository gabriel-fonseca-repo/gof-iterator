package fonseca;

import fonseca.menus.Menu;
import fonseca.menus.Submenu;
import fonseca.iterator.MenuIterator;

public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu("Detalhes da Conta");
        Menu menu2 = new Menu("Preferêcias");
        Menu menu3 = new Menu("Email");
        Submenu submenu1 = new Submenu("Conta", menu1, menu2, menu3);

        Menu menu4 = new Menu("Configurações");
        Menu menu5 = new Menu("Sistema");
        Menu menu6 = new Menu("Status");
        Submenu submenu2 = new Submenu("Relatório", menu4, menu5, menu6);

        Submenu menuRaiz = new Submenu("Menu raiz");
        menuRaiz.addSubitens(submenu1);
        menuRaiz.addSubitens(submenu2);

        MenuIterator iterator = (MenuIterator) menuRaiz.getIterator();
        iterator.printarTodosMenus();

    }
}