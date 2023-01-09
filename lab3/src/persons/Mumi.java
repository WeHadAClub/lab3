package persons;

import enums.*;
import enums.vocabluary.Adjective;
import enums.vocabluary.Pronouns;
import interfaces.Chsize;

public class Mumi extends Erectus implements Chsize {
    String role;
    boolean flag = false;
    public Mumi(String name){
        super(name);
    }
    public Mumi(String name, String role){
        super(name);
        this.role = role;
        setName(name+"-"+role);
    }

    public String epicStand(){
        super.stand();
        return " во " + Pronouns.ALL.getPrn() + Pronouns.HIS.getPrn() + Adjective.MAGNIFISENT.getName();
    }

    public String transform(){
        flag = true;                //когда запускается преображение
                                    // открывается доступ к увеличению и уменьшению
        return this.getName() + " " + States.START.getState() + " преображаться";
    }

    public String increased(BodyParts part){
        if(flag == true){
            return part.getAbbreviation() + " увеличились";
        }
        else{
            return this.getName() + " не начал преображаться";
        }
    }

    public String decreased(BodyParts part){
        if(flag == true){
            return part.getAbbreviation() + " уменьшились";
        }
        else{
            return this.getName() + " не начал преображаться";
        }
    }
}
