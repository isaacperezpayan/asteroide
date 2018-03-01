
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;


public class Nave {
    public double mix;
    public double miy;
    private double velocidadx;
    private double velocidady;
    private double angle;
    public double x = 400;
    public double y = 350;
    private double direccionx;
    private double direcciony;
    private int propul;
    private int rotacion=90;
    public double velocidadab ;
    public Polygon poligonoNave;
    private double angulo;
   
    
    public Nave(){
        poligonoNave = new Polygon();
        poligonoNave.getPoints().addAll(new Double[]{
            0.0, -40.0,
            -20.0, 20.0,
            20.0, 20.0 });
        poligonoNave.setFill(Color.YELLOW);
        poligonoNave.getTransforms().add(new Rotate(rotacion,0,00));
        poligonoNave.setLayoutX(x);
        poligonoNave.setLayoutY(y);            
    }
    
    public Polygon getPoligonoNave() {
        return poligonoNave;
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
    
    public void movimiento(){
        x += velocidadx;
        poligonoNave.setLayoutX(x);
        y +=velocidady;
        poligonoNave.setLayoutY(y);
        angulo = Math.toRadians(angle) ;
        velocidadx=Math.cos(angulo) * velocidadab;
        velocidady=Math.sin(angulo) * velocidadab;
    }   
    
    public void naveAcelerar(){
        velocidadab +=3;
    }
    
    public void naveFrenar(){
        velocidadab -=1;
    }
    
    public void naveBordes(){
        if (x<0){
               x = Asteroides.SCENE_TAM_X;  
             }
            if (x>Asteroides.SCENE_TAM_X){
              x = 0;  
            }
            if (y<0){
              y = Asteroides.SCENE_TAM_Y;  
            }
            if (y>Asteroides.SCENE_TAM_Y){
              y = 0;  
            }
    }
    
    public void giroDerecha(){
        
        angle += 10;
        
        poligonoNave.setRotate(angle);
    }
        
    public void giroIzquierda(){
        angle -= 10;
        
        poligonoNave.setRotate(angle);
    }
        
}

