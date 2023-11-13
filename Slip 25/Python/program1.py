def count(str):
    upper = 0
    lower = 0
    for i in str:
        if i.isupper():
            upper += 1
        elif i.islower():
            lower += 1
    print("No. of Upper case characters :", upper)
    print("No. of Lower case Characters :", lower)
count('The quick Brow Fox')
