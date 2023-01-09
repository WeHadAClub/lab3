package environment;

public abstract class Planet {
    String name;
    protected Planet(String name){       // Пространство имеет имя
        this.name = name;
    }
    protected String getName(){
        return this.name;
    }
    protected String timeOfDay(int v){           //Возвращает время дня
        if(v > 12){
            return "ночь";
        }
        else{
            return "день";
        }
    }
}
