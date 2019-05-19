//Write a function to find the longest common prefix string amongst an array of strings.
class Solution{
	public String LCP(String[] strs){
		if(strs.length == 1){ return strs[0];}
	int min = Integer.MAX_VALUE;
	for(int i= 0; i<= (n-1);i++){
		if(arr[i].length()<min){
			min = arr[i].length();
		}
	}
	return min;
	}

	static boolean allContainPrefix(String arr[], int n
	String str, int start, int end)
	{
		for (int i =0; i<=(n-1); i++){
			String arr_i = arr[i];

			for(int j = satrt;j<=end;j++){
				if(arr_i.charAt(j)!=str.charAt(j)){
					return false;

				}
			}
		}
	return true;ß
	}
	    // A Function that returns the longest common prefix 
    // from the array of strings 
    static String commonPrefix(String arr[], int n) 
    { 
        int index = findMinLength(arr, n); 
        String prefix = ""; // Our resultant string 
  
        // We will do an in-place binary search on the 
        // first string of the array in the range 0 to 
        // index 
        int low = 0, high = index; 
        while (low <= high) { 
              
            // Same as (low + high)/2, but avoids  
            // overflow for large low and high 
            int mid = low + (high - low) / 2; 
  
            if (allContainsPrefix(arr, n, arr[0], low, 
                                                  mid)) 
            { 
                // If all the strings in the input array 
                // contains this prefix then append this 
                // substring to our answer 
                prefix = prefix + arr[0].substring(low, 
                                          mid + 1); 
  
                // And then go for the right part 
                low = mid + 1; 
            }  
            else // Go for the left part 
            { 
                high = mid - 1; 
            } 
        } 
  
        return prefix; 
}