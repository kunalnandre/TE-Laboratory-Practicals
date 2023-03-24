def selection_sort_greedy(arr):
    n = len(arr)
    print("\nList before Sorting: ", arr,"\n")
    for i in range(n):
        min_idx = i
        for j in range(i+1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
        print("List After Pass ",i+1,": ",arr)
    return arr

n=int(input("Length of List: "))
arr=[]
for i in range(n):
    element=int(input("Enter List Element: "))
    arr.append(element)
print("\nSorted List is:", selection_sort_greedy(arr))
