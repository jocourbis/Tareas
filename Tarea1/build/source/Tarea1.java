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
int velocidad = 1;

boolean a = false;

public void setup()
{

background(0);
t = new Tarea(x, y, h, w, r, g, b);
}

public void draw()
{
println(tamX,h);


h = h + velocidad;
w = w + velocidad;


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

}

public void keyPressed(){
  if (keyPressed){
    if (key == 's'){
    velocidad = 2;
    }
  }
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
  stroke(29, 250, 255);
  noFill();
  ellipseMode(CENTER);
  ellipse(125, 300, tamX, tamY);
}

public void kk4( int tamX, int tamY){
strokeWeight(30);
stroke(255, 30, 232);
noFill();
ellipseMode(CENTER);
ellipse(125, 300, tamX, tamY);

}

public void kk5(float r, float g, float b, int tamX, int tamY){
  stroke(255);
  noFill();
  ellipseMode(CENTER);
  ellipse(125, 500, tamX, tamY);
}

public void kk6( int tamX, int tamY){
strokeWeight(30);
stroke(0);
noFill();
ellipseMode(CENTER);
ellipse(125, 500, tamX, tamY);

}

public void kk7(float r, float g, float b, int tamX, int tamY){
  stroke(255);
  noFill();
  ellipseMode(CENTER);
  ellipse(325, 100, tamX, tamY);
}

public void kk8( int tamX, int tamY){
strokeWeight(30);
stroke(0);
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
  stroke(29, 250, 255);
  noFill();
  ellipseMode(CENTER);
  ellipse(325, 500, tamX, tamY);
}

public void kk12( int tamX, int tamY){
strokeWeight(30);
stroke(255, 30, 232);
noFill();
ellipseMode(CENTER);
ellipse(325, 500, tamX, tamY);

}

public void kk13(float r, float g, float b, int tamX, int tamY){
  stroke(29, 250, 255);
  noFill();
  ellipseMode(CENTER);
  ellipse(525, 100, tamX, tamY);
}

public void kk14( int tamX, int tamY){
strokeWeight(30);
stroke(255, 30, 232);
noFill();
ellipseMode(CENTER);
ellipse(525, 100, tamX, tamY);

}

public void kk15(float r, float g, float b, int tamX, int tamY){
  stroke(255);
  noFill();
  ellipseMode(CENTER);
  ellipse(525, 300, tamX, tamY);
}

public void kk16( int tamX, int tamY){
strokeWeight(30);
stroke(0);
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
  stroke(29, 250, 255);
  noFill();
  ellipseMode(CENTER);
  ellipse(725, 300, tamX, tamY);
}

public void kk22( int tamX, int tamY){
strokeWeight(30);
stroke(255, 30, 232);
noFill();
ellipseMode(CENTER);
ellipse(725, 300, tamX, tamY);

}

public void kk23(float r, float g, float b, int tamX, int tamY){
  stroke(255);
  noFill();
  ellipseMode(CENTER);
  ellipse(725, 500, tamX, tamY);
}

public void kk24( int tamX, int tamY){
strokeWeight(30);
stroke(0);
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
