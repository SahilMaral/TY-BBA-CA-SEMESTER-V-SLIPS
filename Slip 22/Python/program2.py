def bubble_sort(list1):
  n = len(list1)
  for i in range(n+1):
    for j in range(0, n-i-1):
      if list1[j] > list1[j+1]:
        list1[j], list1[j+1] = list1[j+1], list1[j]
  return list1
list1 = [34, 76, 90, 12, 32, 44, 55]
print(bubble_sort(list1))
