public class Solution {
    public int maxRotateFunction(int[] A) {
        int max = -1;
        int functionResult;
        int index;
        
        if(A.length == 0)
            return 0;
        for(int a = 0; a < A.length; a++) {
            functionResult = 0;
            index = (a == 0) ? a : (A.length - a);
            for(int b = 0; b < A.length; b++) {
                if(index == A.length)
                    index = 0;
                functionResult += A[index++] * b;
            }
            if(functionResult > max || max == -1) 
                max = functionResult;
        }
        return max;
    }
}
