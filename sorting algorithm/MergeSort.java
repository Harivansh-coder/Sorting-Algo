//MERGE SORT IMPLEMENTED IN JAVA

public class MergeSort{

    public void sort(int arr[]){


        if (arr.length > 1){

            //FOR THE SUB_ARRAYS ARRAYS
            
            int m = (arr.length) / 2;

            int n1 = m ;
            int n2 = arr.length - m; 

            int[] lef = new int[n1];
            int[] rig = new int[n2];

            for (int i = 0; i < n1; i++){
                lef[i] = arr[i];
            }

            for (int i = m; i < arr.length ; i++){
                rig[i - m] = arr[i];
            }

            sort(lef);
            sort(rig);

            //MERGE SORT CONDITION

            int i = 0, j = 0,k = 0;

            while (i < lef.length && j < rig.length){

                if (lef[i] > rig[j]){
                    arr[k] = rig[j];
                    j++;
                    
                }else {
                    arr[k] = lef[i];
                    i++;
                }
                k++;
                
            }
            
            while (i < lef.length){
                arr[k] = lef[i];
                i++;
            }

            while (j < rig.length){
                arr[k] = rig[j];
                j++;
            }

        }

    }

    public static void main(String[] args) {

        MergeSort ms = new MergeSort();

        int[] a = {1,5,2,3,4,2,1,5,2,3,4,2};

        ms.sort(a);

        for (int i : a){
            System.out.print(i+" ");
        }
    
    }
}
