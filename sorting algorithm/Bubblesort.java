/*
Bubble sort implementation in java
*/

public class Bubblesort {

    int z = 0;

    void bsort(int[] arr){
        for (int i= 0; i < arr.length;i++){
            for (int j = 0; j < arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {

        Bubblesort bs = new Bubblesort();

        int[] a = {2,1,4,3,5,7,10,3,5,6,64,6,622,1,5};

        bs.bsort(a);

        for (int i : a){
            System.out.print(i+"  ");
        } 
    }
    
}

/*
# Output

1  1  2  3  3  4  5  5  5  6  6  7  10  64  622 

*/
