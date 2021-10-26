package ufu.arthur;

import java.util.Scanner;

public class Calculator {

    Scanner keyboard = new Scanner(System.in);
    public double result;

    public void act() {
        int n;
        float n1, n2;
        double d1, d2;
        System.out.println("Which calculator do you wanna use?");
        System.out.println("1 - Scientific\n" +
                "2 - Developer\n" +
                "3 - Conversion\n");
        n = keyboard.nextInt();

        switch (n){
            case 1 :
                System.out.println("You chose the scientific calculator!!!");
                System.out.println("Which operation you want to make? ");
                System.out.println("1 - Sum\n" +
                        "2 - Subtraction\n" +
                        "3 - Multiplication\n" +
                        "4 - Division\n" +
                        "5 - Exponentiation\n" +
                        "6 - Square root\n" +
                        "7 - Factorial\n" +
                        "8 - Trigonometry\n" +
                        "9 - Percentage\n" +
                        "0 - To leave calculator\n");
                System.out.println("Type the option you wish:");

                n = keyboard.nextInt();

                switch(n){
                    case 1:
                        System.out.println("Type the first number: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Type the second number: ");
                        n2 = keyboard.nextFloat();
                        result = n1 + n2;
                        System.out.println("The result of the sum is = " + result);
                        cont();
                        break;

                    case 2:
                        System.out.println("Type the first number: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Type the second number: ");
                        n2 = keyboard.nextFloat();
                        result = n1 - n2;
                        System.out.println("The result os the subtraction is = " + result);
                        cont();
                        break;

                    case 3:
                        System.out.println("Type the first number: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Type the second number: ");
                        n2 = keyboard.nextFloat();
                        result = n1 * n2;
                        System.out.println("The result of the multiplication is = " + result);
                        cont();
                        break;

                    case 4:
                        System.out.println("Type the first number: ");
                        n1 = keyboard.nextFloat();
                        System.out.println("Type the second number: ");
                        n2 = keyboard.nextFloat();
                        result = n1 / n2;
                        System.out.println("The result of the division is = " + result);
                        cont();
                        break;

                    case 5 :
                        System.out.println("Type the first number: ");
                        d1 = keyboard.nextDouble();
                        System.out.println("Type the second number: ");
                        d2 = keyboard.nextDouble();
                        result = Math.pow(d1,d2);
                        System.out.println("The result of the Exponentiation is = " + result);
                        cont();
                        break;

                    case 6 :
                        System.out.println("Type the number: ");
                        d1 = keyboard.nextDouble();
                        result = Math.sqrt(d1);
                        System.out.println("The square root of " + d1 + " is = " + result);
                        cont();
                        break;

                    case 7 :
                        result = 1;
                        System.out.println("Type the number: ");
                        d1 = keyboard.nextDouble();
                        if (d1 <= 0){
                            System.out.println("Invalid number, try it again");
                            act();

                        }
                        for (int i = 1; i <= d1; i++){
                            result *= i;
                        }
                        System.out.println("The factorial of " + d1 + " is = " + result);
                        cont();
                        break;

                    case 8 :
                        System.out.println("You chose trigonometry!!");
                        System.out.println("Which operation you wanna make it?:");
                        System.out.println("1 - Sin of an angle\n" +
                                "2 - Cos of an angle\n" +
                                "3 - Tan of an angle\n" +
                                "4 - Cosecant of a number\n" +
                                "5 - Secant of a number\n" +
                                "6 - Cotangent of a number\n");
                        n = keyboard.nextInt();
                        if (n == 1){
                            System.out.println("Type the value of the angle: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            System.out.println("The sin of " + d1 + "º is " + Math.sin(d3));
                            cont();
                            break;
                        } else if (n == 2){
                            System.out.println("Type the value of the angle: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            System.out.println("The cos of " + d1 + "º is " + Math.cos(d3));
                            cont();
                            break;
                        } else if (n == 3){
                            System.out.println("Type the value of the angle: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            System.out.println("The tan of " + d1 + "º is " + Math.tan(d3));
                            cont();
                            break;
                        } else if (n == 4){
                            System.out.println("Type the value of the angle: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            if (d1 == 0 || d1 == 180 || d1 == 360){
                                System.out.println("Undefined angle");
                                cont();
                                break;
                            } else if (d1 != 0) {
                                double d4 = 1 / Math.sin(d3);
                                System.out.println("The cosecant of " + d3 + "º is " + d4);
                                cont();

                            }
                        } else if (n == 5){
                            System.out.println("Type the value of the angle: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            double d4 = 1 / Math.cos(d3);
                            if (Math.cos(d3) == 0){
                                System.out.println("Undefined angle");
                                cont();
                                break;
                            } else if (d1 == 90 || d1 == 270){
                                System.out.println("Undefined angle");
                                cont();
                                break;
                            } else
                                System.out.println("The secant of " + d3 + "º is " + d4);
                            cont();
                            break;
                        } else if (n == 6){
                            System.out.println("Type the value of the angle: ");
                            d1 = keyboard.nextDouble();
                            double d3 = Math.toRadians(d1);
                            double d4 = 1 / Math.tan(d3);
                            if (d1 == 0){
                                System.out.println("Undefined angle");
                                cont();
                                break;
                            }
                            System.out.println("The cotangent of " + d3 + "º is " + d4);
                            cont();
                        }

                    case 9 :
                        System.out.println("Type the value of the percentage:");
                        d1 = keyboard.nextDouble();
                        System.out.println("Type the value of the number:");
                        d2 = keyboard.nextDouble();
                        result = d2 * (d1/100);
                        System.out.println("The value of " + d1 + "% " + " of " + d2 + " is " + result);
                        cont();

                    default :
                        System.out.println("Unavailable Option");
                        cont();
                        break;
        }

            case 2 :
                System.out.println("You chose the developer calculator!!!");
                System.out.println("The developer calculator is based in making conversions " +
                        "between different numerical bases");
                    System.out.println("Which base you wish to convert?\n");
                    System.out.println("1 - Binary to decimal\n" +
                            "2 - Decimal to binary\n" +
                            "3 - Octal to decimal\n" +
                            "4 - Decimal to octal\n" +
                            "5 - Hexadecimal to decimal\n" +
                            "6 - Decimal to hexadecimal\n");
                    n = keyboard.nextInt();
                    if (n == 1){
                        System.out.println("Type the number binary:");
                        String bin = keyboard.next();
                        int exponentiation = 0;
                        int decimal = 0;
                        for (int i = bin.length() - 1; i >= 0;i--){
                            decimal += Math.pow(2,exponentiation) * Character.getNumericValue(bin.charAt(i));
                            exponentiation++;
                        }
                        System.out.println("The conversion of " + bin + " in binary to decimal is " + decimal);
                        cont();
                        break;
                    } else if (n == 2){
                        System.out.println("Type the number in decimal");
                        int dec = keyboard.nextInt();
                        String bin = Integer.toBinaryString(dec);
                        System.out.println("the conversion of " + dec + " to the binary base is: ");
                        System.out.println(bin);
                        System.out.println("\n--------------\n");
                        cont();
                        break;
                    } else if (n == 3){
                        System.out.println("Type the number in octal");
                        String oct = keyboard.next();
                        int exponentiation = 0;
                        int decimal = 0;
                        for (int i = oct.length() - 1; i >= 0;i--){
                            decimal += Math.pow(8,exponentiation) * Character.getNumericValue(oct.charAt(i));
                            exponentiation++;
                        }
                        System.out.println("The conversion of " + oct + " in octal to decimal is " + decimal);
                        cont();
                        break;
                    } else if (n == 4){
                        System.out.println("Type the number in decimal");
                        int dec = keyboard.nextInt();
                        String oct = Integer.toOctalString(dec);
                        System.out.println("The conversion of " + dec + " to the octal base is: ");
                        System.out.println(oct);
                        System.out.println("\n--------------\n");
                        cont();
                        break;
                    } else if (n == 5){
                        System.out.println("Type the number in hexadecimal");
                        String hex = keyboard.next();
                        int exponentiation = 0;
                        int decimal = 0;
                        for (int i = hex.length() - 1; i >= 0;i--){
                            decimal += Math.pow(16,exponentiation) * Character.getNumericValue(hex.charAt(i));
                            exponentiation++;
                        }
                        System.out.println("The conversion of " + hex + " in hexadecimal to decimal is " + decimal);
                        cont();
                        break;
                    } else if (n == 6){
                        System.out.println("Type the number in decimal");
                        int dec = keyboard.nextInt();
                        String hex = Integer.toHexString(dec);
                        System.out.println("The conversion of " + dec + " to the hexadecimal base is: ");
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
                                        System.out.println(d1 + "$ dollars is equal to " + result + "R$ real \n");
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
                        System.out.println("Which volume do you wish to convert");
                        System.out.println("1 - Liters\n" +
                                "2 - m³\n" +
                                "3 - cm³\n" +
                                "4 - Milliliters\n" +
                                "5 - ft³\n" +
                                "6 - yard³");
                        n = keyboard.nextInt();
                        switch (n){
                            case 1 :
                                System.out.println("Which volume do you want to convert the liters?");
                                System.out.println("1 - m³\n" +
                                        "2 - cm³\n" +
                                        "3 - Milliliters\n" +
                                        "4 - ft³\n" +
                                        "5 - yard³\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of liters:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.001;
                                        System.out.println(d1 + " liters is equal to " + result + " cubic meters");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of liters");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1000;
                                        System.out.println(d1 + " liters is equal to " + result + " cm³");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of liters");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1000;
                                        System.out.println(d1 + " liters is equal to " + result + " milliliter");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of liters");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.0353147;
                                        System.out.println(d1 + " liters is equal to " + result + " ft³");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of liters");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.00130795;
                                        System.out.println(d1 + " liters is equal to " + result + " yard³");
                                        cont();

                                    default :
                                        System.out.println("Option not available");
                                        cont();
                                }
                            case 2 :
                                System.out.println("Which volume do you want to convert the m³?");
                                System.out.println("1 - liters\n" +
                                        "2 - cm³\n" +
                                        "3 - Milliliters\n" +
                                        "4 - ft³\n" +
                                        "5 - yard³\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of m³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1000;
                                        System.out.println(d1 + " m³ is equal to " + result + " liters");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of m³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1000000;
                                        System.out.println(d1 + " m³ is equal to " + result + " cm³");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of m³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1000000;
                                        System.out.println(d1 + " m³ is equal to " + result + " milliliters");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of m³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 35.3147;
                                        System.out.println(d1 + " m³ is equal to " + result + " ft³");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of m³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.307;
                                        System.out.println(d1 + " m³ is equal to " + result + " yard³");
                                        cont();

                                    default :
                                        System.out.println("Option not available");
                                        cont();
                                }
                            case 3 :
                                System.out.println("Which volume do you want to convert the cm³?");
                                System.out.println("1 - liters\n" +
                                        "2 - m³\n" +
                                        "3 - Milliliters\n" +
                                        "4 - ft³\n" +
                                        "5 - yard³\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of cm³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.001;
                                        System.out.println(d1 + " cm³ is equal to " + result + " liters");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of cm³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1000000;
                                        System.out.println(d1 + " cm³ is equal to " + result + " m³");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of cm³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1;
                                        System.out.println(d1 + " cm³ is equal to " + result + " milliliters");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of cm³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 3.53147;
                                        System.out.println(d1 + " cm³ is equal to " + result + " ft³");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of cm³");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.30795;
                                        System.out.println(d1 + " cm³ is equal to " + result + " yard³");
                                        cont();

                                    default :
                                        System.out.println("Option unavailable");
                                        cont();
                                }
                            case 4 :
                                System.out.println("Which volume do you want to convert the milliliters?");
                                System.out.println("1 - liters\n" +
                                        "2 - m³\n" +
                                        "3 - cm³\n" +
                                        "4 - ft³\n" +
                                        "5 - yard³\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of milliliters:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.001;
                                        System.out.println(d1 + " milliliters is equal to " + result + " liters");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of milliliters:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 / 1000000;
                                        System.out.println(d1 + " milliliters is equal to " + result + " m³");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of milliliters:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1;
                                        System.out.println(d1 + " milliliters is equal to " + result + " cm³");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of milliliters:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 3.53147;
                                        System.out.println(d1 + " milliliters is equal to " + result + " ft³");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of milliliters:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 1.30795;
                                        System.out.println(d1 + " milliliters is equal to " + result + " yard³");
                                        cont();

                                    default :
                                        System.out.println("Option not available");
                                        cont();
                                }
                            case 5 :
                                System.out.println("Which volume do you want to convert the ft³?");
                                System.out.println("1 - liters\n" +
                                        "2 - m³\n" +
                                        "3 - cm³\n" +
                                        "4 - milliliters\n" +
                                        "5 - yard³\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of ft³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 28.3168;
                                        System.out.println(d1 + " ft³ is equal to " + result + " liters");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of ft³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.0283168;
                                        System.out.println(d1 + " ft³ is equal to " + result + " m³");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of ft³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 28316.8;
                                        System.out.println(d1 + " ft³ is equal to " + result + " cm³");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of ft³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 28316.8;
                                        System.out.println(d1 + " ft³ is equal to " + result + " milliliters");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of ft³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.037037;
                                        System.out.println(d1 + " ft³ is equal to " + result + " yard³");
                                        cont();

                                    default :
                                        System.out.println("Option not available");
                                        cont();
                                }
                            case 6 :
                                System.out.println("Which volume do you want to convert the yard³?");
                                System.out.println("1 - liters\n" +
                                        "2 - m³\n" +
                                        "3 - cm³\n" +
                                        "4 - milliliters\n" +
                                        "5 - ft³\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of yard³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 764.555;
                                        System.out.println(d1 + " yard³ is equal to " + result + " liters");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of yard³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.764555;
                                        System.out.println(d1 + " yard³ is equal to " + result + " m³");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of yard³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 764555;
                                        System.out.println(d1 + " yard³ is equal to " + result + " cm³");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of yard³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 764555;
                                        System.out.println(d1 + " yard³ is equal to " + result + " milliliters");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of yard³:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 27;
                                        System.out.println(d1 + " yard³ is equal to " + result + " ft³");
                                        cont();

                                    default :
                                        System.out.println("Option not available");
                                        cont();
                                }
                        }
                    case 3 :
                        System.out.println("Which length you want to convert?");
                        System.out.println("1 - Carat" +
                                "2 - Gram\n" +
                                "3 - Kilogram\n" +
                                "4 - Ounce\n" +
                                "5 - Lbs\n" +
                                "6 - Tonne\n");
                        n = keyboard.nextInt();
                        switch (n){
                            case 1 :
                                System.out.println("Which length do you wanna convert the carats?");
                                System.out.println("1 - Gram\n" +
                                        "2 - Kilogram\n" +
                                        "3 - Ounce\n" +
                                        "4 - Lbs\n" +
                                        "5 - Tonne\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of carat:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.2;
                                        System.out.println(d1 + " carats is equal to " + result + " grams");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of carat:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.0002;
                                        System.out.println(d1 + " carats is equal to " + result + " kilos");
                                        cont();

                                    case 3 :
                                        System.out.println("Type the amount of carat:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.00705479;
                                        System.out.println(d1 + " carats is equal to " + result + " ounces");
                                        cont();

                                    case 4 :
                                        System.out.println("Type the amount of carat:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.000440925;
                                        System.out.println(d1 + " carats is equal to " + result + " lbs");
                                        cont();

                                    case 5 :
                                        System.out.println("Type the amount of carat:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.0000002;
                                        System.out.println(d1 + " carats is equal to " + result + " tonnes");
                                        cont();

                                    default :
                                        System.out.println("Option not available");
                                        cont();
                                }
                            case 2 :
                                System.out.println("Which length do you wanna convert the grams?");
                                System.out.println("1 - Carat\n" +
                                        "2 - Kilogram\n" +
                                        "3 - Ounce\n" +
                                        "4 - Lbs\n" +
                                        "5 - Tonne\n");
                                n = keyboard.nextInt();
                                switch (n){
                                    case 1 :
                                        System.out.println("Type the amount of grams:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 5;
                                        System.out.println(d1 + " grams is equal to " + result + " carats");
                                        cont();

                                    case 2 :
                                        System.out.println("Type the amount of grams:");
                                        d1 = keyboard.nextDouble();
                                        result = d1 * 0.001;
                                        System.out.println(d1 + " grams is equal to " + result + " kilograms");
                                        cont();
                                }
                        }
                }

                default:
                    System.out.println("Option not available!!");
                    break;
        }

    }

   /* public void rest(int n1) {
        if (n1 > 0) {
            rest(n1 / 2);
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