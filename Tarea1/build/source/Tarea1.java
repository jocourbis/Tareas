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

Tarea t;
int x;
int y;
int h, tamY;
int w, tamX;
int r = 29;
int g = 10;
int b = 255;

boolean a = false;

public void setup()
{

background(0);
t = new Tarea(x, y, h, w, r, g, b);
}

public void draw()
{
println(tamX,h);

h++;
w++;

if (h > 200){
  h = 0;
  w = 0;
}

if (tamX > 200){
  tamX = 0;
  tamY = 0;
}

t.kk(r, g, b, w, h);
t.kk3(r, g, b, w, h);
t.kk5(r, g, b, w, h);
t.kk7(r, g, b, w, h);
t.kk9(r, g, b, w, h);
t.kk11(r, g, b, w, h);
t.kk13(r, g, b, w, h);
t.kk15(r, g, b, w, h);
t.kk17(r, g, b, w, h);
t.kk19(r, g, b, w, h);
t.kk21(r, g, b, w, h);
t.kk23(r, g, b, w, h);


if (h >= 100){
  a = true;

}

if (a == true){
  t.kk2(tamX, tamY);
  t.kk4(tamX, tamY);
  t.kk6(tamX, tamY);
  t.kk8(tamX, tamY);
  t.kk10(tamX, tamY);
  t.kk12(tamX, tamY);
  t.kk14(tamX, tamY);
  t.kk16(tamX, tamY);
  t.kk18(tamX, tamY);
  t.kk20(tamX, tamY);
  t.kk22(tamX, tamY);
  t.kk24(tamX, tamY);
  tamX = tamY+1;
  tamY = tamY+1;

}
/*

ellipse(width/2 + cos(n) * 100, height/2 + sin(n) * 100, 20, 20);
  n = n + 0.5;

*/

/*

translate(width/2, height/2);                    // punto (0,0)/ ORIGEN en el centro del sketch
for(int i = 0; i < 842; i+=50){
                // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*10;               // variable de rotacion
    float y = cos(radians(i))*10;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(radians(-i+frameCount));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(255));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,10,10);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

   for(int i = 0; i < 360; i+=15.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
       float x = sin(radians(i))*50;               // variable de rotacion
       float y = cos(radians(i))*50;               // variable de rotacion
       pushMatrix();                                // Abriendo propiedades independientes
       translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
       rotate(radians(-i-frameCount+90));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
       fill(random(150),random(255), random(50));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
       ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
       popMatrix();                                 // Cerrando propiedades independientes
}

for(int i = 0; i < 360; i+=8.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*100;               // variable de rotacion
    float y = cos(radians(i))*100;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(radians(-i-frameCount+90));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(255),random(50), random(150));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

for(int i = 0; i < 360; i+=5.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*150;               // variable de rotacion
    float y = cos(radians(i))*150;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(radians(-i-frameCount+90));              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(50),random(150), random(255));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}
*/

//como hacer que un circulo vaya creciendo y que dentro vaya creciendo otro círculo


}
class Tarea{

int x;                     // posición x
int y;                    // posición y
float r, g, b;                 // colores
int h;                        // height
int w;                       // width
int tamX;                   // varia tamaño x
int tamY;                  // varia tamaño y


Tarea(int x, int y, int h, int w, float r, float g, float b){

   this.x = x;
   this.y = y;
   this.h = h;
   this.w = w;
   this.r = r;
   this.g = g;
   this.b = b;
   this.tamX = tamX;
   this.tamY = tamY;

}






public void kk(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(125, 100, tamX, tamY);
}

public void kk2( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(125, 100, tamX, tamY);

}

public void kk3(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(125, 300, tamX, tamY);
}

public void kk4( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(125, 300, tamX, tamY);

}

public void kk5(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(125, 500, tamX, tamY);
}

public void kk6( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(125, 500, tamX, tamY);

}

public void kk7(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(325, 100, tamX, tamY);
}

public void kk8( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(325, 100, tamX, tamY);

}
public void kk9(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(325, 300, tamX, tamY);
}

public void kk10( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(325, 300, tamX, tamY);

}

public void kk11(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(325, 500, tamX, tamY);
}

public void kk12( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(325, 500, tamX, tamY);

}

public void kk13(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(525, 100, tamX, tamY);
}

public void kk14( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(525, 100, tamX, tamY);

}

public void kk15(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(525, 300, tamX, tamY);
}

public void kk16( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(525, 300, tamX, tamY);

}
public void kk17(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(525, 500, tamX, tamY);
}

public void kk18( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(525, 500, tamX, tamY);

}

public void kk19(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(725, 100, tamX, tamY);
}

public void kk20( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(725, 100, tamX, tamY);

}

public void kk21(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(725, 300, tamX, tamY);
}

public void kk22( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(725, 300, tamX, tamY);

}

public void kk23(float r, float g, float b, int tamX, int tamY){
  stroke(r, g, b);
  noFill();
  ellipseMode(CENTER);
  ellipse(725, 500, tamX, tamY);
}

public void kk24( int tamX, int tamY){
strokeWeight(30);
stroke(255, 83, 13);
noFill();
ellipseMode(CENTER);
ellipse(725, 500, tamX, tamY);

}


}
  public void settings() { 
size(842,595); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Tarea1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
