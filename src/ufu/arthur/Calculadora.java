package ufu.arthur;

import java.util.Scanner;

public class Calculadora  {

    Scanner keyboard = new Scanner(System.in);
    public double result;

    public void act() {
        int n;
        float n1, n2;
        double d1, d2;
        System.out.println("Qual calculadora voce deseja escolher?");
        System.out.println("1 - Cientifica\n" +
                "2 - Programador\n" +
                "3 - Conversor\n");
        n = keyboard.nextInt();

        switch (n){
            case 1 :
                System.out.println("Voce escolheu a calculadora cientifica!!!");
                System.out.println("Escolha qual operaçao voce deseja realizar: ");
                System.out.println("1 - Soma\n" +
                        "2 - Subtraçao\n" +
                        "3 - Multiplicaçao\n" +
                        "4 - Divisao\n" +
                        "5 - Potencia\n" +
                        "6 - Raiz quadrada\n" +
                        "7 - Fatorial\n" +
                        "8 - Trigonometria\n" +
                        "9 - Porcentagem\n" +
                        "0 - Para sair da calculadora\n");
                System.out.println("Digite a opçao desejada:");

                n = keyboard.nextInt();

                switch(n){
                    case 1:
                        System.out.println("Digite o primeiro numero: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Digite o segundo numero: ");
                        n2 = keyboard.nextFloat();
                        result = n1 + n2;
                        System.out.println("O result da soma eh = " + result);
                        cont();
                        break;

                    case 2:
                        System.out.println("Digite o primeiro numero: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Digite o segundo numero: ");
                        n2 = keyboard.nextFloat();
                        result = n1 - n2;
                        System.out.println("O result da subtraçao eh = " + result);
                        cont();
                        break;

                    case 3:
                        System.out.println("Digite o primeiro numero: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Digite o segundo numero: ");
                        n2 = keyboard.nextFloat();
                        result = n1 * n2;
                        System.out.println("O result da multiplicacao eh = " + result);
                        cont();
                        break;

                    case 4:
                        System.out.println("Digite o primeiro numero: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Digite o segundo numero: ");
                        n2 = keyboard.nextFloat();
                        result = n1 / n2;
                        System.out.println("O result da divisao eh = " + result);
                        cont();
                        break;

                    case 5 :
                        System.out.println("Digite o primeiro numero: ");
                        d1 = keyboard.nextDouble();
                        System.out.println("Digite o segundo numero: ");
                        d2 = keyboard.nextDouble();
                        result = Math.pow(d1,d2);
                        System.out.println("O result da potenciaçao eh = " + result);
                        cont();
                        break;

                    case 6 :
                        System.out.println("Digite o numero: ");
                        d1 = keyboard.nextDouble();
                        result = Math.sqrt(d1);
                        System.out.println("O result da raiz eh = " + result);
                        cont();
                        break;

                    case 7 :
                        result = 1;
                        System.out.println("Digite o numero: ");
                        d1 = keyboard.nextDouble();
                        if (d1 <= 0){
                            System.out.println("result invalido, tente novamente");
                            act();

                        }
                        for (int i = 1; i <= d1; i++){
                            result *= i;
                        }
                        System.out.println("O result do fatorial de " + d1 + " eh = " + result);
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
                        n = keyboard.nextInt();
                        if (n == 1){
                            System.out.println("Digite o valor do angulo: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            System.out.println("O seno de " + d1 + "º eh " + Math.sin(d3));
                            cont();
                            break;
                        } else if (n == 2){
                            System.out.println("Digite o valor do angulo: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            System.out.println("O cosseno de " + d1 + "º eh " + Math.cos(d3));
                            cont();
                            break;
                        } else if (n == 3){
                            System.out.println("Digite o valor do angulo: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            System.out.println("A tangente de " + d1 + "º eh " + Math.tan(d3));
                            cont();
                            break;
                        } else if (n == 4){
                            System.out.println("Digite o valor do angulo: ");
                            d1 = keyboard.nextDouble();
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
                            d1 = keyboard.nextDouble();
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
                            d1 = keyboard.nextDouble();
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
                        d1 = keyboard.nextDouble();
                        System.out.println("Digite o valor do numero:");
                        d2 = keyboard.nextDouble();
                        result = d2 * (d1/100);
                        System.out.println("O valor de " + d1 + "% " + " de " + d2 + " eh " + result);
                        cont();

                    default :
                        System.out.println("Opçao indisponivel");
                        break;
        }

            case 2 :
                System.out.println("Voce escolheu a calculadora de programador!!!");
                System.out.println("A calculadora de programador se baseia em fazer conversoes " +
                        "entre bases numericas diferentes");
                    System.out.println("Qual base voce deseja converter?\n");
                    System.out.println("1 - Binario para decimal\n" +
                            "2 - Decimal para binario\n" +
                            "3 - Octal para decimal\n" +
                            "4 - Decimal para octal\n" +
                            "5 - Hexadecimal para decimal\n" +
                            "6 - Decimal para hexadecimal\n");
                    n = keyboard.nextInt();
                    if (n == 1){
                        System.out.println("Digite o numero binario:");
                        String bin = keyboard.next();
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
                        int dec = keyboard.nextInt();
                        String bin = Integer.toBinaryString(dec);
                        System.out.println("A conversao de " + dec + " para a base binaria eh: ");
                        System.out.println(bin);
                        System.out.println("\n--------------\n");
                        cont();
                        break;
                    } else if (n == 3){
                        System.out.println("Digite o numero em octal");
                        String oct = keyboard.next();
                        int potencia = 0;
                        int decimal = 0;
                        for (int i = oct.length() - 1; i >= 0;i--){
                            decimal += Math.pow(8,potencia) * Character.getNumericValue(oct.charAt(i));
                            potencia++;
                        }
                        System.out.println("A conversao de " + oct + " em octal para decimal eh " + decimal);
                        cont();
                        break;
                    } else if (n == 4){
                        System.out.println("Digite o numero em decimal");
                        int dec = keyboard.nextInt();
                        String oct = Integer.toOctalString(dec);
                        System.out.println("A conversao de " + dec + " para a base octal eh: ");
                        System.out.println(oct);
                        System.out.println("\n--------------\n");
                        cont();
                        break;
                    } else if (n == 5){
                        System.out.println("Digite o numero em hexadecimal");
                        String hex = keyboard.next();
                        int potencia = 0;
                        int decimal = 0;
                        for (int i = hex.length() - 1; i >= 0;i--){
                            decimal += Math.pow(16,potencia) * Character.getNumericValue(hex.charAt(i));
                            potencia++;
                        }
                        System.out.println("A conversao de " + hex + " em hexa para decimal eh " + decimal);
                        cont();
                        break;
                    } else if (n == 6){
                        System.out.println("Digite o numero em decimal");
                        int dec = keyboard.nextInt();
                        String hex = Integer.toHexString(dec);
                        System.out.println("A conversao de " + dec + " para a base hexadecimal eh: ");
                        System.out.println(hex);
                        System.out.println("\n--------------\n");
                        cont();
                        break;
                    }

            case 3 :
                System.out.println("You chosen the conversion calculator");
                System.out.println("What do you wanna to convert?");
                System.out.println("1 - Currency\n" +
                        "2 - Volume\n" +
                        "3 - Length\n" +
                        "4 - Weight\n" +
                        "5 - Temperature\n");

                n = keyboard.nextInt();
                switch (n){
                    case 1 :
                        System.out.println("Which currency you want to convert?");
                        System.out.println("1 - USA dollar\n" +
                                "2 - BR real\n" +
                                "3 - Japan yen\n" +
                                "4 - EU euro\n" +
                                "5 - UK pound\n" +
                                "6 - CH Yuan\n");
                        n = keyboard.nextInt();
                        switch (n){
                            case 1 :
                                System.out.println("Which currency you want to convert the US dollar?");
                                System.out.println("1 - BR real\n" +
                                        "2 - Japan yen\n" +
                                        "3 - EU euro\n" +
                                        "4 - UK pound\n" +
                                        "5 - CH Yuan\n");
                                n = keyboard.nextInt();
                                switch (n) {
                                    case 1 :
                                        System.out.println("Type the amount of dollars: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 5.44;
                                        System.out.println(d1 + "$ dollars is equal to " + result + "R$ reais \n");
                                        cont();
                                        break;

                                    case 2 :
                                        System.out.println("Type the amount of dollars: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 111.26;
                                        System.out.println(d1 + "$ dollars is equal to " + result + "¥ yens \n");
                                        cont();
                                        break;

                                    case 3 :
                                        System.out.println("Type the amount of dollars: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.86;
                                        System.out.println(d1 + "$ dollars is equal to " + result + "€ euros \n");
                                        cont();
                                        break;

                                    case 4 :
                                        System.out.println("Type the amount of dollars: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.73;
                                        System.out.println(d1 + "$ dollars is equal to " + result + "£ pounds \n");
                                        cont();
                                        break;

                                    case 5 :
                                        System.out.println("Type the amount of dollars: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 6.45;
                                        System.out.println(d1 + "$ dollars is equal to " + result + "¥ yuan \n");
                                        cont();
                                        break;

                                    default:
                                        System.out.println("Option not available!!");
                                        break;
                                }
                            case 2 :
                                System.out.println("Which currency you want to convert the BR real?");
                                System.out.println("1 - US dollar\n" +
                                        "2 - Japan yen\n" +
                                        "3 - EU euro\n" +
                                        "4 - UK pound\n" +
                                        "5 - CH Yuan\n");
                                n = keyboard.nextInt();
                                switch (n) {
                                    case 1:
                                        System.out.println("Type the amount of real: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.18;
                                        System.out.println(d1 + "R$ reals is equal to " + result + "$ dollars \n");
                                        cont();
                                        break;

                                    case 2 :
                                        System.out.println("Type the amount of real: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 20.34;
                                        System.out.println(d1 + "R$ reals is equal to " + result + "¥ yens \n");
                                        cont();
                                        break;

                                    case 3 :
                                        System.out.println("Type the amount of real: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.16;
                                        System.out.println(d1 + "R$ reals is equal to " + result + "€ euros \n");
                                        cont();
                                        break;

                                    case 4 :
                                        System.out.println("Type the amount of real: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.13;
                                        System.out.println(d1 + "R$ reals is equal to " + result + "£ pounds \n");
                                        cont();
                                        break;

                                    case 5 :
                                        System.out.println("Type the amount of real: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.18;
                                        System.out.println(d1 + "R$ reals is equal to " + result + "¥ yuan \n");
                                        cont();
                                        break;

                                    default:
                                        System.out.println("Option not available!!");
                                        break;
                                }
                            case 3 :
                                System.out.println("Which currency you want to convert the Japan yen?");
                                System.out.println("1 - US dollar\n" +
                                        "2 - BR real\n" +
                                        "3 - EU euro\n" +
                                        "4 - UK pound\n" +
                                        "5 - CH Yuan\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of yen: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.009;
                                        System.out.println(d1 + "¥ yens is equal to " + result + "$ dollars \n");
                                        cont();
                                        break;

                                    case 2 :
                                        System.out.println("Type the amount of yen: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.049;
                                        System.out.println(d1 + "¥ yens is equal to " + result + "R$ reals \n");
                                        cont();
                                        break;

                                    case 3 :
                                        System.out.println("Type the amount of yen: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.0078;
                                        System.out.println(d1 + "¥ yens is equal to " + result + "€ euros \n");
                                        cont();
                                        break;

                                    case 4 :
                                        System.out.println("Type the amount of yen: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.0066;
                                        System.out.println(d1 + "¥ yens is equal to " + result + "£ pounds \n");
                                        cont();
                                        break;

                                    case 5 :
                                        System.out.println("Type the amount of yen: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.058;
                                        System.out.println(d1 + "¥ yens is equal to " + result + "¥ yuan \n");
                                        cont();
                                        break;

                                    default:
                                        System.out.println("Option not available!!");
                                        break;
                                }
                            case 4 :
                                System.out.println("Which currency you want to convert the EU euro?");
                                System.out.println("1 - US dollar\n" +
                                        "2 - BR real\n" +
                                        "3 - Japan yen\n" +
                                        "4 - UK pound\n" +
                                        "5 - CH Yuan\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of euros: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.16;
                                        System.out.println(d1 + "€ euros is equal to " + result + "$ dollars \n");
                                        cont();
                                        break;

                                    case 2 :
                                        System.out.println("Type the amount of euros: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 6.34;
                                        System.out.println(d1 + "€ euros is equal to " + result + "R$ reals \n");
                                        cont();
                                        break;

                                    case 3 :
                                        System.out.println("Type the amount of euros: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 128.88;
                                        System.out.println(d1 + "€ euros is equal to " + result + "¥ yens \n");
                                        cont();
                                        break;

                                    case 4 :
                                        System.out.println("Type the amount of euros: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.85;
                                        System.out.println(d1 + "€ euros is equal to " + result + "£ pounds \n");
                                        cont();
                                        break;

                                    case 5 :
                                        System.out.println("Type the amount of euros: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 7.49;
                                        System.out.println(d1 + "€ euros is equal to " + result + "¥ yuan \n");
                                        cont();
                                        break;

                                    default:
                                        System.out.println("Option not available!!");
                                        break;
                                }
                            case 5 :
                                System.out.println("Which currency you want to convert the UK pound ?");
                                System.out.println("1 - US dollar\n" +
                                        "2 - BR real\n" +
                                        "3 - Japan yen\n" +
                                        "4 - EU euro\n" +
                                        "5 - CH Yuan\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of pounds: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.36;
                                        System.out.println(d1 + "£ pounds is equal to " + result + "$ dollars \n");
                                        cont();
                                        break;

                                    case 2 :
                                        System.out.println("Type the amount of pounds: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 7.42;
                                        System.out.println(d1 + "£ pounds is equal to " + result + "R$ real \n");
                                        cont();
                                        break;

                                    case 3 :
                                        System.out.println("Type the amount of pounds: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 150.96;
                                        System.out.println(d1 + "£ pounds is equal to " + result + "¥ yens \n");
                                        cont();
                                        break;

                                    case 4 :
                                        System.out.println("Type the amount of pounds: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.17;
                                        System.out.println(d1 + "£ pounds is equal to " + result + "€ euros \n");
                                        cont();
                                        break;

                                    case 5 :
                                        System.out.println("Type the amount of pounds: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 8.77;
                                        System.out.println(d1 + "£ pounds is equal to " + result + "¥ yuan \n");
                                        cont();
                                        break;

                                    default:
                                        System.out.println("Option not available!!");
                                        break;
                                }
                            case 6 :
                                System.out.println("Which currency you want to convert the CH yuan?");
                                System.out.println("1 - US dollar\n" +
                                        "2 - BR real\n" +
                                        "3 - Japan yen\n" +
                                        "4 - EU euro\n" +
                                        "5 - UK pound\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of yuan: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.16;
                                        System.out.println(d1 + "¥ yuan is equal to " + result + "$ dollars \n");
                                        cont();
                                        break;

                                    case 2 :
                                        System.out.println("Type the amount of yuan: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.85;
                                        System.out.println(d1 + "¥ yuan is equal to " + result + "R$ real \n");
                                        cont();
                                        break;

                                    case 3 :
                                        System.out.println("Type the amount of yuan: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 17.30;
                                        System.out.println(d1 + "¥ yuan is equal to " + result + "¥ yens \n");
                                        cont();
                                        break;

                                    case 4 :
                                        System.out.println("Type the amount of yuan: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.13;
                                        System.out.println(d1 + "¥ yuan is equal to " + result + "€ euros \n");
                                        cont();
                                        break;

                                    case 5 :
                                        System.out.println("Type the amount of yuan: ");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.11;
                                        System.out.println(d1 + "¥ yuan is equal to " + result + "£ pounds \n");
                                        cont();
                                        break;

                                    default:
                                        System.out.println("Option not available!!");
                                        break;
                                }
                        }
                    case 2 :
                }

                default:
                    System.out.println("Option not available!!");
                    break;
        }

    }

   /* public void resto(int n1) {
        if (n1 > 0) {
            resto(n1 / 2);
            System.out.print(n1 % 2);
        }
    }
    */

    public void cont(){
        System.out.println("Wish to continue? If yes press 1, if not press 0");
        int n;
        n = keyboard.nextInt();
        switch (n){
        case 0 :
            System.out.println("Thank you for using the calculator, come back soon!");
            System.exit(0);
        case 1 :
            act();

            default:
                System.out.println("Option not available");
                System.exit(0);
        }
    }
}