class BinarySearch{
  
     public static void main(String[] args) {
        
        int A[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key = 7;
        int upper = A.length - 1;
        int lower = 0;

        
        binarysearch(A, upper, lower, key);
    }  
  
	public static void binarysearch(int A[],int upper,int lower,int key){
		int mid = (upper+lower)/2;
		while(lower<=upper){
			if(key<A[mid]){
				upper = mid-1;
			}
			else if(key==A[mid]){
				System.out.println("Element is found @"+mid);
				break;
			}
			else if(key>A[mid]){
				lower = mid+1;
			}
			mid = (upper+lower)/2;
			}
			
			if(lower>upper){
			System.out.println("Element not found");
		    }   
		}
    	
}
