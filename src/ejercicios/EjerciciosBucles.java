package ejercicios;

import java.util.Scanner;

public class EjerciciosBucles {

	public EjerciciosBucles() {
		// TODO Auto-generated constructor stub
		//1.- Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.,while y do while
		Scanner leer =new Scanner(System.in);
		String pausa="";
		System.out.println("EJERCICIO1");
		System.out.println("Bucle for pulsa una tecla para ejecutar");
		pausa= leer.next();
		for (int num = 0; num <=100; num+=5){
			System.out.println(num);
		}
		System.out.println("Bucle Do While pulsa una tecla para ejecutar");
		pausa= leer.next();
		int num = 0;
		do {
			System.out.println(num);
			num+=5;
		}while (num<=100);
		System.out.println("Bucle While pulsa una tecla para ejecutar");
		pausa= leer.next();
		 num=0;
		while(num<100) {
		num+=5;
		System.out.println(num);
		}
		//2 .- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
		System.out.println("EJERCICIO2 pulsa una tecla para ejecutar");
		pausa= leer.next();
		num=320;
		System.out.println(num);
		while (num>160) {
		num-=20;
		System.out.println(num);
		}
		/*3.-Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá
		la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si
		acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
		caja fuerte.*/
		System.out.println("EJERCICIO3 pulsa una tecla para ejecutar");
		
		int contador=0;
		boolean acierto=false;
		do {
			System.out.println("Insete el codigo secreto para abrir la caja");
			int codigo= leer.nextInt();
			contador++;
		if((codigo>=1000)&&(codigo<10000)){
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			acierto=true;
			break;
		}else {
			System.out.println("Lo siento, esa no es la combinación");
		}
		}while (contador<=3); {
			if (acierto=false) {
				System.out.println("Lo siento, esa no es la combinación");
			}	
		}
		
		
		/*4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es
		equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos
		como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en
		el número de dígitos la establece el tipo de dato que se utilice (int o long).*/
		System.out.println("Programa que te dice cuantas cifras tiene un numero");
		System.out.println("Pon un numero y te digo cuantas cifras tiene");
		Scanner leemelo=new Scanner(System.in);
		int numIntroducido=leemelo.nextInt();
		int contCifras=1;
		int valor1=1;
		int valor2=10;
		while(numIntroducido>0) {
			if(numIntroducido >=valor1 && numIntroducido <=valor2) {//numero de 1 cifra, que luego con el contador va a ir de 10 en 10 y eso hara que se sume una cifra
			System.out.println("El numero tiene "+contCifras+ " cifras");
			break;
			}
			contCifras++;
			valor1*=10;
			valor2*=10;
		}
		
		/*5.- Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori,
		el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos
		cuando meta un número negativo.*/
		double numMedia=0;//leer numero que quieras hacer media
		double sumaNum=0;//Esto es un acumulador que sacara la media luego en la div hgacer un casting
		double contNum=0;//este va a ser el divisor para sacar la media
		double media=0;
		System.out.println("Programa que hace media de numeros hasta que sea un numero negativo");
		System.out.println("Introduce un numero si quieres acabar con la media pon un numero menor que 0");
		while(numMedia>=0) {
		numMedia=leemelo.nextDouble();
		if(numMedia>=0) {
		contNum++;
		sumaNum+=numMedia;
		media=sumaNum/contNum;
		}else {
		break;	
		}
		}
		System.out.println("La media de todos los numeros es de "+media);
		
		/*6.- Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de
		Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos
		son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.*/
		System.out.println("Programa que te dice la formula Fibonacci segun el numero de veces que tu pongas ");
		int num1=0;
		int num2=1;
		int sumaNum1=0;
		int acumulaNum=0;
		int acumulaFinal=0;
		System.out.println("Escribe el numero de veces que quieres hacer el metodo Fibonacci");
		int nVeces=leemelo.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		while (nVeces>=0) {
			sumaNum1=num1+num2;
			acumulaNum+=sumaNum1;
			System.out.println(acumulaNum);
			num1=acumulaNum;
			num2=sumaNum1;
			acumulaFinal=acumulaNum+num2;
			System.out.println(acumulaFinal);
			nVeces--;
			//para hacer un print en la misma linea quitar el ln
			
		}
		
		/*7.- Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
		sólo es divisible entre él mismo y la unidad.*/
		System.out.println("Escribe un numero y te diré si es primo o no");
		boolean EsPrimo=true;
		int numColocado=leemelo.nextInt();
		int resto;
		int coc;
		int contDiv;
		for(contDiv=2;contDiv <(numColocado -1);contDiv++) {
			resto=numColocado%contDiv;
			if(resto==0){
			EsPrimo=false;	
			}
		}
		if(EsPrimo){
			System.out.println("Este numero ES PRIMO");
		}else {
			EsPrimo=false;
			System.out.println("Este numero NO ES PRIMO");
		}
		
		/*8.- Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado
		y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
		de 7 en 7.*/
		int sumadorSiete=7;
		System.out.println("Programa que muestra numero de 2 rangos de 7 en 7");
		System.out.println("Coloca primero el primer numero que empieze el rango");
		int numPrimero=leer.nextInt();
		System.out.println("Coloca ahora el segundo numero que termine el rango");
		int numUltimo=leer.nextInt();
		while(numPrimero<=numUltimo) {
		System.out.println(numPrimero);
		numPrimero+=sumadorSiete;
		}
		
		
		/*9.- Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos
		números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
		indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
		System.out.println("Programa que pide numeros y hacen cosas");
		int numColoc=0;
		int contNumColoc=0;
		int restoDiv;
		int acumulameNums=0;
		int maxPar=0;
		double contMedias=0;
		double numImparMedia=0;
		System.out.println("Introduce un numero ");
		do {
		numColoc=leer.nextInt();	
		}
		while(numColoc>=0); {
		restoDiv=numColoc%2; //es 0
		contNumColoc++;
		if(restoDiv==0) {//NO SE COMO HACER LO DE PAR DE ORDENAR
		if (numColoc>maxPar)
		maxPar=numColoc;
		}else {//aqui envia a los numeros impares
		while (numColoc>0)	{
		acumulameNums=+numColoc;
		contMedias++;
		numImparMedia=acumulameNums/contMedias;
		}
		}
		
		}
		
		System.out.println("Se han introducido "+contNumColoc+" numeros");
		System.out.println("La media es de "+numImparMedia+" en total de los numeros IMPARES");
		System.out.println("El mayor de los pares es " + maxPar);
		
		/*10.- Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.*/
		Scanner reves=new Scanner(System.in);
	    System.out.println("Introduzca un número entero y te lo mostrare al reves ");
	    int numeroPed;
	    numeroPed=reves.nextInt();
	    int volteado=0;
	    
	    while (numeroPed > 0) {
	      volteado = (volteado * 10) + (numeroPed % 10);
	      numeroPed /= 10;
	    } 
	    
	    System.out.println("Si le damos la vuelta al " + numeroPed);
	    System.out.println("tenemos el " + volteado + "");
	    
	    /*11.- Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
		(o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.*/		
		
		
		/*12.- Escribe un programa que calcule el factorial de un número entero leído por
		teclado.
		Ejemplo:
		Por favor, introduzca un número entero: 6
		6! = 720*/
	    int calculoNumFactorial=1;
	    Scanner factorial=new Scanner(System.in);
	    System.out.println("Programa que calcule el factorial de un numero");
	    System.out.println("Introduzca un numero y te dire su factorial");
	    int numFactorial=factorial.nextInt();
	    if(numFactorial>0) {
	    for(int contadorIncremental=1;contadorIncremental<=numFactorial;contadorIncremental++) {
	    calculoNumFactorial*=contadorIncremental;	
	    }
	    }else {
	    System.out.println("Lo siento pero lo que acaba de hacer no es un algo factorial");	
	    }
	    System.out.println(numFactorial+"! = "+calculoNumFactorial);
		}
	}


