
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;


public class Misil {
    private double velocidadabmi =10;
    private double mix;
    private double miy;
    private double angulo;
    private double rotacion=90;
    private Circle misil;
    private double velocidadmix;
    private double velocidadmiy;
    
    // Indicar por parámetro dónde se debe crear el misil
    public Misil() {
        Circle misil = new Circle();
        misil.setFill(Color.WHITE);
        misil.setRadius(2.0f);
        misil.setFill(Color.WHITE);
        misil.getTransforms().add(new Rotate(rotacion,0,00));
    }
    
    public void posicionMisilX() {
        mix+=velocidadmix;
        misil.setLayoutX(mix);
        velocidadmix=Math.cos(angulo) * velocidadabmi;
    }
    
    public void posicionMisilY() {
        miy += velocidadmiy;
        misil.setLayoutY(miy);
        velocidadmiy = Math.sin(angulo) * velocidadabmi;
    }
    
    public void disparo(){
        velocidadmiy=Math.sin(angulo) * velocidadabmi;
        mix= x;
        miy= y;
        misil.getTransforms().add(new Rotate(rotacion,0,00));
        misil.setLayoutX(mix);
        misil.setLayoutY(miy);
    } 
}
