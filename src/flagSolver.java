


public class flagSolver {
    /**
     * 
     * @author wallaceb manuellae
     *  
     * @purpose To take an ussorted array of 'r', 'w', and 'b',
     * and arrange them so that it resembles a Dutch "national"
     * flag
     * 
     * @parameters An array composed of elements containing only 1, 2, or 3
     *  
     * @produces A sorted Dutch flag
     * 
     * @preconditions Input array must be an char array of
     *  only the integers 1, 2, and 3. 1 represents red, 2 represents white,
     *  and 3 represents blue.
     *  	
     * @postconditions Output array has the same number of
     *  1, 2, and 3 s as the original array.
     *  1s are first, 2s are in the middle, and 3s are last.	
     *  
     */
    
    // r = 1 w = 2 b = 3
    public int[] flagSolve(int arr[]){
	
	int pos[] = {-1, -1 ,-1}; //copunts in order red, white and blue
	int temp;
	for (int i = 0; i < arr.length; i++){

	    if (pos[arr[i]] != -1 && arr[i] < arr[i - 1]){
		temp = arr[pos[arr[i]] + 1];
		arr[pos[arr[i]] + 1] = arr[i];
		arr[i] = temp;
	    }
	    else{
		pos[arr[i]] = i;
	    }
	    
	}
	
	return arr;


    }
    /**
     * 
     * @author wallaceb manuellae
     *  
     * @purpose To take an ussorted array of 'r', 'w', and 'b',
     * and arrange them so that it resembles a Dutch "national"
     * flag
     * 
     * @parameters An array composed of elements containing only 1, 2, or 3
     *  
     * @produces A sorted Dutch flag
     * 
     * @preconditions Input array must be an char array of
     *  only the integers 1, 2, and 3. 1 represents red, 2 represents white,
     *  and 3 represents blue.
     *  	
     * @postconditions Output array has the same number of
     *  1, 2, and 3 s as the original array.
     *  1s are first, 2s are in the middle, and 3s are last.	
     * 
     * @Ponderings Is there a more efficient solution?
     * 
     */
    

    public int[] flagSolveAlternate(int arr[]){

	int r= 0;
	int w = 0;
	int b = 0;

	for (int val : arr){ // Count the occurences of each color
	    switch (val) {
	    case 1:
		r++;
		break;
	    case 2:
		w++;
		break;
	    case 3:
		b++;
		break;
	    }// Switch	    
	}// For
	
	int[] output = new int[arr.length];
	int i;
	
	for(i = 0; i > r; i++){
	    if(i < r){
		output[i] = 1;
	    } //if
	    
	    if(i + r < w + r){
		output[i] = 2;
	    } //if
	    
	    if(i + r + w < r + w + b){
		output[i] = 3;
	    } //if
	    
	}//for
	arr = output;
	return arr;

	}
    


}
