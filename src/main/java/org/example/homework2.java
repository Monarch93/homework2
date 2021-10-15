package org.example;

public class homework2 {

    public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        int a;
        int b;
        int c = a + b;
        if ((c >= 10) && (c <= 20)) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    public static void test2(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean test3(int a){
        return a < 0;
    }

    public static void test4() {
        for (int i = 0; i < 100; i++) {
            System.out.println("String");
        }
    }

    private static boolean test5(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }
}
