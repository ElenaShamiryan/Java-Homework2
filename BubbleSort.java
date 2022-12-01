package DZ2;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;


public class BubbleSort {
 
    public static void main(String[] args) throws SecurityException, IOException  {

        Logger logger = Logger.getLogger(Ex1.class.getName()); 
        FileHandler fh = new FileHandler("log.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);             
        logger.addHandler(fh);

        logger.log(Level.INFO,"Запуск программы");
         

    // private static void sorted(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        logger.log(Level.INFO,"Пользователь ввел количество элементов массива: " + size);
        int array[] = new int[size];
        Random rnd = new Random();
        boolean isSorted = false;
        int temp; 
        System.out.println("Массив случайных чисел от 0 до 100: ");
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(101);
            System.out.print(array[i] + " ");
            Integer.toString(array[i]);
        }
        logger.log(Level.INFO,"Сгенерирован массив случайных чисел" + Arrays.toString(array));

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < size; i++) {
                if ( array[i] < array[i-1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    
                    logger.log(Level.INFO,"Число {0} поменялось с числом {1} ", new Object[]{array[i],array[i-1]});
                }
            }
        }
        System.out.println();
        System.out.println("Массив отсортирован: ");
        System.out.print(Arrays.toString(array));
        logger.log(Level.INFO,"Массив отсортирован по возрастанию " + Arrays.toString(array));
        logger.log(Level.INFO,"Программа завершилась.");
    } 
} 
