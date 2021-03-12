package program;

public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Rectangle rectangle=new Rectangle(5,10);
     

        System.out.println("Figura: "+circle.getName()+","+"Perímetro: "+circle.getPerimeter()+","+"Área: "+circle.getArea());
         System.out.println("Figura: "+rectangle.getName()+","+"Perímetro: "+rectangle.getPerimeter()+","+"Área: "+rectangle.getArea());
    
    }

}