package timsorte;
/**
 * Ordena usando o método da inserção
 * @author udesc
 */
public class MergeSortStrategy  {


	/**
	 * Implementa a ordenação por merge
	 */
	
//	public int[] mergeSort(int[] array) {
//
//	    if(array.length > 1)     {  
//	        int elementsInA1 = array.length/2;  
//	        int elementsInA2 = array.length - elementsInA1;  
//	        int arr1[] = new int[elementsInA1];  
//	        int arr2[] = new int[elementsInA2];  
//	          
//	        for(int i = 0; i < elementsInA1; i++)  
//	            arr1[i] = array[i];  
//	  
//	        for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)  
//	            arr2[i - elementsInA1] = array[i];  
//	  
//	        arr1 = mergeSort(arr1);  
//	        arr2 = mergeSort(arr2);  
//	          
//	        int i = 0, j = 0, k = 0;  
//	  
//	        while(arr1.length != j && arr2.length != k) {  
//	            if(arr1[j] <= arr2[k]) {  
//	                array[i] = arr1[j];  
//	                i++;  
//	                j++;  
//	            } else {  
//	                array[i] = arr2[k];  
//	                i++;  
//	                k++;  
//	            }  
//	        }  
//	        while(arr1.length != j) {  
//	            array[i] = arr1[j];  
//	            i++;  
//	            j++;  
//	        }  
//	        while(arr2.length != k) {  
//	            array[i] = arr2[k];  
//	            i++;  
//	            k++;  
//	        }  
//	    }  
//	    return array;  
//	}
    // original array is broken in two parts
    // left and right array
    public void mergeSort(int arr[], int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int i = 0; i < len1; i++)
            left[i] = arr[l + i];
        for (int i = 0; i < len2; i++)
            right[i] = arr[m + 1 + i];

        int i = 0;
        int j = 0;
        int k = l;

        // after comparing, we merge those two array
        // in larger sub array
        while (i < len1 && j < len2)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left, if any
        while (i < len1)
        {
            arr[k] = left[i];
            k++;
            i++;
        }

        // copy remaining element of right, if any
        while (j < len2)
        {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}