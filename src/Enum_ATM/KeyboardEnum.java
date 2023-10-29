package Enum_ATM;

public enum KeyboardEnum {
    ZERO_KEY("0"),
    ONE_KEY("1"),
    TWO_KEY("2"),
    THREE_KEY("3"),
    FOUR_KEY("4"),
    FIVE_KEY("5"),
    SIX_KEY("6"),
    SEVEN_KEY("7"),
    EIGHT_KEY("8"),
    NINE_KEY("9"),
    TRIPLEZERO_KEY("000"),
    CLEAR_KEY("CLEAR"),
    CANCEL_KEY("CANCEL"),
    OK_KEY("OK");
    public  final String label;
    
    private  KeyboardEnum(String label){
        this.label=label;
    }
}
