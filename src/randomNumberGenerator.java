import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;


public class randomNumberGenerator {
    
    
    
    public void generateSequence(int numberOfZipCodes) throws FileNotFoundException{
        
        Random rd = new Random();
        int[][] finalSequence = new int[numberOfZipCodes][5];
        
        for(int i=0; i<numberOfZipCodes; i++){
            
            for(int j = 0; j<5; j++){
                
                finalSequence[i][j] = rd.nextInt(10);
            }
        }
        
        File file = new File ("unsortedSequence.txt"); 
        java.io.PrintStream ps = new java.io.PrintStream(file);
        
        if(file.exists()){
            
            for(int i=0; i<numberOfZipCodes; i++){
                
                for(int j = 0; j<5; j++){
                    
                    ps.print(finalSequence[i][j]);
            
                }
                ps.println();
            }
            
        ps.close();
        }
        
    }
}
