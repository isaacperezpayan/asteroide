
package asteroides;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class asteroide {
Circle asteroide = new Circle();
double radio= 50;
double ax;
double ay;

    public asteroide(){
        asteroide = new Circle();
        asteroide.setCenterX(ax);
        asteroide.setCenterY(ay);
        asteroide.setRadius(radio);
        asteroide.setFill(Color.BROWN);
    }
}
