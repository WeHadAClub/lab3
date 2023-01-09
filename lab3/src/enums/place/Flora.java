package enums.place;

public enum Flora {
    JASMINE("жасмин"),
    DANDELION("одуванчик"),
    FIR("ель");
    private String name;

    Flora(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
