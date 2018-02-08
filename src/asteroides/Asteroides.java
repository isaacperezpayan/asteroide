/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroides;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


/**
 *
 * @author isaac
 */
public class Asteroides extends Application {
double velocidadx;
double velocidady;
double velocidadmix=3;
double velocidadmiy=3;
double angle;
double velocidadab =3;
double velocidadabmi =6;
double x = 400;
double y = 350;
double mix;
double miy;
double angulo;
//int cose = x /angle;
double velocidadmisil;
double direccionx;
double direcciony;
int propul;
Circle misil = new Circle();
final int SCENE_TAM_X= 800;
final int SCENE_TAM_Y= 600; 
int rotacion=90; //usaremos esta variable para asignar el giro


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
        
        misil.setRadius(2.0f);
        misil.setFill(Color.WHITE);
        
        misil.getTransforms().add(new Rotate(rotacion,0,00));
       /* nave.getTransforms().add(new Rotate(30, 50, 30));*/
        primaryStage.setTitle("Nave Espacial");
        primaryStage.setScene(scene);
        primaryStage.show();
        /*root.getChildren().add(misil);*/
        root.getChildren().add(nave);
        
        //AnimationTimer movimiento;
        movimiento = new AnimationTimer(){ 
            
           @Override
            public void handle(long now) {
          
           x += velocidadx;
           nave.setLayoutX(x);

           y +=velocidady;
           nave.setLayoutY(y);
          
           mix+=velocidadmix;
           misil.setLayoutX(mix);
           miy+=velocidadmiy;
           misil.setLayoutY(miy);
           
           angulo = Math.toRadians(angle) ;
           velocidadx=Math.cos(angulo) * velocidadab;
           velocidady=Math.sin(angulo) * velocidadab;
           
            
           //traspaso de la nave por los bordes
           if (x<0){
             x = SCENE_TAM_X;  
           }
           if (x>SCENE_TAM_X){
             x = 0;  
           }
           if (y<0){
             y = SCENE_TAM_Y;  
           }
           if (y>SCENE_TAM_Y){
             y = 0;  
           }    
          }
        };
        scene.setOnKeyPressed((KeyEvent event) -> {
               //nave.getTransforms().add(new Rotate(rotacion,0,00)); 
                
                   switch(event.getCode()){
                   case RIGHT:
                       //Pulsada tecla DERECHA
                       angle = angle+10;
                       if (angle>=360) {
                        angle = 0;
                        velocidadab -= 2; 
                        nave.setLayoutX(x);
                        misil.setLayoutX(mix);
                        }
                       break;
                   case LEFT:
                       //Pulsada tecla IZQUIERDA
                       angle = angle-10;
                       if (angle == -90){
                           angle = 270;
                        velocidadab -= 2;   
                        nave.setLayoutX(x);
                        misil.setLayoutX(mix);
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
                    
                           
                           
                         velocidadab +=3;
                        
                   
                        
                       break;
                       
                   case DOWN:
                       velocidadab -=3;
                       break;
                       
                   case SPACE:
                        misil = new Circle();
                        misil.setRadius(2.0f);
                        misil.setFill(Color.WHITE);
                        velocidadmix=Math.cos(angulo) * velocidadabmi;
                        velocidadmiy=Math.sin(angulo) * velocidadabmi;
                        mix=x;
                        miy=y;
                        misil.getTransforms().add(new Rotate(rotacion,0,00));
                        misil.setLayoutX(mix);
                        misil.setLayoutY(miy);
                        root.getChildren().add(misil);
                        
                        
                       break;
                    }  
                nave.setRotate(angle);
                
            });
            scene.setOnKeyReleased((KeyEvent event) -> {
                  
                }); 
        
        System.out.println(angle);//at
      movimiento.start();
    }
        

      
        
        
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    
    
    }
}