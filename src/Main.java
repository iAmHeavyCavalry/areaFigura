import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

        byte option = scanner.nextByte();
        int lado, base, altura;

        switch (option){

            case 1: //como showInputDialog es un metodo static, por lo que se llama a la clase JOptionPane
                lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es " + Math.pow(lado,2));
                break;

            case 2:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es " + base*altura);
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triangulo es " + (base*altura)/2);
                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El area del circulo es " );
                System.out.printf("%1.2f", Math.PI * Math.pow(radio,2));
                break;

            default:
                System.out.println("Option no valida");
        }
    }
}