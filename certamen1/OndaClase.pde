class OndaClase{

int x;   //posición x
int y;   //posición y
float p;


OndaClase(int x, int y){

  this.x = x;
  this.y = y;
  this.p = p;

}


//EN LA FUNCION DEL RECTANGULO, X REPRESENTA LA POSICIÓN
//DE LA FIGURA EN EL EJE X, Y REPRESENTA LA POSICIÓN DE LA
//FIGURA EN EL EJE Y, Y A ESA POSICIÓN SE LE SUMA EL SENO O
//EL COSENO DE LA VARIABLE P, LA CUAL ES UNA VARIABLE FLOTANTE
//A LA QUE SE LE ASIGNA EL VALOR DE LA CANTIDAD DE PUNTOS
//EN LOS QUE SE VA A MOVER LA FIGURA, EN OTRAS PALABRAS
//ES LA VELOCIDAD EN LA QUE LA FIGURA SE VA A DESPLAZAR
//EL SENO O COSENO DE LA VARIABLE P SE MULTIPLICA POR 50,
//QUE ES EL RANGO EN EL QUE SE DESPLAZA LA FIGURA, EN ESTE
//CASO 50 HACIA ARRIBA Y 50 HACIA ABAJO.
//DESPUÉS DE LA VARIABLE Y, VIENE EL WIDTH QUE ES EL ANCHO DE LA
//FIGURA Y EL HEIGHT, QUE ES EL ALTO DE LA FIGURA.
//A DEMÁS DE LAS CUATRO VARIABLES BÁSICAS DE LA FUNCIÓN
//DE UN RECTANGULO, SE LE AGREGÁRON CUATRO VARIABLES
//MÁS QUE SON PARA DARLE UN RÁDIO A LOS VERTICES DEL RECTANGULO
//LOGRANDO ASÍ QUE EL RECTANGULO QUEDE CON SUS VERTICES
//CIRCULARES.



//METODO 1: MOVIMIENTO DE ACUERDO AL SENO
void seno(int x, int y, float p){
rectMode(CENTER);
stroke(255);
rect(x, y + sin(p)*50, 50,150, 25, 25, 25, 25 );

}

//METODO 2: MOVIMIENTO SEGUN EL COSENO
void coseno(int x, int y, float p){
rectMode(CENTER);
stroke(255);
rect(x, y + cos(p)*50, 50,150, 25, 25, 25, 25 );

}

//CAMBIAR LOS RECTANGULOS POR LAS ELIPSES USANDO EL
//LERPCOLOR
//INTENTAR DE CIERTA FORMA COMBINAR LAS FUNCIONES

void lerpC() {
    // dos colores
    // una cantidad entre esos colores

    color c1 = color(255, 0, 0);
    color c2 = color(0, 255, 0);
    float y2 = sin(frameCount*.1)*10;
    for (int i = 0; i < 10; i ++) {
      float amt = map(i, 0, 9, 0, 1);
      color cLerp = lerpColor(c1, c2, amt);
      fill(cLerp);
      float y = map(i, 0, 9, 0, height/2);
      ellipse(width/2, y2+y, 50, 50);
    }
  }


}
