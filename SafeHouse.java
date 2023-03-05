import java.sql.SQLOutput;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli ev");
    }


    @Override
    public boolean onLocation(){
        System.out.println("Güvenli ev canınız yenileniyor!");
        return true;
    }
}
