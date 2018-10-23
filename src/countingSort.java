
public class countingSort {
     
    public int[] countingSort(int[] array){
        
        int[] sortedArray = new int[array.length];
        int[] count = new int[10];
        
        // # of the same elements 
        for(int j = 0; j < array.length; j++){
            
            count[array[j]] = count[array[j]]+1;
        
        }
        
        // # of the elements previous;
        for(int i = 1; i < count.length; i++){
            
            count[i] = count[i] + count[i-1];
            
        }
        
        // fill up sorted array based on max available position from count
        for(int j = array.length-1; j>=0; j--){
            
            sortedArray[count[array[j]]-1] = array[j];
            count[array[j]] = count[array[j]] - 1;
            
        }
        
        return sortedArray;
        
    }
        
}
