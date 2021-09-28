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
var arr = [20,3,1,4,5,2,6,9,7,8,2,3,5];
insertionSort(arr);
console.log(arr);


/*
# Output
  [ 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 20 ]
*/
