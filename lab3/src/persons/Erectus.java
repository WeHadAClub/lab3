package persons;

import enums.*;
import enums.vocabluary.Adjective;
import interfaces.Actions;

import java.util.Objects;

public abstract class Erectus implements Actions {
    private String name;

    public Erectus(String name){
        setName(name);
    }

    protected void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String been(){
        return "быть";
    }
    public String lookAt(Erectus sbj, BodyParts prt, Adjective a){
        String cnd = "";
        if(prt == BodyParts.EYES){
            cnd = prt.getCondition(a) + " ";
        }
        return (this.getName() + " " + States.LOOK.getState() + " в " + cnd + prt.getAbbreviation() + " " + sbj.getName()); //полноценная строка

    }
    public String talk(Erectus sub){
        if(!this.equals(sub)){
            return (this.getName() + " " + States.TALK.getState() + " " + sub.getName());
        }
        else{
            return "не может гововрить сам с собой";
        }
    }
    public String sit(){
        return this.getName() + " " + States.SIT.getState();
    }
    public String hug(Erectus sub) {
        if (!this.equals(sub)) {
            return this.getName() + " " + States.HUG.getState() + " " + this.getName();
        } else {
            return "не может обнять сам себя";
        }
    }
    public String stand(){
        return this.getName() + " " + States.STAND.getState();
    }

    public String stand(Adjective a){
        return this.getName() + " " + States.STAND.getState() + " " + a.getName();
    }

    @Override
    public String toString(){
        return getClass().getName() + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Erectus erectus = (Erectus) o;
        return Objects.equals(name, erectus.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
