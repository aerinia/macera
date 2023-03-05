import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Player {

    Scanner scan=new Scanner(System.in);

    private int damage;
    private int money;
    private String name;
    private int id;
    private int health;


    public Player(int id, int damage, int money, int health, String name) {
        this.id=id;
        this.damage = damage;
        this.money = money;
        this.name = name;
        this.health=health;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(){

      Player samurai=new Player(1, 5,15,21,"Samuray");
     Player archer=new Player(2,7,20,18,"Okçu");
     Player knight=new Player(3,8,24,5,"Şovalye");
      List<Player> options=new ArrayList<Player>();
      options.add(samurai);
      options.add(archer);
      options.add(knight);
      for(Player option:options ){
          System.out.println("-------------------------");
          System.out.println("Karakter ve kodu: "+option.getId()+" "+option.getName()+
          " Hasar: "+option.getDamage()+" Sağlık: " + option.getHealth()+
                  " Para: "+option.getMoney());
          System.out.println("................................" +
                  "");
      }

        System.out.println("Karakterinizin kodunu giriniz: ");
      int selected=scan.nextInt();
      switch(selected){
          case 1:

             this.setDamage(samurai.getDamage());
              this.setMoney(samurai.getMoney());
              this.setName(samurai.getName());
              this.setHealth(samurai.getHealth());
              break;

          case 2:
              this.setDamage(archer.getDamage());
              this.setMoney(archer.getMoney());
              this.setName(archer.getName());
              this.setHealth(archer.getHealth());
               break;

          case 3:
              this.setDamage(knight.getDamage());
              this.setMoney(knight.getMoney());
              this.setName(knight.getName());
              this.setHealth(knight.getHealth());
              break;

          default:
              System.out.println("Hatalı seçim bir daha!");
              selected=scan.nextInt();
              break;
      }


    }


}
