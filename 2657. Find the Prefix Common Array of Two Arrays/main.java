class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int n=A.length;
       int count =0;
       int[] arr =new int[n+1];
       int[] ans=new int[n];
       for(int i=0;i<n;i++){
        if(++arr[A[i]]==2){
            count++;
        }
        if(++arr[B[i]]==2){
            count++;
        }
        ans[i]=count;
       }
       return ans;



       
        

    }
}