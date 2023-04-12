
/**
 * 비정방형 배열을 만들어 값을 초기화,출력,각 행의 값 출력 해주는 프로그램 
 * 
 * @author (13팀_2020315015 윤용호, 2018315031 박성현) 
 * @version (2023.04.10)
 */
public class RaggedArray
{
    public static int[][] makeArray(){
        int[][] raggedArray;
        raggedArray = new int[4][];
        raggedArray[0] = new int[3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[3];
        raggedArray[3] = new int[2];
        
        return raggedArray;
    }
    
    public static int[][] initializeArray(int[][] resetArray){
        int[][] intArray;
        intArray = resetArray;
        for(int i= 0 ; i<intArray.length ; i++ ){
            for( int j = 0; j<intArray[i].length; j++){
                intArray[i][j] = (i+1)*10 +j;
            }
        }
        return intArray;
    }
    
    public static void printArray(int[][] outputArray){
        int[][] displayArray;
        displayArray = outputArray;
        for(int i = 0; i < displayArray.length; i++){
            for(int j = 0; j < displayArray[i].length; j++){
                System.out.print(displayArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void sumArray(int[][] totalArray){
        System.out.println("----------");
        int[] sum = new int[4];
        for(int i = 0; i < totalArray.length; i++){
            for(int j = 0; j < totalArray[i].length; j++){
                sum[i] += totalArray[i][j];
            }
            System.out.println(sum[i]);
        }
    }
    
    public static void main(String[] args){
        int[][] resultArray = makeArray();
        resultArray = initializeArray(resultArray);
        printArray(resultArray);
        sumArray(resultArray);
    }
}
