//QUCIKSORT IMPLEMENTED IN JAVA 


class quick_sort{


    void swap (int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;   
    }

    int partition(int[] arr,int start,int end){

        int pivot = arr[end];
        int pindex = start;


        for (int i = start; i < end; i++){
            if (arr[i] <= pivot){
                swap(arr, i, pindex);
                pindex++;
            }
        }
        
        swap(arr, end, pindex);


        return pindex;


    }

    void quicksort(int[] arr,int start,int end){

        if (start < end){
            int pindex = partition(arr, start, end);
            quicksort(arr,start, pindex-1);
            quicksort(arr, pindex+1, end);

        }

        

    }
    public static void main(String[] args) {

        int[] a = {3,2,5,6,4,2,0,1};

        quick_sort qs = new quick_sort();

        qs.quicksort(a, 0, a.length-1);

        for (int i : a){
            System.out.print(i+" ");
        }
        
    }
}
/*
# Output

    0 1 2 2 3 4 5 6 

*/