package enums.vocabluary;

public enum Pronouns {
    HE("он"),
    HIS("его"),
    SHE("она"),
    THIS("это"),
    THEM("ним"),
    I("я"),
    YOU("ты"),
    ALL("все");

    String prn;
    private Pronouns(String prn){
        this.prn = prn;
    }
    public String getPrn(){
        return this.prn;
    }
}
