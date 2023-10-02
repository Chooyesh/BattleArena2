package creature.hero;

import creature.Creature;

public class Hero extends Creature {
    private  int healVolume = 4;
    public void heal(){
        if (healVolume>0){
            setHealth((int) Math.floor(getHealth()+30));
            if (getHealth()>100){
                setHealth(100);
            }
        }
    }
}
