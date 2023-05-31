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


# Output:

# Length of List: 6
# Enter List Element: 4
# Enter List Element: 5
# Enter List Element: 89
# Enter List Element: 56
# Enter List Element: 2
# Enter List Element: 55

# List before Sorting:  [4, 5, 89, 56, 2, 55] 

# List After Pass  1 :  [2, 5, 89, 56, 4, 55]
# List After Pass  2 :  [2, 4, 89, 56, 5, 55]
# List After Pass  3 :  [2, 4, 5, 56, 89, 55]
# List After Pass  4 :  [2, 4, 5, 55, 89, 56]
# List After Pass  5 :  [2, 4, 5, 55, 56, 89]
# List After Pass  6 :  [2, 4, 5, 55, 56, 89]

# Sorted List is: [2, 4, 5, 55, 56, 89]
