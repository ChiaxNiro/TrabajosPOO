package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("El volumen de la esfera es: "+areaRectangulo());

    }
    public static int[] ingresoNum() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[2];
        System.out.print("Ingrese el primer número: ");
        numeros[0] = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numeros[1] = sc.nextInt();
        return numeros;
    }
    public static int areaRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo");
        int ancho = sc.nextInt();
        System.out.println("Ingrese el alto del rectangulo");
        int alto = sc.nextInt();
        int area = ancho * alto;
        return area;
    }
    public static int areaCuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        int lado = sc.nextInt();
        int area = lado*lado;
        return area;
    }
    public static double areaCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        int radio = sc.nextInt();
        double area = Math.PI * radio*radio;
        return area;
    }
    public static double areaEsfera(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        int radio = sc.nextInt();
        double area = 4*Math.PI*radio*radio;
        return area;
    }
    public static int areaCubo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cubo");
        int lado = sc.nextInt();
        int area = lado*lado*6;
        return area;
    }
    public static double areaCono(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        int radio = sc.nextInt();
        System.out.println("Ingrese la geriatriz del cono");
        int g = sc.nextInt();
        double area = (Math.PI*radio*radio)+(Math.PI*radio*g);
        return area;
    }
    public static int perimetroCuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        int lado = sc.nextInt();
        int perimetro = 4*lado;
        return perimetro;
    }
    public static int perimetroRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo");
        int ancho = sc.nextInt();
        System.out.println("Ingrese el alto del rectangulo");
        int alto = sc.nextInt();
        int perimetro = 2*ancho+2*alto;
        return perimetro;
    }
    public static double perimetroCirculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        int radio = sc.nextInt();
        double area = radio*2*Math.PI;
        return area;
    }
    public static double volumenEsfera(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        int radio = sc.nextInt();
        double volumen = (4.0/3.0)*Math.PI*Math.pow(radio,3);
        return volumen;
    }
    public static double volumenCubo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cubo");
        int lado = sc.nextInt();
        double volumen = Math.pow(lado,3);
        return volumen;
    }
    public static double volumenCono(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        int radio = sc.nextInt();
        System.out.println("Ingrese la altura del cono");
        int altura = sc.nextInt();
        double volumen = (1.0/3.0)*Math.PI*radio*radio*altura;
        return volumen;
    }
    }

