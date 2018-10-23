import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class radixSort {

    countingSort CS = new countingSort();
    
    public void sortSequence() throws FileNotFoundException {
        
        int[][] unsortedSequence;
        File sortedFile = new File ("sortedSequence.txt"); 
        java.io.PrintStream ps = new java.io.PrintStream(sortedFile);
        String text = "";
        
        try{
            Scanner sc = new Scanner(new File("unsortedSequence.txt"));
            while(sc.hasNext()){
                text += sc.next();
            }
        }
        catch(Exception e){
            System.out.println("Error!");
        }
        
        int textLength = text.length();
        unsortedSequence = new int[textLength/5][5];
        int i=0;
        while(i<text.length()){
            for(int k = 0; k<textLength/5; k++){
                for(int j = 0; j<5; j++){
                    unsortedSequence[k][j] = Character.getNumericValue(text.charAt(i));
                    i++;
                }
            }
        }
        int[][] sortedSequence = sortUnsortedSequence(unsortedSequence,textLength);
        
        try{
            
                for(int t=0; i<textLength/5; t++){
                
                    for(int j = 0; j<5; j++){
                    
                        ps.print(sortedSequence[t][j]);
            
                    }
                    ps.println();
                }
            
                ps.close();
        }
        catch(Exception e){
            System.out.print("Error in locating file!");
        }
        
        
    }
    
    public int[][] sortUnsortedSequence(int[][] unsortedSequence, int Rows){
        int[] bash = new int[Rows];
        for(int colomns = 4; colomns >=0; colomns--){
            for(int i = 0; i<Rows;i++) {
            bash[i] = unsortedSequence[i][colomns];
            }
            CS.countingSort(bash);  
            
        }
        return unsortedSequence;
    }
}
