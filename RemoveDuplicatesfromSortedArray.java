    public int removeDuplicates(int[] A) {
        if(A.length == 0)
            return 0;
        int index = 0;
        for(int i = 1; i < A.length; i ++){
            if(A[index] != A[i] )
                A[++index] = A[i];
        }
        
        return index + 1;
    }