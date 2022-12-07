import java.util.Scanner;
import java.util.Random;

public class SortingAlgorithms {
    /*
    read entire list
    remember smallest number
    swap smallest number with first number
    read list starting at second position
    loop
    */

    /*
    create array
    fill array with random numbers
    */
    public static void fillList (int[] List, int Size, int Min, int Max) {
        for (int i=0;i<Size;i++) {
            List[i] = randomNumber(Min,Max);
        }
    }

    //random number generator
    public static int randomNumber (int Min, int Max) {
        Random rand = new Random();
        int product;
        product = Min + rand.nextInt(Max-Min);
        return product;
    }
    public static void main(String[] args) {
        //create scanner
        Scanner scan = new Scanner(System.in);
        //ask for parameters
        System.out.println("how many numbers in the list?");
        int listSize = scan.nextInt();
        System.out.println("minimum range of numbers?");
        int minNum = scan.nextInt();
        System.out.println("maximum range of numbers?");
        int maxNum = scan.nextInt();
        //create array using given parameters
        int[] list = new int[listSize];
        //fill array using fillList method
        fillList(list, listSize, minNum,maxNum);
        //print array
        for (int i=0;i<listSize;i++) {
            System.out.println(list[i]);
        }
        //sort array

        //print array again
    }
}
