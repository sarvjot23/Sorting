
public class NewSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {7,90,154,5,97,599,23};  
        System.out.println("Before Selection Sort:");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);  
         
        System.out.println("After Selection Sort:");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
    }  
}  
