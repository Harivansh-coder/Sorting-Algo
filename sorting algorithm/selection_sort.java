//SELECTION SORT IMPLEMENTED IN JAVA

class selectionsort{

    void ssort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1;i++){
            int mini = i;

            //FIND THE MINIMUM FROM THE SUB-ARRAY
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static void main(String[] args) {

        int[] a = {45, 97, 5, 16, 83, 97, 4, 43, 79, 55, 12, 25, 21, 99, 24, 43, 73, 13, 92,
             50, 79, 20, 62, 15, 93, 35, 76, 72, 17, 16, 46, 73, 78, 27, 72, 71, 8, 49, 94, 
             95, 68, 49, 33, 32, 36, 9, 21, 20, 90, 59, 4, 18, 21, 55, 6, 86, 69, 59, 26, 
             24, 79, 38, 62, 85, 80, 45, 65, 78, 7, 53, 81, 65, 87, 14, 23, 36, 35, 3, 65,
              67, 87, 55, 69, 55, 38, 51, 14, 60, 12, 46, 69, 42, 59, 76, 90, 53, 9, 80, 41,
               52, 20, 54, 78, 40, 28, 37, 15, 21, 67, 30, 27, 35, 84, 54, 60, 82, 36, 98,
                38, 84, 44, 24, 95, 21, 13, 75, 36, 5, 85, 61, 41, 5, 10, 35, 59, 70, 38,
                 73, 94, 39, 73, 58, 96, 14, 71, 39, 88, 68, 96, 49, 94, 28, 92, 77, 45, 60,
                  62, 44, 8, 26, 1, 13, 12, 40, 49, 33, 9, 13, 11, 96, 79, 7, 42, 77, 55, 31,
                   14, 93, 19, 68, 3};

        selectionsort ss = new selectionsort();

        ss.ssort(a);

        for (int i : a){
            System.out.print(i+" ");

        }
        
        

    }
}