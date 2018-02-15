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
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


/**
 *
 * @author isaac
 */
public class Asteroides extends Application {



double angulo;
double ax =100;
double ay=100;

double velocidadmisil;

//Polygon poligonoNave = new Polygon();
Circle asteroide = new Circle();
Circle misil = new Circle();
final int SCENE_TAM_X= 800;
final int SCENE_TAM_Y= 600; 
 //usaremos esta variable para asignar el giro


    @Override
    public void start(Stage primaryStage) {
        Pane root= new Pane();
        Scene scene = new Scene (root, SCENE_TAM_X, SCENE_TAM_Y);
        scene.setFill(Color.BLUE);
        scene.getStylesheets().add("resources/css/estilos.css");
        scene.getStylesheets().add(getClass().getResource("resources/css/estilos.css").toExternalForm());
        VBox vbox = new VBox();
        vbox.setLayoutX(800);
        vbox.setLayoutY(600);
        AnimationTimer movimiento;
        
        
     
       
       /* nave.getTransforms().add(new Rotate(30, 50, 30));*/
        primaryStage.setTitle("Nave Espacial");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Nave nave = new Nave();
        root.getChildren().add(nave.getPoligonoNave());
        
        //AnimationTimer movimiento;
        movimiento = new AnimationTimer(){ 
            
           @Override
            public void handle(long now) {
            /*nave.giroDerecha();
            nave.giroIzquierda();*/
            scene.setOnKeyPressed((KeyEvent event) -> {
                 switch(event.getCode()){
                   case RIGHT:
                       System.out.println("teclev dere");
                       //Pulsada tecla DERECHA
                       nave.giroDerecha();
                       break;
                       
                   case LEFT:
                       nave.giroIzquierda();
                       break;
                      
                 }
            });
            
            
            }
        };
                
 }
}
          /* if (Colision(misil,asteroide)){
                asteroide.setVisible(false);
            }  
           
           
           if (Colisionnave(nave,asteroide)){
               nave.setVisible(false);
           }
            
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
          }*/
       
        
                
       /* scene.setOnKeyPressed((KeyEvent event) -> {
               //nave.getTransforms().add(new Rotate(rotacion,0,00)); 
                
                   switch(event.getCode()){
                   case RIGHT:
                       //Pulsada tecla DERECHA
                       
                   case LEFT:
                       //Pulsada tecla IZQUIERDA
                       
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
                    
                           
                           
                       /*  velocidadab +=3;
                        
                   
                        
                       break;
                       
                   case DOWN:
                       velocidadab -=3;
                       break;
                       
                   case SPACE:
                        
                        // Crear el misial indicando su posición (la de la nave)
                        
                        
                        
                        
                        
                       break;
                    }  
               /* nave.setRotate(angle);
                root.getChildren().add(misil);
            });
            scene.setOnKeyReleased((KeyEvent event) -> {
                  
                }); 
        
        System.out.println(angle);//at
      movimiento.start();
    }
        
     private boolean Colision(Circle misil, Circle asteroide){
        if (Shape.intersect(misil, asteroide).getBoundsInLocal().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
      
     private boolean Colisionnave(Polygon nave, Circle asteroide){
        if (Shape.intersect(nave, asteroide).getBoundsInLocal().isEmpty()){
            return false;
        }else{
            return true;
        }
    }   
        
        */
        
    

    /**
     * @param args the command line arguments
     *//*
    public static void main(String[] args) {
        launch(args);
    
    
    }
}*/