
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;


public class Nave {
    private double velocidadx;
    private double velocidady;
    private double angle;
    private double x = 400;
    private double y = 350;
    private double direccionx;
    private double direcciony;
    private int propul;
    private int rotacion=90;
    private double velocidadab =3;
    private Polygon poligonoNave;
    private double angulo;
    
    public void nave(){
            Polygon poligonoNave = new Polygon();
            poligonoNave.getPoints().addAll(new Double[]{
                0.0, -40.0,
                -20.0, 20.0,
                20.0, 20.0 });
            poligonoNave.setFill(Color.YELLOW);
            poligonoNave.getTransforms().add(new Rotate(rotacion,0,00));
            poligonoNave.setLayoutX(x);
            poligonoNave.setLayoutY(y);
    }
    
    public double posicionNaveX(){
        x += velocidadx;
        poligonoNave.setLayoutX(x);
        angulo = Math.toRadians(angle) ;
        velocidadx= Math.cos(angulo) * velocidadab;
        return x;
    }
    
    public double posicionNaveY(){
        y +=velocidady;
        poligonoNave.setLayoutY(y);
        angulo = Math.toRadians(angle) ;
        velocidady = Math.sin(angulo) * velocidadab;
        return y;
    }
    
    public void giroDerecha(){
        
    }
}
