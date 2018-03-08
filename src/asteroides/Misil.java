
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

public class Misil {
    public double velocidadabmi =4;
    public double mix ;
    public double miy ;
    public double angulo;
    private double rotacion=90;
    public Circle formaMisil;
    private double velocidadmix;
    private double velocidadmiy;
    double radio= 50;
    public double angle;
    
    // Indicar por parámetro dónde se debe crear el misil
    public Misil(double x, double y, double angle) {
        mix = x;
        miy = y;
        this.angle = angle;
        formaMisil = new Circle();
        formaMisil.setFill(Color.WHITE);
        formaMisil.setRadius(10.0);
        formaMisil.setFill(Color.WHITE);
        //formaMisil.getTransforms().add(new Rotate(rotacion,0,00));
        formaMisil.setCenterX(mix);
        formaMisil.setCenterY(miy);
    }
    
    public Circle getFormaMisil(){
        return formaMisil;
    }
    

    
    public void disparo(){
        angulo = Math.toRadians(angle) ;
        velocidadmiy = Math.sin(angulo) * velocidadabmi;
        velocidadmix = Math.cos(angulo) * velocidadabmi;
        mix += velocidadmix;
        System.out.println("velocidadmix "+velocidadmix);
        System.out.println("mix "+mix);
        formaMisil.setCenterX(mix);
        miy += velocidadmiy;
        formaMisil.setCenterY(miy);
    } 
    
    public void moverMisil(){
        formaMisil.setCenterX(mix);
        mix += velocidadmix;
        formaMisil.setCenterY(miy);
        miy += velocidadmiy;
        angulo = Math.toRadians(angle) ;
        
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
