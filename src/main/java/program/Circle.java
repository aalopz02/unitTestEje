package program;


// Clase circulo que hereda de Figura Geometrica
public class Circle extends FiguraGeometrica{
    //Declaracion de variables
    java.lang.Integer radius;

    // Constructor del circulo
    //Tod* circulo posee un radio
    public Circle(Integer radius) {
        this.radius = radius;
        this.setName("Circle");
    }

    public Float getcirclePoint(Double point){
        return (float) java.lang.Math.sqrt(java.lang.Math.pow(radius,2)-java.lang.Math.pow(point,2));
    }

    // Metodo para obtener el perimetro del circulo
    @Override
    public Float getPerimeter() {
        return (float) (2* java.lang.Math.PI*radius);
    }

    // Metodo para obtener el area del circulo
    @Override
    public Float getArea() {
        return (float) (java.lang.Math.PI*java.lang.Math.pow(radius,2));
    }
}