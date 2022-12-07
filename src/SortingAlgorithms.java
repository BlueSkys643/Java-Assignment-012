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
    public static void SortList (int[] List) {
        for (int i=0;i<List.length;i++) {
            int min = findMinIndex(List,i);
            swap(List, i, min);
        }
    }

    public static int findMinIndex (int[] List, int start) {
        int smolIndex = start;
        for (int i = start+1; i < List.length; i++) {
            if (List[i] < List[smolIndex]) {
                smolIndex=i;
            }
        }
        return smolIndex;
    }
    public static void swap (int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

    //fill array with random numbers
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
        //fill array using fillList method with given parameters
        fillList(list, listSize, minNum,maxNum);
        //print array
        for (int i=0;i<listSize;i++) {
            System.out.println(list[i]);
        }
        //sort array
        SortList(list);
        //print array again
        System.out.println("Sorted?");
        for (int i=0;i<listSize;i++) {
            System.out.println(list[i]);
        }
    }
}
