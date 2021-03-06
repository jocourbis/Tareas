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

public class ejemplos_codigos extends PApplet {

// Ejemplo codigo ondas
/*
float px, py, px2, py2;
float angle, angle2;
float radius = 90;
float frequency = 2;
float frequency2 = 2;
float x, x2;

void setup(){
  size(400, 250);
  background (0);
}
   void draw(){
  fill(0,10);
rect(0,0,width, height);
  noStroke();
  fill(random(#1442C6),random(#FF3429),random(#14DB1F));

  px = width/8 + cos(radians(angle))*(radius);
  py = 150 + sin(radians(angle))*(radius);

  fill(#1D5BDE,60,150);

  angle2 = 0;

  for (int i = 0; i< width; i++){
    px2 = width/8 + cos(radians(angle2))*(radius);
    py2 = 70 + sin(radians(angle2))*(radius);
    point(width/radius+i, py2);
    angle2 -= frequency2;
  }

  noStroke();
  ellipse(width/radius+x, py, 40, 40);
  angle -= frequency;
  x+=1;

  if (x>= width-60) {
    x = 0;
    angle = 0;
  }

}

*/

/*

// codigo coseno

float a = 0.0;
float inc = TWO_PI/25.0;
for (int i = 0; i < 25; i++) {
  line(i*4, 50, i*4, 50+cos(a)*40.0);
  a = a + inc;
}

//codigo seno

float a = 0.0;
float inc = TWO_PI/25.0;

for (int i = 0; i < 100; i=i+4) {
  line(i, 50, i, 50+sin(a)*40.0);
  a = a + inc;
}
*/

//CODIGO BASE LOGRADO PARA LA ENTREGA DEL CERTAMEN

float p = 0;        //variable para posicion y
float s = 0;        // variable para posicion x
int c1 = color(255, 83, 13);
int c2 = color(255);


public void setup(){
  
  background (0);

}


public void draw (){

  background(0);
/*
ellipse(300,height/2 + sin(p)*100, 30, 25);    // la posicion de y es = a la altura partido 2 mas el seno de la variable p * 100
ellipse(340,height/2 + sin(p + 1)*100, 30, 25);
ellipse(380,height/2 + sin(p + 2)*100, 30, 25);
ellipse(310,height/2 + cos(p)*100, 30, 25);    // la posicion de y es = a la altura partido 2 mas el coseno de la variable p * 100
ellipse(350,height/2 + cos(p + 1)*100, 30, 25);
ellipse(390,height/2 + cos(p + 2)*100, 30, 25);
*/
lerpColor(c1, c2, 0.5f);
rect(480,295 + cos(p + 1.5f)*50, 50,150, 25, 25, 25, 25 );
rect(440,280 + cos(p + 0.5f)*50, 50,150, 25, 25, 25, 25 );
rect(400,300 + cos(p)*50, 50,150, 25, 25, 25, 25 );
rect(460,320 + cos(p + 1)*50, 50,150, 25, 25, 25, 25 );
rect(390,320+ sin(p + 0.5f)*50, 50,150, 25, 25, 25, 25 );
rect(430,320+ sin(p)*50, 50,150, 25, 25, 25, 25 );
 p = p + 0.055f;
 //s = s + 3;


}
  public void settings() {  size (800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ejemplos_codigos" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
