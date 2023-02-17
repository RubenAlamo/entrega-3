import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("que temperatura hace?");
        Scanner sc = new Scanner(System.in);
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else if (2 <= temperatura && temperatura < 15) {
            System.out.println(" hace frio");
        } else if (15 <= temperatura && temperatura < 30) {
            System.out.println(" Buena temperatura");
        }else if (temperatura >= 30) {
            System.out.println(" Demasiado calor");
        }
    }
}

