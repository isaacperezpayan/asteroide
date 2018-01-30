/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroides;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


/**
 *
 * @author isaac
 */
public class Asteroides extends Application {
short velocidad = 5;

int x = 400;
int y = 350;
int vx = x + velocidad;
int vy = y + velocidad;
int angle;
int propul;
final int SCENE_TAM_X= 800;
final int SCENE_TAM_Y= 600; 
int rotacion=360; //usaremos esta variable para asignar el giro

    @Override
    public void start(Stage primaryStage) {
        Pane root= new Pane();
        Scene scene = new Scene (root, SCENE_TAM_X, SCENE_TAM_Y);
        scene.setFill(Color.BLUE);
        VBox vbox = new VBox();
        vbox.setLayoutX(800);
        vbox.setLayoutY(600);
        AnimationTimer movimiento;
        Polygon nave = new Polygon();
        nave.getPoints().addAll(new Double[]{
            0.0, -40.0,
            -20.0, 20.0,
            20.0, 20.0 });
        nave.setFill(Color.YELLOW);
        nave.getTransforms().add(new Rotate(rotacion,0,00));
        nave.setLayoutX(x);
        nave.setLayoutY(y);
       /* nave.getTransforms().add(new Rotate(30, 50, 30));*/
        primaryStage.setTitle("Nave Espacial");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        root.getChildren().add(nave);
        //AnimationTimer movimiento;
        movimiento = new AnimationTimer(){ 
            
           @Override
            public void handle(long now) {
            
            scene.setOnKeyPressed((KeyEvent event) -> {
               //nave.getTransforms().add(new Rotate(rotacion,0,00)); 
                
                   switch(event.getCode()){
                   case RIGHT:
                       //Pulsada tecla DERECHA
                       angle = angle+90;
                       if (angle>=360) {
                        angle = 0;
                        nave.setLayoutY(y);
                        }
                       break;
                   case LEFT:
                       //Pulsada tecla IZQUIERDA
                       angle = angle-90;
                       if (angle == -90){
                           angle = 270;
                           x--;
                        nave.setLayoutX(x); 
                        }
                       break;
                       
                
                   
                   case UP:
                       //Pulsada tecla ARRIBA
                       /*if (angle>=360) {
                        angle = 0;
                        nave.setLayoutY(y);
                        }
                        if (angle == -90){
                           angle = 270;
                           x--;
                        nave.setLayoutX(x); 
                        }*/
                    
                        if (angle ==00){
                           y-=velocidad; 
                        nave.setLayoutY(y); 
                        }
                        
                        if (angle ==90){
                           x+=velocidad;
                        nave.setLayoutX(x); 
                        }
                        if (angle ==180){
                           y+=velocidad;
                        nave.setLayoutY(y); 
                        }
                        if (angle ==270){
                           x-=velocidad;
                        nave.setLayoutX(x); 
                        }
                       break;
                       
                    }  
                scene.setOnKeyReleased((KeyEvent event) -> {
                    
                });
                nave.setRotate(angle);
                System.out.println(angle);
            });
                      
          }
        }; //at
      movimiento.start();
    }
        

      
        
        
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    
    
    }
}