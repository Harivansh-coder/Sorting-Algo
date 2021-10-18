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


a = [2,1,4,3,5,7,1,2,5,6,7,8,5,2,3]

bubblesort(a)


"""
# Output

    [1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 7, 8]
"""





