
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

void setup()
{
size(842,595);
background(0);
t = new Tarea(x, y, h, w, r, g, b);
}

void draw()
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
