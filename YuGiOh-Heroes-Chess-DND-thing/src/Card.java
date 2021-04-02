import javax.swing.*;

public class Card {
    private String owner;
    private String name;
    private String location;
    private ImageIcon imageSmall;
    private ImageIcon imageLarge;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ImageIcon getImageSmall() {
        return new ImageIcon(this.getClass().getResource("/com/gui/resources/" + name + ".jpg"));
    }

    public ImageIcon getImageLarge() {
        return new ImageIcon(this.getClass().getResource("/com/gui/resources/" + name + " Large.jpg"));
    }
}
