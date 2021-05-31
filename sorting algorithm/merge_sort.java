//MERGE SORT IMPLEMENTED IN JAVA


public class merge_sort{

    

    public void sort(int arr[]){

        int l,r,m;

        if (arr.length > 1){

            //FOR THE SUB_ARRAYS ARRAYS
            
            m = (arr.length) / 2;

            int n1 = m;
            int n2 = arr.length - m; 

            int[] lef = new int[n1];
            int[] rig = new int[n2];

            for (int i = 0; i < n1; i++){
                lef[i] = arr[i];
            }

            for (int i = 0; i < n2; i++){
                rig[i] = arr[i+n2];
            }

            // sort(lef);
            // sort(rig);

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

        merge_sort ms = new merge_sort();

        int[] a = {1,5,2,3,4,0};
        ms.sort(a);

        for (int i : a){
            System.out.print(i+" ");
        }
    }

}
