package es.cice.Colecciones;

public class Coche {

    private String color;

    public Coche(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        return color.equals(coche.color);
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
}
