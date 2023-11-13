str1 = input("enter a string : ")
up = low = 0
for i in str1:  
    if i.isupper():
        up += 1
    elif i.islower():
        low += 1
print("No. of Upper case characters : ", up)
print("No. of Lower case characters : ", low)