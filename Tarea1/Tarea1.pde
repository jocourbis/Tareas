float angulo = 0;
float n = 0;
float p;


void setup()
{
size(400,400);
//smooth();
stroke(255);
}

void draw()
{
background(0);
fill(255);
//noStroke();
/*
angulo = angulo+0.03; //ángulo girado
translate(200,200); //traslada el origen de coordenadas para girar dentro del lienzo
rotate(angulo); //gira el objeto el ángulo girado
fill(random(200), random(105), random(255));
ellipse(20,20,20,20); //dibuja el objeto
ellipse(40,40,20,20);



ellipse(width/2 + cos(n) * 100, height/2 + sin(n) * 100, 20, 20);
  n = n + 0.05;

  ellipse(width/3 + cos(n) * 100, height/3 + sin(n) * 100, 20, 20);
    n = n + 0.05;

}

*/

translate(width/2, height/2);                    // punto (0,0)/ ORIGEN en el centro del sketch
angulo = angulo+0.03;
for(int i = 0; i < 360; i+=50.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*10;               // variable de rotacion
    float y = cos(radians(i))*10;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(angulo);              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(255));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,10,10);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

   for(int i = 0; i < 360; i+=15.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
       float x = sin(radians(i))*50;               // variable de rotacion
       float y = cos(radians(i))*50;               // variable de rotacion
       pushMatrix();                                // Abriendo propiedades independientes
       translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
       rotate(angulo);              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
       fill(random(150),random(255), random(50));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
       ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
       popMatrix();                                 // Cerrando propiedades independientes
}

for(int i = 0; i < 360; i+=8.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*100;               // variable de rotacion
    float y = cos(radians(i))*100;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(angulo);              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(255),random(50), random(150));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

for(int i = 0; i < 360; i+=5.5){                 // For que define: angulo máximo de rotación, cantidad de figuras y su separación
    float x = sin(radians(i))*150;               // variable de rotacion
    float y = cos(radians(i))*150;               // variable de rotacion
    pushMatrix();                                // Abriendo propiedades independientes
    translate(x, y);                             // Se traslada el origen, que al mismo tiempo esta en movimiento
    rotate(angulo);              // proporciona movimiento al sketch/ cambia los ejes/ direccion de rotacion
    fill(random(50),random(150), random(255));      // Se rellena la figura con el color original, pero es alterado en el canal R. (P.127) esto hara que palpite el anillo
    ellipse(0,0,20,20);                     // Se dibujan las figuras que se encuentran en el fondo
    popMatrix();                                 // Cerrando propiedades independientes
}

}
