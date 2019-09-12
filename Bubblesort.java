public class Bubblesort{
    void bubblesort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }
        }

    }
    void printarr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Bubblesort obj = new Bubblesort();
        int arr[] = {20,12,13,28,2};
        obj.bubblesort(arr);
        System.out.println("Sorted array: ");
        obj.printarr(arr);
        
    }
}
