package interfaces;

import enums.vocabluary.Adjective;
import enums.BodyParts;
import persons.Erectus;

public interface Actions {
    String been();
    String lookAt(Erectus sub, BodyParts prt,  Adjective a);
    String talk(Erectus sub);
    String sit();
    String hug(Erectus sub);
    String stand();
    default String recognize(){
        return "узнал";
    }

}
