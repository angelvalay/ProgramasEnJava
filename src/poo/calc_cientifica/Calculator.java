package poo.calc_cientifica;

public abstract class Calculator implements Clickable<Character> {

    //Constantes
    public static final char KEY_0 = '0';
    public static final char KEY_1 = '1';
    public static final char KEY_2 = '2';
    public static final char KEY_3 = '3';
    public static final char KEY_4 = '4';
    public static final char KEY_5 = '5';
    public static final char KEY_6 = '6';
    public static final char KEY_7 = '7';
    public static final char KEY_8 = '8';
    public static final char KEY_9 = '9';
    public static final char KEY_POINT = '.';
    public static final char KEY_SUB = '-';
    public static final char KEY_ADD = '+';
    public static final char KEY_MUL = 'x';
    public static final char KEY_DIV = '/';
    public static final char KEY_SEN = 'S';
    public static final char KEY_COS = 'C';
    public static final char KEY_TAN = 'T';
    public static final char KEY_LN = 'L';
    public static final char KEY_LOG = 'l';
    public static final char KEY_SQRT = '~';
    public static final char KEY_PI = '#';
    public static final char KEY_E = 'E';
    public static final char KEY_POW = '^';
    public static final char KEY_POP = '(';
    public static final char KEY_PCL = ')';
    public static final char KEY_FACT = '!';
    public static final char KEY_EQ = '=';
    public static final int MAX_LENGTH = 20;
    public static final int MAX_PRIO = 10;

    //Variable para almacenar la cadena temporal que se genere cuando se este escribiendo
    protected String cadTemp;
    //Variable para saber si es ya es un punto
    protected boolean isPoint;
    //Variable para capturar la expresion completa
    protected String cadComp;

    public String getCadTemp() {
        return cadTemp;
    }

    public void setCadTemp(String cadTemp) {
        this.cadTemp = cadTemp;
    }

    public boolean isPoint() {
        return isPoint;
    }

    public void setPunto(boolean point) {
        isPoint = point;
    }

    public String getCadComp() {
        return cadComp;
    }

    public void setCadComp(String cadComp) {
        this.cadComp = cadComp;
    }

    public static int getPriority(Character operator) {
        switch (operator) {
            case KEY_POP:
                return MAX_PRIO;
            case KEY_PCL:
                return 0;
            case KEY_POW:
                return 9;
            case KEY_MUL:
                return 8;
            case KEY_DIV:
                return 8;
            case KEY_ADD:
                return 7;
            case KEY_SUB:
                return 6;
            default:
                return 5;
        }
    }
}
