public class PracticeProblem {


    public static int find (int[] array, int number){
        int index = -1;
        for (int i =0; i<array.length; i++){
            if (number == array[i]){
                index = i;
                i = array.length;
            }
        }
        return index;
    }

    public static int findLast(String[] arr, String text){
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (text.equals(arr[i])){
                index = i;
            }   
        }
        return index;
    }

    public static int findSecond(char[] ar, char ch){
        int index = -1;
        int count = 0;
        for (int i = 0; i<ar.length; i++){
            if (count == 2){
                i = ar.length;
            }
            else if (ch == ar[i]){
                index = i;
                count++;
            }
        }
        return index;
    }
    

}

				
		
}
