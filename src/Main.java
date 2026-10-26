import java.util.Scanner;

void main() {
     Scanner sc = new Scanner(System.in);


     int[] numeros = new int[5];
     int suma = 0;
     double mitjana;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Introdueix un nombre:");
        numeros[i] = sc.nextInt();

    }

    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }
    
    mitjana = (double) suma / numeros.length;

    System.out.println("Suma" + suma);
    System.out.println("Mitjana" + mitjana);


}