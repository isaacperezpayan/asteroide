
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

public class Misil {
    Nave nave = new Nave();
    private double velocidadabmi =10;
    public double mix;
    public double miy;
    private double angulo;
    private double rotacion=90;
    private Circle formaMisil;
    private double velocidadmix;
    private double velocidadmiy;
    double radio= 50;
    
    // Indicar por parámetro dónde se debe crear el misil
    public Misil() {
        formaMisil = new Circle();
        formaMisil.setFill(Color.WHITE);
        formaMisil.setRadius(2.0f);
        formaMisil.setFill(Color.WHITE);
        formaMisil.getTransforms().add(new Rotate(rotacion,0,00));
    }
    
    public void posicionMisilX() {
        mix +=velocidadmix;
        formaMisil.setLayoutX(mix);
        velocidadmix=Math.cos(angulo) * velocidadabmi;
    }
    
    public void posicionMisilY() {
        miy += velocidadmiy;
        formaMisil.setLayoutY(miy);
        velocidadmiy = Math.sin(angulo) * velocidadabmi;
    }
    
    public Circle getFormaMisil(){
        return formaMisil;
    }
    
    public void disparo(){
        velocidadmix=Math.cos(angulo) * velocidadabmi;
        
        
        formaMisil.getTransforms().add(new Rotate(rotacion,0,00));
        formaMisil.setLayoutX(mix);
        formaMisil.setLayoutY(miy);
    } 
    
    public void disparoAsteroide(){
        if (mix == radio){
            /*asteroide.setVisible(false);*/
        }
    }
}
