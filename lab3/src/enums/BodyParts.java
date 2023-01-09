package enums;

import enums.vocabluary.Adjective;

public enum BodyParts {
    EYES("глаза"){
        public String getCondition(Adjective a){
            return a.getName();
        }
    },
    EARS("уши"),
    TAIL("хвост"),
    NOSE("нос"),
    BODY("тело"),
    BELLY("живот");
    private String abbreviation;

    private BodyParts(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
    public String getCondition(Adjective a){
        return a.getName();
    }
}