import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("que temperatura hace?");
        Scanner sc = new Scanner(System.in);
        int temperatura = sc.nextInt();
        if (temperatura <= 2) {
            System.out.println("Riesgo de hielo");
        }else if (temperatura > 3) {
            System.out.println(" no hay riesgo de hielo");
        }
    }
}
