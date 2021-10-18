#!/usr/bin/env bash

# Insertion sort implementation in bash

arr=(7 5 6 4 8 9 2 8 9 7 8 9)


index=1

while [[ $index -lt ${#arr[@]} ]]; do
  key=${arr[index]}
  j="$(($index-1))"

  while [[ $j -ge 0 && $key -gt ${arr[j]} ]]; do
    arr["$(($j+1))"]=${arr[j]}
    ((j--))
  done
  arr["$(($j+1))"]=$key

  ((index++))
done


echo "sorted array: ${arr[@]}"



# Output
# sorted in reverse order
# sorted array: 9 9 9 8 8 8 7 7 6 5 4 2
