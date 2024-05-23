package abderrazak.week8;

public class FindMaximumOfAnArray {

    public static void main(String[] args) {

        int [] array = {10,9,8,7,25,41,100,2,13,12};

        int maxNumber = findMaximum(array);

        System.out.println("maxNumber = " + maxNumber);
    }

    public static int findMaximum(int[] number ){

        if (number == null || number.length == 0){
            System.out.println("Array is empty or null");
        }

        int maxNum = number[0];
        for (int num : number) {
            if (num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
    }
}

