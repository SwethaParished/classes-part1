package studiorestuarantmenu;

public class MenuItems {

    private String name;
    private int price;
    private String description;
    private boolean add;
    private String category;

    public MenuItems(String name, int price, String description, boolean add, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.add = add;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
