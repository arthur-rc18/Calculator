package ufu.arthur;

import java.util.Scanner;

public class Calculadora {

    Scanner teclado = new Scanner(System.in);
<<<<<<< HEAD
=======
    //public float n1 = teclado.nextFloat();
    //public float n2 = teclado.nextFloat();
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
    public float resultado;

    public void act(){
        int n;
        float n1, n2;
        System.out.println("Ola, escolha qual operaçao voce deseja realizar: ");
        System.out.println("1 - Soma " +
                "2 - Subtraçao " +
                "3 - Multiplicaçao " +
<<<<<<< HEAD
                "4 - Divisao" +
                "5 - Potencia" +
                "0 - Para sair da calculadora");
=======
                "4 - Divisao");
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
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
<<<<<<< HEAD
                    System.out.println("Obrigado por usar a calculadora, volte sempre!");
                    break;
                } else if (n == 1){
                    act();
                }
                break;
=======
                    System.out.println("Obrigado por usar a calculadora");
                } else if (n == 1){
                    System.out.println("Ola, escolha qual operaçao voce deseja realizar: ");
                    System.out.println("1 - Soma " +
                            "2 - Subtraçao " +
                            "3 - Multiplicaçao " +
                            "4 - Divisao");
                    System.out.println("Digite a opçao desejada");
                }
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
            case 2 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 - n2;
                System.out.println("O resultado da subtraçao eh = " + resultado);
<<<<<<< HEAD
                System.out.println("Deseja continuar? Se sim digite 1 se nao digite 0");
                n = teclado.nextInt();
                if (n == 0){
                    System.out.println("Obrigado por usar a calculadora, volte sempre!");
                    break;
                } else if (n == 1){
                    act();
                }
=======
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
                break;
            case 3 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 * n2;
                System.out.println("O resultado da multiplicacao eh = " + resultado);
<<<<<<< HEAD
                System.out.println("Deseja continuar? Se sim digite 1 se nao digite 0");
                n = teclado.nextInt();
                if (n == 0){
                    System.out.println("Obrigado por usar a calculadora, volte sempre!");
                    break;
                } else if (n == 1){
                    act();
                }
=======
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
                break;
            case 4 :
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextInt();
                resultado = n1 / n2;
                System.out.println("O resultado da divisao eh = " + resultado);
<<<<<<< HEAD
                System.out.println("Deseja continuar? Se sim digite 1 se nao digite 0");
                n = teclado.nextInt();
                if (n == 0){
                    System.out.println("Obrigado por usar a calculadora, volte sempre!");
                    break;
                } else if (n == 1){
                    act();
                }
                break;
            default :
                System.out.println("Opçao nao disponivel!!");
                break;
=======
                break;
            default :
                System.out.println("Opçao nao disponivel");
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
        }
    }

    public static void main(String[] args) {
        Calculadora z = new Calculadora();
        z.act();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 1693d09f5ccd192ad5948e7e4261be95e047b42e
