
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

public class Misil {
    Nave nave = new Nave();
    private double velocidadabmi =10;
    public double mix = nave.x;
    public double miy = nave.y;
    private double angulo;
    private double rotacion=90;
    public Circle formaMisil;
    private double velocidadmix;
    private double velocidadmiy;
    double radio= 50;
    double angle;
    
    // Indicar por parámetro dónde se debe crear el misil
    public Misil() {
        formaMisil = new Circle();
        formaMisil.setFill(Color.WHITE);
        formaMisil.setRadius(2.0f);
        formaMisil.setFill(Color.WHITE);
        formaMisil.getTransforms().add(new Rotate(rotacion,0,00));
        formaMisil.setCenterX(mix);
        formaMisil.setCenterY(miy);
    }
    
    public Circle getFormaMisil(){
        return formaMisil;
    }
    
    public double posicionMisilX() {
        mix += velocidadmix;
        formaMisil.setLayoutX(mix);
        angulo = Math.toRadians(angle) ;
        velocidadmix= Math.cos(angulo) * velocidadabmi;
        return mix;
    }
    
    public double posicionMisilY() {
        miy +=velocidadmiy;
        formaMisil.setLayoutY(miy);
        angulo = Math.toRadians(angle) ;
        velocidadmiy = Math.sin(angulo) * velocidadabmi;
        return miy;
    }
    

    
    public void disparo(){
        mix += velocidadmix;
        formaMisil.setLayoutX(mix);
        miy +=velocidadmiy;
        formaMisil.setLayoutY(miy);
        angulo = Math.toRadians(angle) ;
        velocidadmix=Math.cos(angulo) * velocidadabmi;
        velocidadmiy=Math.sin(angulo) * velocidadabmi;
        
    } 
    
    public void disparoAsteroide(){
        if (mix == radio){
            /*asteroide.setVisible(false);*/
        }
    }
}
