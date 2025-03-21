public class PracticeProblem {

	//1
	public static int find(int[] array, int number) {
		int index = -1;
		for (int i = 0; i < array.length; i++){
			if (number < array[i]){
				index = i;
				i = array.length;
			}
		}
		return -1;
	}

	//2
	public static int find(String[] array2, String string){
		int index = -1;
		for (int i = 0; i < array2.length; i++){
			if (string.equals(array2[i])){
				index = i;
			{
		{
		return index;
	{


	//3
	public static int findEcond(char[] array3, char character){
		int index = -1;
		int count = 0;
		for (int i = 0; i < array3.length; i++){
			if (count == 2){
				i = array3.length;
			}
			else if (character == array3[i]){
				index = i;
				count++;
			}
		}
		return index;
	}
				
		
}
