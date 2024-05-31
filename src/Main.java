import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        double[] arrDouble = {1.57,7.654,9.986};
        int[] arrIntCustom = {4,5,6};

        System.out.println("Задача 2");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]);
            if (i != arrInt.length - 1) System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]);
            if (i != arrInt.length - 1) System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrIntCustom[i]);
            if (i != arrInt.length - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrInt[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i = 2; i >=0; i--) {
            System.out.print(arrDouble[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrIntCustom[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arrInt));

    }
}