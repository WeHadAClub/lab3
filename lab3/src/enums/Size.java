package enums;

public enum Size {
    LITTLE("маленький"),
    BIG("большой");

    String size;
    private Size(String sz){
        this.size = sz;
    }

    public String getSize() {
        return size;
    }
}
