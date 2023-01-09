package enums.vocabluary;

public enum Adjective {
    NONE(""),
    SCARED("испуганный"),
    KIND("добрый"),
    MAGNIFISENT("великолепный");

    String name;

    private Adjective(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
