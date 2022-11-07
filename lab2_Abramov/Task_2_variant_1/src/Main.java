import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);



        int[] array = arrayInput(sc);
        printArray(array);
        printAverage(array);



    }
    public static int[] arrayInput(Scanner sc){
        System.out.println("Введіть кількість символів массиву: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введіть " + i + " елемент массиву: ");

            try {
                array[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Помилка: Вы ввели строку замість стовпця");
                System. exit(0);
            }catch (NumberFormatException c) {
                System.out.println("Помилка: Вы ввели невідповідний числовий тип");
                System. exit(0);
            }

        }
        return array;
    }
    public static void printArray(int[] array){
        System.out.println("Масив: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
            System.out.println();
        }
    }
    public static void printAverage(int[] array) throws Exception {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0){
                sum += array[i];
                counter ++;
            }
        }
        if(counter == 0){
            throw new Exception("Массив не містить позитивних значень");

        }

        System.out.println("Середнє серед додатніх числе массиву: " + sum / counter);
    }
}