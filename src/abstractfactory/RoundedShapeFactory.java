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
public class RoundedShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new RoundedRectangle();
        }else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new RoundedSquare();
        }
        return null;
    }
    
}
