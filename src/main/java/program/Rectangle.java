package program;
//Clase para generar un rectangulo, hereda de figura geometrica
public class Rectangle extends FiguraGeometrica{
    //Declaracion de variables
    java.lang.Integer width;
    java.lang.Integer large;

    //Constructor de rectangulo
    //Un rectangulo posee un largo y un ancho
    public Rectangle(Integer width, Integer large) {
        this.width = width;
        this.large = large;
        this.setName("Rectangle");
    }

    //Metodo para obtener el perimetro de un rectangulo
    @Override
    public Float getPerimeter() {
        return (float)(2*width+2*large);
    }

    //Metodo para obtener el area de un rectangulo
    @Override
    public Float getArea() {
        return (float)(width*large);
    }
}
