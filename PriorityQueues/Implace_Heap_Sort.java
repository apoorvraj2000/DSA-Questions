package PriorityQueues;

public class Implace_Heap_Sort {
	public static void inplaceHeapSort(int arr[]) {
        //Convert array into max Heap
        for(int i=0;i<arr.length;i++){
            convertMAxHeap(arr,i);
        }
        for(int i=0;i<arr.length;i++){
           arr[arr.length-1-i] =remove(arr,arr.length-i);
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static int remove(int []arr,int size){
        int result=arr[0];
        arr[0]=arr[size-1];
        size--;
        
        int index=0;
        int maxIndex=index;
        int leftChildIndex=(2*index)+1;
        int rightChildIndex=(2*index)+2;
        
        while(leftChildIndex<size){
            if(arr[leftChildIndex]>arr[maxIndex]){
                maxIndex=leftChildIndex;
            }
            if(rightChildIndex<size && arr[rightChildIndex]>arr[maxIndex]){
                maxIndex=rightChildIndex;
            }
            
            if(maxIndex==index){
                break;
            }else{
               //swap
               int temp=arr[index];
                arr[index]=arr[maxIndex];
                arr[maxIndex]=temp;
                
                index=maxIndex;
                leftChildIndex=(2*index)+1;
        		rightChildIndex=(2*index)+2;
            }
        }
        return result;
    }
       public static void convertMAxHeap(int []arr,int i){
        int childIndex=i;
        int parentIndex=(childIndex-1)/2;
        
        while(childIndex>0){
            if(arr[childIndex]>arr[parentIndex]) {
				int temp=arr[childIndex];
				arr[childIndex]=arr[parentIndex];
                arr[parentIndex]=temp;
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}else {
				return;
			}
         }
      }
}
