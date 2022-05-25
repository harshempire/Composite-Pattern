package menuiterator;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;
    public Waitress(MenuComponent menuComponent){
        this.allMenus=menuComponent;
    }
    public void printMenu(){
        allMenus.print();
    }
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegeterian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
