import enums.place.Places;
import enums.vocabluary.Adjective;
import enums.vocabluary.Pronouns;
import persons.*;
import enums.*;


public class Main {
    public static void main(String[] args) {
        Mumi Mama = new Mumi("Муми", "Мама");
        Mumi Troll = new Mumi("Муми","Троль");

        System.out.println(Mama.lookAt(Troll, BodyParts.EYES, Adjective.SCARED));
        System.out.println(Mama.lookAt(Troll, BodyParts.EYES, Adjective.NONE));
        System.out.print(HowLong.TOLONG.getLen() + " и ");
        System.out.println(Mama.talk(Troll) + ":");
        System.out.println("Да " + Pronouns.THIS.getPrn() + " " + Troll.getName());
        System.out.println("And not" + States.INTIME.getState() + " " + Pronouns.SHE.getPrn()
        + " " + Pronouns.THIS.getPrn() + " " + States.TALK.getState());
        System.out.println(Troll.transform());
        System.out.println(Pronouns.HIS.getPrn() + " " + Troll.decreased(BodyParts.EYES));
        System.out.println(Troll.decreased(BodyParts.EARS));
        System.out.println(Troll.decreased(BodyParts.TAIL));
        System.out.println(Pronouns.HIS.getPrn() + " " + Troll.increased(BodyParts.NOSE));
        System.out.println(Troll.increased(BodyParts.BELLY));
        System.out.println("И вот " + HowLong.YET.getLen() + " перед " + Pronouns.THEM.getPrn() +" "
                + Troll.stand(Adjective.MAGNIFISENT));
        System.out.println("каким " + Pronouns.HE.getPrn() + " " + HowLong.EARLIER.getLen() + " " + Troll.been());
    }
}

