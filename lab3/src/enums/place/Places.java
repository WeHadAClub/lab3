package enums.place;

import environment.Planet;

public enum Places {
    TPLACE("местечко"),
    GROTTO("грот"),
    HOME("дом"),
    SHOP("магазин");

    private String name;
    private Places(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
