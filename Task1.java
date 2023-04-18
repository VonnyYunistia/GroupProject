package GroupProjectExercise;

public class Task1 {

    public static void main(String[] args) {

     /*. Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.*/


int[][] tempOfWeek={{67,65,68,64,66,66,68},
                    {70,71,68,69,67,68,69},
                    {70,71,68,69,67,68,69},
                    {70,71,68,69,67,68,69},
                    {70,71,68,69,67,68,69},
};

        int max= tempOfWeek[0][0];

        for (int i = 0; i < tempOfWeek.length; i++) {
            for (int j = 0; j < tempOfWeek[i].length; j++){

              if(tempOfWeek[i][j] > max){

                  max=tempOfWeek[i][j];
              }

            }
        }
        System.out.print("the highest tempt of the week is "+max);

        System.out.println();

        int min= tempOfWeek[0][0];

        for (int i = 0; i < tempOfWeek.length; i++) {
            for (int j = 0; j < tempOfWeek[i].length; j++){

                if(tempOfWeek[i][j] < min){

                    min=tempOfWeek[i][j];
                }

            }
        }
        System.out.print("the lowest tempt of the week is "+min);


















    }
}
