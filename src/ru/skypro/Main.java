package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // example 1 & 2
        // a
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i !=numbers.length - 1) System.out.print(", ");
        }
        System.out.println();
        // b
        double[] part = {1.57, 7.654, 9.986};
        for (int u = 0; u<part.length; u++) {
            System.out.print(part[u]);
            if (u !=part.length-1) System.out.print(", ");
        }
        System.out.println();
        // c
        int[] number = new int[5];
        for (int i = 0; i <number.length; i++) {
            number[i] = i*10;
        }
        for (int i = 0; i <number.length; i++) {
            System.out.print(number[i]);
            if (i !=number.length-1) System.out.print(", ");
        }
        System.out.println();
        // example 3

        int[] iphone = new int[]{1, 2, 3};
        for (int i = iphone.length - 1; i >=0; i--){
            System.out.print(iphone[i]);
            if (i>0) System.out.print(", ");
        }
        System.out.println();

        double[] bear = {1.57, 7.654, 9.986};
        for (int i = bear.length - 1; i>=0; i--) {
            System.out.print(bear[i]);
            if (i>0) System.out.print(", ");
        }
        System.out.println();

        int[] dota = new int[5];
        for (int i = dota.length-1; i>=0;i--){
            dota[i] = i*10;
        }
        for (int i = dota.length-1; i>=0; i--){
            System.out.print(dota[i]);
            if (i>0) System.out.print(", ");
        }

        System.out.println();

        // example 4
        //int[] rise = new int[]{1, 2, 3};  тут я попал в тупик не знал как разрулить и пошел в слак просить помощи
        //for (int i = 0; i<rise.length; i++){   но и после подсказки я особо не понял как делать и везде накосячил
        //  rise[i] = i+1;
        //}
        //for (int i = 0; i<rise.length; i++){
        //  System.out.print((rise[i]+1) + ", ");
        //}

        int[] arrOne = new int[]{1, 2, 3};
        for (int i = 0; i < arrOne.length; i++) {
            switch (arrOne[i] % 2) {
                case 0: System.out.print(arrOne[i]); break;
                case 1: System.out.print(++arrOne[i]); break;
            }
            if (i != arrOne.length - 1) System.out.print(", ");
        }
    }
}
