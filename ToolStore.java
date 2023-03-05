import java.util.LinkedList;
import java.util.List;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player, String name) {
        super(player, "Mağaza");
    }

    public ToolStore(Player player) {
        super(player,"Mağaza");
    }


    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya hoşgeldiniz");
        System.out.println("İşleminizi seçiniz");
        System.out.println("1-Silahlar");
        System.out.println("2-Zırhlar");
        System.out.println("3-Çıkış Yap");
        int selected=scan.nextInt();
        while(selected<1 || selected>3){
            System.out.println("Geçersiz sayı tekrar seçiniz");
            selected=scan.nextInt();
        }
        switch(selected){
            case 1:
                printWeapon();
                break;

            case 2:
                printArmor();
                break;

            case 3:
                System.out.println("Yine bekleriz");
                return true;
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("Silahlar");
        weapon gun =new weapon(1,2,25,"Tabanca");
        weapon sword=new weapon(2,5,35,"Kılıç");
        weapon rifle = new weapon(3,7,45,"Tüfek");
        List<weapon>weapons=new LinkedList<weapon>();
        weapons.add(gun);
        weapons.add(sword);
        weapons.add(rifle);
        for(weapon w : weapons){
            System.out.println("İsim ve numara : "+w.getId()+" "+w.getName());
            System.out.println("Hasarı: "+w.getDamage());
            System.out.println("Fiyatı: "+w.getMoney());

        }
        System.out.println("Bir silah seçiniz");
        int selectedW= scan.nextInt();
        if(selectedW <1 || selectedW> weapons.size()) {
            System.out.println("Yanlış seçim bir daha deneyin!");
            selectedW = scan.nextInt();
        }
        switch (selectedW){
            case 1:
                if(weapons.get(0).getMoney()>this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye!");
                }
                else {
                    System.out.println("Silahı satın aldınız");
                    this.getPlayer().setMoney((this.getPlayer().getMoney()) - (weapons.get(0).getMoney()));
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                }
                break;
            case 2:
                if(weapons.get(1).getMoney()>this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye!");
                }
                else {
                    System.out.println("Silahı satın aldınız");
                    this.getPlayer().setMoney((this.getPlayer().getMoney()) - (weapons.get(1).getMoney()));
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());

                }
                break;
            case 3:
                if(weapons.get(2).getMoney()>this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye!");
                }
                else {
                    System.out.println("Silahı satın aldınız");
                    this.getPlayer().setMoney((this.getPlayer().getMoney()) - (weapons.get(2).getMoney()));
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                }
                break;

        }
    }

    public void printArmor(){
        System.out.println("Zırhlar");
        armor basic=new armor(1,1,25,"Hafif");
        armor medium=new armor(2,3,35,"Orta");
        armor hard = new armor(3,5,45,"Ağır");
        List<armor>armors=new LinkedList<armor>();
        armors.add(basic);
        armors.add(medium);
        armors.add(hard);
        for(armor a : armors){
            System.out.println("İsim ve numara : "+a.getId()+" "+a.getName());
            System.out.println("Engellemesi: "+a.getBlock());
            System.out.println("Fiyatı: "+a.getMoney());

        }
        System.out.println("Bir zırh seçiniz");
        int selectedA= scan.nextInt();
        if(selectedA <1 || selectedA> armors.size()) {
            System.out.println("Yanlış seçim bir daha deneyin!");
            selectedA = scan.nextInt();
        }
        switch (selectedA) {
            case 1:
                if (armors.get(0).getMoney() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye!");
                } else {
                    System.out.println("Silahı satın aldınız");
                    this.getPlayer().setMoney((this.getPlayer().getMoney()) - (armors.get(0).getMoney()));
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                }
                break;
            case 2:
                if (armors.get(1).getMoney() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye!");
                } else {
                    System.out.println("Silahı satın aldınız");
                    this.getPlayer().setMoney((this.getPlayer().getMoney()) - (armors.get(1).getMoney()));
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());

                }
                break;
            case 3:
                if (armors.get(2).getMoney() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye!");
                } else {
                    System.out.println("Silahı satın aldınız");
                    this.getPlayer().setMoney((this.getPlayer().getMoney()) - (armors.get(2).getMoney()));
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                }
                break;
        }

        }
}
