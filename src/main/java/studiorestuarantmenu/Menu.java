package studiorestuarantmenu;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {

    private Date dateLastUpdated;
    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("Appetizer", "Main Course", "Dessert")
    );
    private MenuItems special;
    private ArrayList<MenuItems> items;

    public Menu(ArrayList<MenuItems> items) {
        this.items = items;
        this.dateLastUpdated = new Date();
    }

    public void addCategory(String category) {
        this.categories.add(category);
    }

    public void removeCategory(String category) {
        this.categories.remove(category);
    }

    public void addMenuItems(MenuItems items) {
        this.items.add(items);
    }

    public void removeMenuItems(MenuItems item) {
        this.items.remove(items);
    }

    public MenuItems getSpecial() {
        return special;
    }

    public void setSpecial(MenuItems special) {
        this.special = special;
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void printMenu() {

        System.out.println("****");
        for (MenuItems menuItems : items) {
            System.out.println(menuItems.toString());
            System.out.println("****");
        }
    }

}