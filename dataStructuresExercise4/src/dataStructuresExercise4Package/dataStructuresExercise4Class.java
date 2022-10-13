package dataStructuresExercise4Package;

import java.util.Arrays;

public class dataStructuresExercise4Class {
	
	public static int[] insertSort(int arr[]) {
		int El;
		int x, j;
		for(int i=arr.length-1 ; i>=0; i--) {
			j = i+1;
			El = arr[i];
			while(j < arr.length && El < arr[j]) {
				x = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = x;
				j++;
				System.out.println("\n"+Arrays.toString(arr));

			}
		}
		return arr;
	}
	
	public static int[] selectSort(int arr[]) {
		int min, x;
		for(int i=arr.length-1; i>=0; i--) {
			min = i;
			for(int j=i-1; j>=0; j--) {
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			if(min != i) 
			{
				x = arr[min];
				arr[min] = arr[i];
				arr[i] = x;
				System.out.println("\n"+Arrays.toString(arr));
			}
		}
		return arr;
	}
	
	public static int[] bubbleSort(int arr[]) {
        for(int i = arr.length - 1; i >= 0; i--) {
        	for(int j = arr.length - 1; j >0 ; j--) {
        		if(arr[j-1] > arr[j]) 
                {
                    int x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                    System.out.println("\n"+Arrays.toString(arr));
                }
        	}
        }
        return arr;
    }
	
	public static int[] shakeSort(int arr[]) {
        boolean flag = true;
        int start = 0;
        int end = arr.length;
 
        while(flag == true) {
            flag = false;

            for(int i = start; i < end - 1; i++) {
                if (arr[i] > arr[i + 1]) 
                {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    flag = true;
                }
            }
            if(flag == false)
            {
            	break;
            }
            flag = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1])
                {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    flag = true;
                }
            }
            start = start + 1;
        }
        return arr;
    }
	
	public static void merge(int arr[], int left, int right, int mid) {
		   int i, j, k;
		   int bound1 = mid + 1 - left;
		   int bound2 = right-mid;
		   int[] leftArr = new int[bound1];
		   int[] rightArr = new int[bound2];
		   for(i = 0; i<bound1; i++) {
			   leftArr[i] = arr[left+i];
		   }
		   for(j = 0; j<bound2; j++) {
			   rightArr[j] = arr[mid+1+j];
		   }
		   i = j = 0;
		   k = left;
		   while(i<bound1 && j<bound2) {
		      if(leftArr[i] <= rightArr[j]) 
		      {
		         arr[k] = leftArr[i];
		         i++;
		      } 
		      else 
		      {
		         arr[k] = rightArr[j];
		         j++;
		      }
		      k++;
		   }

		   while(i < bound1) {
		      arr[k] = leftArr[i];
		      i++;
		      k++;
		   }
		   while(j < bound2) {
		      arr[k] = rightArr[j];
		      j++;
		      k++;
		   }
		}
		public static void mergeSort(int Arr[]){
			int n = Arr.length;
		    for(int size=1; size<n; size*=2) {
		    	for(int L=0; L<n; L+=(2*size)) {
		        	int mid;
		        	int R;
		        	if(L + size - 1 < n - 1)
		        	{
		        		mid = (L + size - 1);
		        	}
		        	else
		        	{
		        		mid = (n - 1);
		        	}
		        	
		          	if(L + 2*size - 1 < n-1)
		        	{
		        		R = L + 2*size - 1;
		        	}
		        	else
		        	{
		        		R=n-1;
		        	}
		            merge(Arr, L,R,mid);
		        }
		    }
		}
		
		static int partition(int[] arr, int low, int high)
		{
		    int pivot = arr[high];
		    int temp;
		    int i = (low - 1);
		    for(int j = low; j <= high - 1; j++)  {
		        if (arr[j] < pivot)
		        {
		            i++;
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		    temp = arr[i+1];
		    arr[i+1] = arr[high];
		    arr[high] = temp;
		    return (i + 1);
		}
		 
		static void quickSort(int[] arr, int low, int high)
		{
		    if (low < high)
		    {
		        int pi = partition(arr, low, high);
		        quickSort(arr, low, pi - 1);
		        quickSort(arr, pi + 1, high);
		    }
		}
	
	public static void main(String[] args) {
		
		int testArr[] = {76,71, 5, 57,12,50,20,93,20,55,62,3};
//		mergeSort(testArr, testArr.length);
//		System.out.println("\n"+Arrays.xtoString(testArr));
		mergeSort(testArr);
		System.out.println("\n"+Arrays.toString(testArr));
	}
}
