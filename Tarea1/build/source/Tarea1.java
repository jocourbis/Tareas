import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Tarea1 extends PApplet {


float n = 0;


public void setup()
{


}

public void draw()
{
background(0);


/*

ellipse(width/2 + cos(n) * 100, height/2 + sin(n) * 100, 20, 20);
  n = n + 0.5;

*/



translate(width/2, height/2);                    // punto (0,0)/ ORIGEN en el centro del sketch
for(int i = 0; i < 360; i+=50.5f){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*10;               // variable de rotacion
    float y = cos(radians(i))*10;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(radians(-i+frameCount));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(255));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,10,10);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

   for(int i = 0; i < 360; i+=15.5f){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
       float x = sin(radians(i))*50;               // variable de rotacion
       float y = cos(radians(i))*50;               // variable de rotacion
       pushMatrix();                                // Abriendo propiedades independientes
       translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
       rotate(radians(-i-frameCount+90));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
       fill(random(150),random(255), random(50));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
       ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
       popMatrix();                                 // Cerrando propiedades independientes
}

for(int i = 0; i < 360; i+=8.5f){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*100;               // variable de rotacion
    float y = cos(radians(i))*100;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(radians(-i-frameCount+90));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(255),random(50), random(150));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

for(int i = 0; i < 360; i+=5.5f){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*150;               // variable de rotacion
    float y = cos(radians(i))*150;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(radians(-i-frameCount+90));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(50),random(150), random(255));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}


}
class Tarea{

int x;                     // posición x
int y;                    // posición y
float r, g, b;                 // colores
int h;                        // height
int w;                       // width



Tarea(int x, int y, int h, int w, float r, float g, float b){

   this.x = x;
   this.y = y;
   this.h = h;
   this.w = w;
   this.r = r;
   this.g = g;
   this.b = b;

}

public void circulo(int x, int y, int h, int w){
  ellipse(x,y,w,h);
}


public void relleno(float r, float g, float b){
  fill(r,g,b);
}

public void girar(){
  
}

}
  public void settings() { 
size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Tarea1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
