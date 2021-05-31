//MERGE SORT IMPLEMENTED IN JAVA


public class merge_sort{

    

    public void sort(int arr[], int l, int r){

        int m;

        if (l < r){

            
            
            m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            
            //FOR THE SUB_ARRAYS ARRAYS
            
            int n1 = m + 1 - l;
            int n2 = r - m;

            int[] lef = new int[n1];
            int[] rig = new int[n2];

            for (int i = 0; i < n1; i++){
                lef[i] = arr[l + i];
            }

            for (int i = 0; i < n2; i++){
                rig[i] = arr[m + 1 + i];
            }

            // sort(lef);
            // sort(rig);

            //MERGE SORT CONDITION

            int i = 0, j = 0,k = l;

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
                k++;
            }

            while (j < rig.length){
                arr[k] = rig[j];
                j++;
                k++;
            }

        }

    }

    public static void main(String[] args) {

        merge_sort ms = new merge_sort();

        int[] a = {1,5,2,3,4,0};
        ms.sort(a, 0 a.length - 1);

        for (int i : a){
            System.out.print(i+" ");
        }
    }

}
