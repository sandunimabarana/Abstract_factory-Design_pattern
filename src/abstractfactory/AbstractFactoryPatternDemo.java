/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Ishu
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //ger an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of shape rectangle
        shape1.draw();
         //get an object of Shape square
        Shape shape2 = shapeFactory.getShape("Square");
        //call draw method of shape square
        shape2.draw();
    }
    
}
