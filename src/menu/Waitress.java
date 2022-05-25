package menu;

public class Waitress {
    MenuComponent menuComponent;
    public Waitress(MenuComponent allmenu){
        this.menuComponent=allmenu;
    }
    public void printMenu(){
        menuComponent.print();
    }
}
