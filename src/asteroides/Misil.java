
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

public class Misil {
    private double velocidadabmi=10;
    public double mix ;
    public double miy ;
    private double angulo;
    private double rotacion=90;
    public Circle formaMisil;
    private double velocidadmix;
    private double velocidadmiy;
    double radio= 50;
    double angle;
    
    // Indicar por parámetro dónde se debe crear el misil
    public Misil(double x, double y) {
        formaMisil = new Circle();
        formaMisil.setFill(Color.WHITE);
        formaMisil.setRadius(10.0);
        formaMisil.setFill(Color.WHITE);
        formaMisil.getTransforms().add(new Rotate(rotacion,0,00));
        formaMisil.setCenterX(mix);
        formaMisil.setCenterY(miy);
        mix = x;
        miy = y;
        formaMisil.setLayoutX(x);
        formaMisil.setLayoutY(y);
        
    }
    
    public Circle getFormaMisil(){
        return formaMisil;
    }
    

    
    public void disparo(){
        angulo = Math.toRadians(angle) ;
        velocidadmix=Math.cos(angulo) * velocidadabmi;
        formaMisil.setLayoutX(mix);
        mix += velocidadmix;
        velocidadmiy=Math.sin(angulo) * velocidadabmi;
        formaMisil.setLayoutY(miy);
        miy += velocidadmiy;
    } 
    
    public void moverMisil(){
        formaMisil.setLayoutX(mix);
        mix += velocidadmix;
        formaMisil.setLayoutY(miy);
        miy += velocidadmiy;
    }
    
    public double getMisilX(){
        return formaMisil.getLayoutX();
    }
    
    public double getMisilY(){
        return formaMisil.getLayoutY();
    }
    
    public void disparoAsteroide(){
        if (mix == radio){
            /*asteroide.setVisible(false);*/
        }
    }
    
}
