package environment;

import enums.place.Flora;
import enums.place.Places;

public class Earth extends Planet {
    String[] plants = new String[1000];
    int k = 0;
    public Earth(String name) {         //название планеты
        super(name);
    }
    public String getPlace(Places p){   //получаем название нужного места
        return p.getName();
    }
    public void grow(String nameOfFl){          // Итак метод принимает строку, в которой находится
        Flora[] flore = Flora.values();         // название растения, которое мы хотим вырастить на земле
        for(Flora p: flore){              //также у нас имеется enum со список допустимых для выроста растений
            if(nameOfFl.equals(p.getName())){    //если растение есть в enum - мы его добавляем в список
                plants[k] = nameOfFl;       //дальше чо придумаю
                k += 1;
                System.out.println("На " + this.getName() + " выращено " + nameOfFl);
                break;
            }
            else{

            }
        }
    }
}
