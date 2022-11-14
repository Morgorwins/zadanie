package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет введите арефметическое вырожение:");
        Scanner sr = new Scanner(System.in);
        String a;
        int a1 = 0, b1 = 0, c = 0, f = 0;
        a = sr.nextLine();//вырожение ввод в строку из кансоли
        String[] vp = a.split(" ");//метод находит в строке пробел то запихивает куски вырожения в "" в массив.
        try {
            if (vp.length>3) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return;
            }
        }
        catch (Exception ex) { ex.printStackTrace();}
            int[] ara = new int[2];
            int[] rim = new int[2];
        for (int k = 0; k < ara.length; k++) {
            for (int i = 0; i < vp.length; i++) {
                if (vp[i].equals("1")) {
                    ara[k] = 1;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("2")) {
                    ara[k] = 2;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("3")) {
                    ara[k] = 3;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("4")) {
                    ara[k] = 4;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("5")) {
                    ara[k] = 5;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("6")) {
                    ara[k] = 6;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("7")) {
                    ara[k] = 7;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("8")) {
                    ara[k] = 8;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("9")) {
                    ara[k] = 9;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
                if (vp[i].equals("10")) {
                    ara[k] = 10;
                    a1 = a1 + 1;
                    k = k + 1;
                    continue ;
                }
            }
        }
        for (int g = 0; g < rim.length; g++) {
            for (int i = 0; i < vp.length; i++) {
                if (vp[i].equals("I")) {
                    rim[g] = 1;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("II")) {
                    rim[g] = 2;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("III")) {
                    rim[g] = 3;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("IV")) {
                    rim[g] = 4;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("V")) {
                    rim[g] = 5;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("VI")) {
                    rim[g] = 6;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("VII")) {
                    rim[g] = 7;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("VIII")) {
                    rim[g] = 8;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("IX")) {
                    rim[g] = 9;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }
                if (vp[i].equals("X")) {
                    rim[g] = 10;
                    b1 = b1 + 1;
                    g = g + 1;
                    continue;
                }

            }
        }
        if (a1 == 1 && b1 == 1)
        {System.out.println("throws Exception //т.к. используются одновременно разные системы счисления"); return;}
        if (a1 == 0 && b1 == 0)
        {System.out.println("throws Exception //т.к. не верно введенные данные"); return;}
        if (a1 == 1 && b1 == 0 || a1 == 0 && b1 == 1)
        {System.out.println("throws Exception //т.к. не верно введенные данные"); return;}
        if (ara[0]>=1 && ara[1]<=10){
          for (int i = 0; i < vp.length; i++) {
              if (vp[i].equals("+")) {
                  c = ara[0] + ara[1];
              }
              if (vp[i].equals("-")) {
                  c = ara[0] - ara[1];
              }
              if (vp[i].equals("*")) {
                  c = ara[0] * ara[1];
              }
              if (vp[i].equals("/")) {
                  c = (int) (ara[0] / ara[1]);
              }
          }
            System.out.println("c= " + c);
        } else
        if (rim[0]>=1 && rim[1]<=10){
            for (int i = 0; i < vp.length; i++) {
                if (vp[i].equals("+")) {
                    f = rim[0] + rim[1];
                }
                if (vp[i].equals("-")) {
                    f = rim[0] - rim[1];
                    if (f<1) { System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел и 0");
                        return;}
                }
                if (vp[i].equals("*")) {
                    f = rim[0] * rim[1];
                }
                if (vp[i].equals("/")) {
                   f = (int) (rim[0] / rim[1]);
                }
            }
        }
        switch (f) {
            case 1:
                System.out.println("Ответ = I");
                break;
            case 2:
                System.out.println("Ответ = II");
                break;
            case 3:
                System.out.println("Ответ = III");
                break;
            case 4:
                System.out.println("Ответ = IV");
                break;
            case 5:
                System.out.println("Ответ = V");
                break;
            case 6:
                System.out.println("Ответ = VI");
                break;
            case 7:
                System.out.println("Ответ = VII");
                break;
            case 8:
                System.out.println("Ответ = VIII");
                break;
            case 9:
                System.out.println("Ответ = IX");
                break;
            case 10:
                System.out.println("Ответ = X");
                break;
            case 11:
                System.out.println("Ответ = XI");
                break;
            case 12:
                System.out.println("Ответ = XII");
                break;
            case 13:
                System.out.println("Ответ = XIII");
                break;
            case 14:
                System.out.println("Ответ = XIV");
                break;
            case 15:
                System.out.println("Ответ = XV");
                break;
            case 16:
                System.out.println("Ответ = XVI");
                break;
            case 17:
                System.out.println("Ответ = XVII");
                break;
            case 18:
                System.out.println("Ответ = XVIII");
                break;
            case 19:
                System.out.println("Ответ = XIX");
                break;
            case 20:
                System.out.println("Ответ = XX");
                break;
            case 21:
                System.out.println("Ответ = XXI");
                break;
            case 22:
                System.out.println("Ответ = XXII");
                break;
            case 23:
                System.out.println("Ответ = XXIII");
                break;
            case 24:
                System.out.println("Ответ = XXIV");
                break;
            case 25:
                System.out.println("Ответ = XXV");
                break;
            case 26:
                System.out.println("Ответ = XXVI");
                break;
            case 27:
                System.out.println("Ответ = XXVII");
                break;
            case 28:
                System.out.println("Ответ = XXVIII");
                break;
            case 29:
                System.out.println("Ответ = XXIX");
                break;
            case 30:
                System.out.println("Ответ = XXX");
                break;
            case 31:
                System.out.println("Ответ = XXXI");
                break;
            case 32:
                System.out.println("Ответ = XXXII");
                break;
            case 33:
                System.out.println("Ответ = XXXIII");
                break;
            case 34:
                System.out.println("Ответ = XXXIV");
                break;
            case 35:
                System.out.println("Ответ = XXXV");
                break;
            case 36:
                System.out.println("Ответ = XXXVI");
                break;
            case 37:
                System.out.println("Ответ = XXXVII");
                break;
            case 38:
                System.out.println("Ответ = XXXVIII");
                break;
            case 39:
                System.out.println("Ответ = XXXIX");
                break;
            case 40:
                System.out.println("Ответ = XL");
                break;
            case 41:
                System.out.println("Ответ = XLI");
                break;
            case 42:
                System.out.println("Ответ = XLII");
                break;
            case 43:
                System.out.println("Ответ = XLIII");
                break;
            case 44:
                System.out.println("Ответ = XLIV");
                break;
            case 45:
                System.out.println("Ответ = XLV");
                break;
            case 46:
                System.out.println("Ответ = XLVI");
                break;
            case 47:
                System.out.println("Ответ = XLVII");
                break;
            case 48:
                System.out.println("Ответ = XLVIII");
                break;
            case 49:
                System.out.println("Ответ = XLIX");
                break;
            case 50:
                System.out.println("Ответ = L");
                break;
            case 51:
                System.out.println("Ответ = LI");
                break;
            case 52:
                System.out.println("Ответ = LII");
                break;
            case 53:
                System.out.println("Ответ = LIII");
                break;
            case 54:
                System.out.println("Ответ = LIV");
                break;
            case 55:
                System.out.println("Ответ = LV");
                break;
            case 56:
                System.out.println("Ответ = LVI");
                break;
            case 57:
                System.out.println("Ответ = LVII");
                break;
            case 58:
                System.out.println("Ответ = LVIII");
                break;
            case 59:
                System.out.println("Ответ = LIX");
                break;
            case 60:
                System.out.println("Ответ = LX");
                break;
            case 61:
                System.out.println("Ответ = LXI");
                break;
            case 62:
                System.out.println("Ответ = LXII");
                break;
            case 63:
                System.out.println("Ответ = LXIII");
                break;
            case 64:
                System.out.println("Ответ = LXIV");
                break;
            case 65:
                System.out.println("Ответ = LXV");
                break;
            case 66:
                System.out.println("Ответ = LXVI");
                break;
            case 67:
                System.out.println("Ответ = LXVII");
                break;
            case 68:
                System.out.println("Ответ = LXVIII");
                break;
            case 69:
                System.out.println("Ответ = LXIX");
                break;
            case 70:
                System.out.println("Ответ = LXX");
                break;
            case 71:
                System.out.println("Ответ = LXXI");
                break;
            case 72:
                System.out.println("Ответ = LXXII");
                break;
            case 80:
                System.out.println("Ответ = LXXX");
                break;
            case 81:
                System.out.println("Ответ = LXXXI");
                break;
            case 90:
                System.out.println("Ответ = XC");
                break;
            case 100:
                System.out.println("Ответ = C");
                break;

        }
    }
}
