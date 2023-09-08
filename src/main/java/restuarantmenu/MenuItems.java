package restuarantmenu;

import java.util.Date;

public class MenuItems {

    private double price;
    private String name;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateCreated;

    public MenuItems(double price,
                     String name,
                     String description,
                     String category) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.dateCreated = new Date();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

}
