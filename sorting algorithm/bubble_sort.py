#BUBBLE SORT IMPLEMENTED IN PYTHON



def bubblesort(arr):
    

    for i in range(len(arr)):
        y = True
        for j in range(len(arr)-1):

            if arr[j] > arr[j+1]:
                temp = arr[j+1]
                arr[j+1] = arr[j]
                arr[j] = temp
                y = False
            
        if (y):
             break
    print(arr)


a = [2,1,4,3,5,7]

bubblesort(a)





