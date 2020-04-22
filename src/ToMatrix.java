import java.util.Scanner;

public class ToMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива Х: ");
        int sizeX = input.nextInt();
        System.out.println("Введите размер массива Y: ");
        int sizeY = input.nextInt();
        int array[][] = new int[sizeY][sizeX];

        System.out.println("Введите массив:");
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                array[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.print ("Вывод первой строки * 3:");
        for (int j = 0; j < sizeX; j++) {
            System.out.print (" " + array[0][j]*3);
        }
    }
}
