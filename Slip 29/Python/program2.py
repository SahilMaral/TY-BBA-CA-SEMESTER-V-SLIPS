my_dict = {'apple': 5, 'banana': 3, 'cherry': 7, 'date': 1}

s1 = dict(sorted(my_dict.items()))
s2 = dict(sorted(my_dict.items(), reverse=True))
s3 = dict(sorted(my_dict.items(), key=lambda item: item[1]))
s4 = dict(sorted(my_dict.items(), key=lambda item: item[1], reverse=True))

print("Sorted by key ascending: ", s1)
print("Sorted by key descending: ", s2)
print("Sorted by value ascending: ", s3)
print("Sorted by value descending: ", s4)
