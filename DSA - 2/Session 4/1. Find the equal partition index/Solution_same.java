// Time : O(n)
// Space: O(n)
static int equalPartition(int n, long arr[]) {
long suffix [] = new long [n];
    suffix[n-1]  = arr[n-1];
    for(int i=n-2; i >= 0; i--){
        suffix[i] = suffix[i+1] + arr[i];
    }

    long prefixSum = 0;
    for(int i=1; i<n-1; i++){
        prefixSum += arr[i-1];
        if(prefixSum == suffix[i+1]){
            return i;
        }
    }
    return -1;
}
