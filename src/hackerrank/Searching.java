package hackerrank;

public class Searching {
	
	public static void main(String[] args) {
		 String[] queries = new String[] {"qwe","rty","asdfg","pil"}; 
		 String[] strings = new String[] {"asdfg","qwe","rty","qwe","asdfg","qwe","rty","asdfg","poi"};                            
		 matchingStrings(strings, queries); 
	}
	
	// Complete the matchingStrings function below.
	static int[] matchingStrings(String[] strings, String[] queries) {

        int []temp = new int[queries.length];
        
        //Creating array to store occurrence 
        for(int i = 0;i<queries.length;i++){
            temp[i] = 0;
        }
   
        for(int i =0;i<queries.length;i++){
            for(int j =0;j<strings.length;j++){
                if(queries[i].equals(strings[j])) 
                	temp[i]+=1;                
            }
            System.out.println(temp[i]);
        }
		return temp;
    }
}
























