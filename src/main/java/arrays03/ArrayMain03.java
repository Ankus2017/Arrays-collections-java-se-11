package arrays03;

import java.util.Arrays;

public class ArrayMain03 {
    public static void main(String... args) {
        int[] ids = new int[10];
        System.out.println(ids); // adress space of the array in memory
        System.out.println(ids[0]); // 0

        int[] numbers01 = new int[]{35,28,46};
        int[] numbers02 = {34, 27, 45};

        String[] instruments = new String[3];
        System.out.println(instruments[0]); // null -> objects initialized to 0
        instruments[0] ="guitar";
        instruments[1] ="drums";
        instruments[2] ="bass";
        System.out.println(instruments[0]);



        //first type
        // you can put the [] before or after the variable name
        int [] ids2;
        int []ids3;
        int ids4[];
        int ids5 [];
        int[] ids6, ids7, ids8;

        System.out.println(instruments.length);

        System.out.println("---------------------------");

        for(int i = 0; i < ids.length; i++) {
            ids[i] = i * i;
            System.out.println(ids[i]);
        }

        System.out.println("---------------------------");
        for(String instrument: instruments) {
            System.out.println(instrument);
        }
        System.out.println("---------------------------");

        Arrays.sort(instruments);
        System.out.println(Arrays.toString(instruments));

        System.out.println("---------------------------");

        /*
        In mathematics, the Fibonacci sequence is a sequence in which
        each number is the sum of the two preceding ones.
        The sequence commonly starts from 0 and 1,
        although some authors start the sequence from 1 and 1
        or sometimes (as did Fibonacci) from 1 and 2.
        Starting from 0 and 1, the first few values in the sequence are:[1]

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
         */
        int[] fibArray = new int[] {0, 1, 5, 2, 3, 1, 8, 13};
        System.out.println(Arrays.binarySearch(fibArray, 3)); // arry not sorted -> unperdictable result
        Arrays.sort(fibArray);
        System.out.println(Arrays.toString(fibArray));
        System.out.println(Arrays.binarySearch(fibArray, 3));

        System.out.println("---------Comparison------------------");

        System.out.println(fibArray.equals(ids)); //compared the adress in memory, are the arrays referncing the same object in the memory heap

        System.out.println(Arrays.equals(fibArray, ids)); // compares the size and values

        System.out.println(Arrays.compare(fibArray, ids)); // bigger(positive) -> array 1 hase more elements, smaller (negative), equals( 0 ),  comparison

        System.out.println(Arrays.mismatch(fibArray, ids)); // comparison to find where arrays differ

        System.out.println("-------- varargs-------------------");

        System.out.println(Arrays.toString(args));

        System.out.println("-------- Multi-dimensional arrays-------------------");

        int[][] multiArray = new int[3][3];
        String[][] multiArray2 = new String[3][10];

        String[][] westCoastCitiesGrouped = new String[][]{
                {"LA", "San Francisco", "San Diego"},
                {"Seattle", "Tacoma"},
                {"Portland"},
        };

        for(int i = 0; i < westCoastCitiesGrouped.length; i++) {
            for(int ii = 0; ii < westCoastCitiesGrouped[i].length; ii++) {
                System.out.println(westCoastCitiesGrouped[i][ii]);
            }
        }

        for(String[] row : westCoastCitiesGrouped) {
            for(String city : row) {
                System.out.println(city);
            }
        }

        System.out.println(Arrays.toString(westCoastCitiesGrouped)); //address to memory space

    }

}
