package Humans.Soldiers;
import Humans.Soldier;
import Helpers.Limiters;

public class Infantry extends Soldier{
    private int completeMissions;
    private String weapon;


    public Infantry(
        int id, 
        String name, 
        String surname, 
        String nickname, 
        String specialization,
        int Soldier_value,
        int completeMissions, 
        String weapon
        ){
            super(id, name, surname, nickname, specialization, Soldier_value);
            this.completeMissions = completeMissions;
            this.weapon = weapon;
        }
        
    public static Infantry create(
        int id, 
        String name, 
        String surname, 
        String nickname, 
        String specialization,
        int Soldier_value,
        int completeMissions, 
        String weapon
    ){
        Infantry currentInfantry = new Infantry(
            id, 
            name, 
            surname, 
            nickname, 
            specialization, 
            Soldier_value, 
            completeMissions, 
            weapon);

        Soldier_value = Limiters.valuesLimiter(Soldier_value);

    
        return currentInfantry;
    }


    @Override
    public String toString(){
        String toStringInfantry = super.toString();
        toStringInfantry = toStringInfantry +
                            completeMissions + " " +
                            weapon;
        return toStringInfantry;
    }
}
