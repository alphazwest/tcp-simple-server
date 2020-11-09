package common;

public enum Defaults {

    // Define defaults
    DEFAULT_PORT("9999"),
    DEFAULT_HOST("localhost");

    // Constructor
    private String value;
    Defaults(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
