package GroupProjectExercise;

public class Task8 {

    public static void main(String[] args) {

     //Maximum and minimum number in the array?

 int[] num= {12,33,45,6,77,66,56,89,97,32,21};

 int max=num[0];
 int min=num[0];

        for (int i = 0; i < num.length; i++) {

            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }

        System.out.println("Max number is "+max);
        System.out.println();
        System.out.println("Min number is "+min);






    }
}
