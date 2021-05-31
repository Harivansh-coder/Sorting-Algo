#QUICKSORT IMPLEMENTED IN PYTHON

def partition(arr,start,end):
    pindex = start
    pivot = arr[end]
    for i in range(start,end):
        if pivot >= arr[i]:
            temp = arr[i]
            arr[i] = arr[pindex]
            arr[pindex] = temp
            pindex += 1
    temp = arr[pindex]
    arr[pindex] = pivot
    arr[end] = temp

    return pindex

def quicksort(arr,start,end):
    if start < end:
        pindex = partition(arr,start,end)
        quicksort(arr,start,pindex-1)
        quicksort(arr,pindex+1,end)




a = [1,5,2,3,6,1,0,5]

quicksort(a,0,len(a)-1)

print(a) 
