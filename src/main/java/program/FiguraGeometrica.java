package program;

public abstract class FiguraGeometrica {
    //Declaracion de variables
    java.lang.String name;

    //Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Métodos abstractos que permiten obtener el perimetro y area de cualquier figura geometrica que herede de esta clase.
    public abstract java.lang.Float getPerimeter();
    public abstract java.lang.Float getArea();
}