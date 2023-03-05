public class Inventory {
    private weapon weappon;
    private armor armorr;

    public Inventory(weapon weappon) {
        this.weappon = new weapon(0,0,0,"yumruk");
    }

    public Inventory(weapon weappon, armor armorr) {
        this.weappon = weappon;
        this.armorr = armorr;
    }
}
