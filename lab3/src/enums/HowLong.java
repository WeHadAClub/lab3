package enums;

public enum HowLong {
    TOLONG("долго-долго"),
    LONG("долго"),
    NLONG("недолго"),
    YET("уже"),
    EARLIER("ранее"),
    NOW("теперь");

    String len;
    HowLong(String len){
        this.len = len;
    }

    public String getLen(){
        return this.len;
    }
}
