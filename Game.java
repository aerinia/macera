import java.util.Scanner;

public class Game {
   private Scanner scanner = new Scanner(System.in);
    public Player player;
    public Location location;


    public void start(){

        System.out.println("Bu macera oyununda kaybolacaksın!");
        System.out.println("İsminizi giriniz:");
        String name=scanner.nextLine();
        Player player=new Player(name);
        System.out.println(player.getName()+" hoşgeldin!");
        player.selectChar();
       while(true){
            Location location=null;
            System.out.println("Bölgeler");
            System.out.println("1-Güvenli Ev");
            System.out.println("2-Mağaza");
           System.out.println("3-Mağaraya git");
           System.out.println("4-Ormana git");
           System.out.println("5-Nehire git");
            System.out.println("Lütfen gitmek istedğiniz bölgeyi seçin: ");
            int selection= scanner.nextInt();
            switch (selection){
                case 1 :
                    location= new SafeHouse(player);
                    break;
                case 2 :
                    location= new ToolStore(player);
                    break;

                case 3:
                    location= new cave(player);
                    break;
                case 4:
                    location=new forest(player);
                    break;

                case 5:
                    location=new river(player);
                    break;

                default:
                    location= new SafeHouse(player);
                    break;

            }
            location.onLocation();
        }
    }

}
