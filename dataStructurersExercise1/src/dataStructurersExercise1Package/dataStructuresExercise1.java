package dataStructurersExercise1Package;

public class dataStructuresExercise1 {
	public static int getSecondSmallest(int testArr[]) {
		int firstSmallest = findMax(testArr);
		int secondSmallest = firstSmallest;
		for(int i=0; i<testArr.length; i++) {
			if(testArr[i] < firstSmallest) 
			{
				firstSmallest = testArr[i];
			}
			else if(firstSmallest < secondSmallest && testArr[i] < secondSmallest) 
			{
				secondSmallest = testArr[i];
			}
		}
		return secondSmallest;
	}
	public static int findMax(int testArr[]) {
		int maxVal = testArr[0];
		for(int i=0; i<testArr.length; i++) {
			if(testArr[i] > maxVal)
			{
				maxVal = testArr[i];
			}
		}
		return maxVal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1, 2, 5, 6, 5, 3};
		System.out.println(getSecondSmallest(arr));
	}
}