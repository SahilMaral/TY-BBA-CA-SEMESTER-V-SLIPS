tup1 = (1,2,3,4)
tup2 = (5,6,7,8)
tup3 = (9,10,11,12)

print("Original list")

print(tup1)
print(tup2)
print(tup3)

print("Sum of tuples: ",tuple(map(sum,zip(tup1,tup2,tup3))))
