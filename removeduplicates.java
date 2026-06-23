public class removeduplicates {
    public static void main(String[] args) {
        int arr[]= {1,2,2,3,3,4,4,4,5,5,7,8};
        int n = arr.length;
        int temp[] = new int[n];
    
    int i =0;
    for(int j=0; j<n-1; j++){
        if(arr[j] != arr[j+1]){
            temp[i++] = arr[j];
        }
    }
    temp[i] = arr[n-1];
    for(int k=0; k<=i; k++){
        System.out.print(temp[k] + " ");
    }
}
}

