package GroupProjectExercise;

public class Task4 {

    public static void main(String[] args) {

/*Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array*/

        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

int sum=0;

        for (int[] ints : arr2D) {
            for (int anInt : ints)
                if (anInt % 2 == 0) {
                    sum=sum+anInt;
                }


        } System.out.print(sum+" ");


        System.out.println();

        for (int[] ints : arr2D) {
            for (int anInt : ints)
                if (anInt % 2 != 0) {
                    sum=sum+anInt;

                }

        }System.out.print(sum+" ");

















    }
}
