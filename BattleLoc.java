import java.util.Random;

public class BattleLoc extends Location{
private monster monsterr;
private String award;

    public BattleLoc(Player player, String name,monster monsterr,String award) {
        super(player, name);
        this.monsterr=monsterr;
        this.award=award;
    }

    public monster getMonsterr() {
        return monsterr;
    }

    public void setMonsterr(monster monsterr) {
        this.monsterr = monsterr;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    boolean onLocation() {
        System.out.println("Şuan burdasınız: "+this.getName());
        System.out.println("Şu canavarla karşılaşabilirsin dikkat et!: "+this.randomMonsterNumber()+" tane "+this.getMonsterr().getName());
        System.out.println("<S>avaş ya da <K>aç");
        String selection= scan.nextLine();
        selection=selection.toUpperCase();
        if(selection.equals("S")){
            for(int i=1;i<randomMonsterNumber();i++){
            playerStatus();
            monsterStatus();
            while(this.getPlayer().getHealth()>0 || this.getMonsterr().getHealth()>0){
                System.out.println("<V>UR ya da <K>aç");
                String selected=scan.nextLine().toUpperCase();
                if(selected.equals("V")){
                    System.out.println("Siz vurdunuz!");
                    monsterr.setHealth(this.monsterr.getHealth()-this.player.getDamage());

                    if(this.getMonsterr().getHealth()>0){
                        System.out.println("----------------");
                        System.out.println("Canavar Size Vurdu");
                   player.setHealth(this.getPlayer().getHealth()-this.getMonsterr().getDamage());
                    }
                }

            }
            }
        }
            //savaş
        return false;

    }

    public void playerStatus(){
        System.out.println("Oyuncunun Durumu:");
        System.out.println("------------------------");
        System.out.println("Sağlık: "+this.getPlayer().getDamage());
        System.out.println("Hasar: "+this.getPlayer().getHealth());
    }
    public void monsterStatus(){
        System.out.println("Rakibin Durumu:");
        System.out.println("------------------------");
        System.out.println("Sağlık: "+this.getMonsterr().getDamage());
        System.out.println("Hasar: "+this.getMonsterr().getHealth());
    }

    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(3)+1;

    }
}

