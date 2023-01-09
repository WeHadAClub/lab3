package enums;

public enum States {
    TALK("говорить"),
    SIT("сидеть"),
    STAND("стоять"),
    LOOK("смотреть", "глядеть"),
    HUG("обнимать", "сжимать"),

    START("начинать", "начал"),
    INTIME("успеть");

    private String state1, state2;
    States(String state){
        this.state1 = state;
    }

    States(String s1, String s2){
        this.state1 = s1;
        this.state2 = s2;
    }

    public String getState(){
        if(state2 == null){                 //Простая проверка: если второе состояние не пустое
        return this.state1;                 //то рандомно выбираем
        }
        else{
            if(Math.random()>0.5){
                return state1;
            }
            else{
                return state2;
            }
        }
    }
}
