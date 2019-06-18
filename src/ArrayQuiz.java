import java.util.Scanner;
public class ArrayQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare an aray
        int array[] = new int[5];
        array[0] = 2;
        array[0] = 4;
        array[0] = 6;
        array[0] = 8;
        array[0] = 10;
        //get the length of the array
        System.out.println(array.length);

        //printing values in the arrray
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //populate the array with user array
        System.out.println("please enter numbers");

        for ( int j = 0;
        j< (array.length - 1);
        j++){
            //saving values in the array
            array[j] = input.nextInt();
        }
        //printing the values in the array
        for (int j = 0; j < (array.length - 1); j++) {
            System.out.println(array[j]);
        }
    }
}