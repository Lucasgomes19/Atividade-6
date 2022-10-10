import java.util.Scanner;

public class Atividade6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo com o raio" + raio + "é: " + area);

        sc.close();
    }
}
