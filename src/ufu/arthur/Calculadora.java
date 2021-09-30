package ufu.arthur;

import java.util.Scanner;

public class Calculadora  {

    Scanner teclado = new Scanner(System.in);
    public double resultado;

    public void act() {
        int n;
        float n1, n2;
        double d1, d2;
        System.out.println("Ola, escolha qual operaçao voce deseja realizar: ");
        System.out.println("1 - Soma\n" +
                "2 - Subtraçao\n" +
                "3 - Multiplicaçao\n" +
                "4 - Divisao\n" +
                "5 - Potencia\n" +
                "6 - Raiz quadrada\n" +
                "7 - Fatorial\n" +
                "8 - Trigonometria\n" +
                "9 - Porcentagem\n" +
                "10 - Conversao\n" +
                "0 - Para sair da calculadora\n");
        System.out.println("Digite a opçao desejada:");

       n = teclado.nextInt();

        switch(n){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextFloat();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextFloat();
                resultado = n1 + n2;
                System.out.println("O resultado da soma eh = " + resultado);
                cont();
            break;

            case 2:
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextFloat();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextFloat();
                resultado = n1 - n2;
                System.out.println("O resultado da subtraçao eh = " + resultado);
                cont();
            break;

            case 3:
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextFloat();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextFloat();
                resultado = n1 * n2;
                System.out.println("O resultado da multiplicacao eh = " + resultado);
               cont();
            break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                n1 = teclado.nextFloat();
                System.out.println("Digite o segundo numero: ");
                n2 = teclado.nextFloat();
                resultado = n1 / n2;
                System.out.println("O resultado da divisao eh = " + resultado);
                cont();
            break;

            case 5 :
                System.out.println("Digite o primeiro numero: ");
                d1 = teclado.nextDouble();
                System.out.println("Digite o segundo numero: ");
                d2 = teclado.nextDouble();
                resultado = Math.pow(d1,d2);
                System.out.println("O resultado da potenciaçao eh = " + resultado);
                cont();
                break;

            case 6 :
                System.out.println("Digite o numero: ");
                d1 = teclado.nextDouble();
                resultado = Math.sqrt(d1);
                System.out.println("O resultado da raiz eh = " + resultado);
                cont();
                break;

            case 7 :
                resultado = 1;
                System.out.println("Digite o numero: ");
                d1 = teclado.nextDouble();
                if (d1 <= 0){
                    System.out.println("Resultado invalido, tente novamente");
                    act();

                }
                for (int i = 1; i <= d1; i++){
                    resultado *= i;
                }
                System.out.println("O resultado do fatorial de " + d1 + " eh = " + resultado);
                cont();
                break;

            case 8 :
                System.out.println("Qual operaçao voce deseja realizar:");
                System.out.println("1 - Seno de um angulo\n" +
                        "2 - Cosseno de um angulo\n" +
                        "3 - Tangente de um angulo\n" +
                        "4 - Cossecante de um numero\n" +
                        "5 - Secante de um numero\n" +
                        "6 - Cotangente de um numero\n");
                n = teclado.nextInt();
                if (n == 1){
                    System.out.println("Digite o valor do angulo: ");
                    d1 = teclado.nextDouble();
                    double d3 = Math.toRadians(d1);
                    System.out.println("O seno de " + d1 + "º eh " + Math.sin(d3));
                    cont();
                    break;
                } else if (n == 2){
                    System.out.println("Digite o valor do angulo: ");
                    d1 = teclado.nextDouble();
                    double d3 = Math.toRadians(d1);
                    System.out.println("O cosseno de " + d1 + "º eh " + Math.cos(d3));
                    cont();
                    break;
                } else if (n == 3){
                    System.out.println("Digite o valor do angulo: ");
                    d1 = teclado.nextDouble();
                    double d3 = Math.toRadians(d1);
                    System.out.println("A tangente de " + d1 + "º eh " + Math.tan(d3));
                    cont();
                    break;
                } else if (n == 4){
                    System.out.println("Digite o valor do angulo: ");
                    d1 = teclado.nextDouble();
                    double d3 = Math.toRadians(d1);
                    if (d1 == 0 || d1 == 180 || d1 == 360){
                        System.out.println("Angulo indefinido");
                        cont();
                        break;
                    } else if (d1 != 0) {
                        double d4 = 1 / Math.sin(d3);
                        System.out.println("A cossecante de " + d3 + "º eh " + d4);
                        cont();

                    }
                } else if (n == 5){
                    System.out.println("Digite o valor do angulo: ");
                    d1 = teclado.nextDouble();
                    double d3 = Math.toRadians(d1);
                    double d4 = 1 / Math.cos(d3);
                    if (Math.cos(d3) == 0){
                        System.out.println("Angulo indefinido");
                        cont();
                        break;
                    } else if (d1 == 90 || d1 == 270){
                        System.out.println("Angulo indefinido");
                        cont();
                        break;
                    } else
                        System.out.println("A secante de " + d3 + "º eh " + d4);
                        cont();
                        break;
                } else if (n == 6){
                    System.out.println("Digite o valor do angulo: ");
                    d1 = teclado.nextDouble();
                    double d3 = Math.toRadians(d1);
                    double d4 = 1 / Math.tan(d3);
                    if (d1 == 0){
                        System.out.println("Angulo indefinido");
                        cont();
                        break;
                    }
                    System.out.println("A cotangente de " + d3 + "º eh " + d4);
                    cont();
                }

            case 9 :
                System.out.println("Digite o valor da porcentagem:");
                d1 = teclado.nextDouble();
                System.out.println("Digite o valor do numero:");
                d2 = teclado.nextDouble();
                resultado = d2 * (d1/100);
                System.out.println("O valor de " + d1 + "% " + " de " + d2 + " eh " + resultado);
                cont();

            case 10 :
                System.out.println("Qual conversao voce deseja realizar:");
                System.out.println("1 - Bases numericas\n" +
                        "2 - Cambio\n" +
                        "3 - Medidas\n");
                n = teclado.nextInt();
                if (n == 1){
                    System.out.println("Qual base voce deseja converter?");
                    System.out.println("1 - Binario para decimal\n" +
                            "2 - Decimal para binario\n" +
                            "3 - Octal para decimal\n" +
                            "4 - Decimal para octal\n" +
                            "5 - Hexadecimal para decimal\n" +
                            "6 - Decimal para hexadecimal\n");
                    n = teclado.nextInt();
                    if (n == 1){
                        System.out.println("Digite o numero binario:");
                        String bin = teclado.next();
                        int potencia = 0;
                        int decimal = 0;
                        for (int i = bin.length() - 1; i >= 0;i--){
                            decimal += Math.pow(2,potencia) * Character.getNumericValue(bin.charAt(i));
                            potencia++;
                        }
                        System.out.println("A conversao de " + bin + " para decimal eh " + decimal);
                        cont();
                        break;
                    } else if (n == 2){
                        System.out.println("Digite o numero em decimal");
                        int dec = teclado.nextInt();
                        resto(dec);
                    }
                }

            default:
                System.out.println("Opçao nao disponivel!!");
                break;
        }
    }

    public void cont(){
        System.out.println("Deseja continuar? Se sim digite 1 se nao digite 0");
        int n;
        n = teclado.nextInt();
        switch (n){
        case 0 :
            System.out.println("Obrigado por usar a calculadora, volte sempre!");
            break;
        case 1 :
            act();

            default:
                System.out.println("Opção indisponivel");
                break;
        }
    }

    public void resto(int n1){
        int f = n1;
        int x = 0;
        while(f > 0){
            f = n1 % 2;
            x = f;
            System.out.println(f);
            resto(f);
        }
    }
}