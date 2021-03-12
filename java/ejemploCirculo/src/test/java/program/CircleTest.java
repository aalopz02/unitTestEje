package program;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


/**
 * Unit test for Circle
 */
public class CircleTest 
{
    private Circle circle;

    @BeforeEach                                         
    public void setUp() throws Exception {
        circle = new Circle(5);
    }

    @Test                                               
    @DisplayName("Circle Name not null")   
    public void testNameNotNull() {
        assertNotNull(circle.name,      
        "Name Circle Not Null");          
    }
    
    @Test                                               
    @DisplayName("Circle Name")   
    public void testName() {
        assertEquals(circle.name,      
        "Circle");          
    }

    @Test                              
    @DisplayName("Circle radius integer")
    public void testRadiusInteger() {
        assertTrue(circle.radius instanceof java.lang.Integer);
         }

    @Test                              
    @DisplayName("Circle Area Test ")
    public void testArea() {
        assertEquals((double) java.lang.Math.PI*java.lang.Math.pow(5,2), (double) circle.getArea());
        }

    
    @RepeatedTest(3)                                    
    @DisplayName("Circle Area Test repeated test")
    public void testAreaRepeated() {
        assertEquals((double)  java.lang.Math.round(java.lang.Math.PI*java.lang.Math.pow(5,2)*100)/100, (double) java.lang.Math.round(circle.getArea()*100)/100);
       }


       @Test   
       @DisplayName("Circle Points multiple Test")
       public void testPointsMultiple() {
           assertEquals((double) java.lang.Math.round((double)(java.lang.Math.sqrt(java.lang.Math.pow(circle.radius,2)-java.lang.Math.pow(1.0,2)))*100)/100, (double) java.lang.Math.round((double) circle.getcirclePoint(1.0)*100)/100);
           assertEquals((double) java.lang.Math.round((double)(java.lang.Math.sqrt(java.lang.Math.pow(circle.radius,2)-java.lang.Math.pow(2.0,2)))*100)/100, (double) java.lang.Math.round((double) circle.getcirclePoint(2.0)*100)/100);
           assertEquals((double) java.lang.Math.round((double)(java.lang.Math.sqrt(java.lang.Math.pow(circle.radius,2)-java.lang.Math.pow(5.0,2)))*100)/100, (double) java.lang.Math.round((double) circle.getcirclePoint(5.0)*100)/100);  
        }

    @Test   
    @DisplayName("Circle Perimeter multiple Test")
    public void testPerimeterMultiple() {
        assertEquals((double) java.lang.Math.round((double)(2* java.lang.Math.PI*5)*100)/100, (double)  java.lang.Math.round((double) circle.getPerimeter()*100)/100);
        assertEquals((double) java.lang.Math.round((double)(2* java.lang.Math.PI*4)*100)/100, (double)  java.lang.Math.round((double) circle.getPerimeter()*100)/100);   }


        
    @Test                              
    @DisplayName("Circle radius integer ")
    public void testRadiusIntegermultiple() {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
       
        assertEquals(1, (int) circle1.radius);
        assertEquals(2, (int)circle2.radius);
        assertEquals(3, (int)circle3.radius);
         }
}

