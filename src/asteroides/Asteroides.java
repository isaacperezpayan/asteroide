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
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import java.util.ArrayList;


/**
 *
 * @author isaac
 */
public class Asteroides extends Application {


Misil misil;
double angulo;
double ax =100;
double ay=100;
public static Nave nave = new Nave();

double velocidadmisil;

//Polygon poligonoNave = new Polygon();
Circle asteroide = new Circle();
/*Circle misil = new Circle();*/
public static final int SCENE_TAM_X= 800;
public static final int SCENE_TAM_Y= 600; 
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
        ArrayList <Misil> misiles = new ArrayList();
        
     
       
       /* nave.getTransforms().add(new Rotate(30, 50, 30));*/
        primaryStage.setTitle("Nave Espacial");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        root.getChildren().add(nave.getPoligonoNave());
        
        
        
        
       
        //AnimationTimer movimiento;
        movimiento = new AnimationTimer(){ 
            
           @Override
            public void handle(long now) {
            nave.movimiento();
            nave.naveBordes();
            misil.moverMisil();
            
            
            
            }
        };
               scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode()){
                    case RIGHT:
                        nave.giroDerecha();
                        break;
                        
                    case LEFT:
                        nave.giroIzquierda();
                        break;
                        
                    case UP:
                        nave.naveAcelerar();
                        break;
                        
                    case SPACE:
                        
                        misiles.add(misil);
                        misil = new Misil(nave.x, nave.y);
                        misil.disparo();
                        root.getChildren().add(misil.getFormaMisil());
                        break;
                        
                        
                    case DOWN:
                        nave.naveFrenar();
                        break;
                }
            }
        }); 
             movimiento.start();
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