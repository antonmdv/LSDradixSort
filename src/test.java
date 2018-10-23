import java.io.FileNotFoundException;


public class test {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        countingSort cs = new countingSort();
        int[] unsortedSequence = {6,7,8,9,3,1,5,6,2,4,8,5,8,4};
        
        int[] sortedSequence = cs.countingSort(unsortedSequence);
        
        randomNumberGenerator RNG = new randomNumberGenerator();
        RNG.generateSequence(10);
        
        radixSort RS = new radixSort();
        RS.sortSequence();
        
      /*  for(int row = 0; row<14; row++){
            
                System.out.print(unsortedSequence[row]);
                System.out.print(" ");
        }
        
        System.out.println("");
        System.out.println("");
        
        for(int row = 0; row<14; row++){
            
            System.out.print(sortedSequence[row]);
            System.out.print(" ");
            
      */
    }
}
