/*
Implementation of insertion sort in javascript.
*/

function insertionSort(arr) {
  for (var i = 1; i < arr.length; i++) {
    var key = arr[i];
    var j = i - 1;
    while (j >= 0 && key < arr[j]) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = key;
  }
}

// testing the sort function
var arr = [45, 97, 5, 16, 83, 97, 4, 43, 79, 55, 12, 25, 21, 99, 24, 43, 73, 13, 92, 50, 79, 20, 62,
  15, 93, 35, 94, 28, 92, 77, 45, 60, 62, 44, 8, 26, 1, 13, 12,
  40, 49, 33, 9, 13, 11, 96, 79, 7, 42, 77, 55, 31, 14, 93, 19, 68, 3];


insertionSort(arr);
console.log(arr);


/*
# Output

[ 1,3,4,5,7,8,9,11,12,12,13,13,13,14,15,16,19,20,21,24,25,26,
28,31,33,35,40,42,43,43,44,45,45,49,50,55,55,60,62,62,68,73,77,77,
79,79,79,83,92,92,93,93,94,96,97,97,99 ]
*/
