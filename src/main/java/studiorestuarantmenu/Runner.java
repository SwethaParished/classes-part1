package studiorestuarantmenu;


import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        ArrayList<MenuItems> menuItems = new ArrayList<>(
                Arrays.asList(new MenuItems(8.75, "Salad", "chicken Caesar salad", "Entree"),
                        new MenuItems(18.50, "Chicken Alfredo", "chicken in a white sauce with fettuccine noodles", "Entree")));
        Menu menu = new Menu(menuItems);
        menu.addMenuItems(new MenuItems(7.25, "Tiramisu", "coffee-flavoured Italian dessert", "Dessert"));
        //menu.addMenuItems(new MenuItems(7.25, "Tiramisu", "coffee-flavoured Italian dessert", "Dessert"));
        menu.printMenu();
    }

}