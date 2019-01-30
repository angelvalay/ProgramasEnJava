package Practicas;

public class MiClaseB extends MiClaseA{
    private String color;

    public MiClaseB(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String toString() {
        return "MiClaseB{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
