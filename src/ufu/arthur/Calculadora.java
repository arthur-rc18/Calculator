package ufu.arthur;

import java.util.Scanner;

public class Calculadora {

    Scanner teclado = new Scanner(System.in);
    //public float n1 = teclado.nextFloat();
    //public float n2 = teclado.nextFloat();
    public float resultado;

    public void act(){
        int n;
        float n1, n2;
        System.out.println("Ola, escolha qual operaçao voce deseja realizar: ");
        System.out.println("1 - Soma " +
                "2 - Subtraçao " +
                "3 - Multiplicaçao " +
                "4 - Divisao");
        System.out.println("Digite a opçao desejada");
        n = teclado.nextInt();

        switch (n){
            case 1 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 + n2;
                System.out.println("O resultado da soma eh = " + resultado);
                System.out.println("Deseja continuar? Se sim digite 1 se nao digite 0");
                n = teclado.nextInt();
                if (n == 0){
                    System.out.println("Obrigado por usar a calculadora");
                } else if (n == 1){
                    System.out.println("Ola, escolha qual operaçao voce deseja realizar: ");
                    System.out.println("1 - Soma " +
                            "2 - Subtraçao " +
                            "3 - Multiplicaçao " +
                            "4 - Divisao");
                    System.out.println("Digite a opçao desejada");
                }
            case 2 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 - n2;
                System.out.println("O resultado da subtraçao eh = " + resultado);
                break;
            case 3 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 * n2;
                System.out.println("O resultado da multiplicacao eh = " + resultado);
                break;
            case 4 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 / n2;
                System.out.println("O resultado da divisao eh = " + resultado);
                break;
            default :
                System.out.println("Opçao nao disponivel");
        }
    }

    public static void main(String[] args) {
        Calculadora z = new Calculadora();
        z.act();
    }
}
